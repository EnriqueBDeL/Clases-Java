package edu.ucam.controller;

import jakarta.ws.rs.GET;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import edu.ucam.ParserObject;
import edu.ucam.database.DataBase;
import edu.ucam.objetos.*;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/alumno") // @Path define la "URL base" o "dirección" a la que el cliente tiene que llamar. Ejemplo: "www.tuweb.com/alumno"
public class AlumnoController {


	
	
	@GET  //@GET indica que este método solo responderá si el cliente pide "leer" datos.
	@Path("/listado")    //@Path("/listado") se suma al path de la clase. Para llegar aquí, el cliente debe llamar a: "/alumno/listado"
	@Produces(MediaType.APPLICATION_JSON) //Sirve para indicarle tanto al servidor como al cliente que los datos devueltos por ese método se envían exclusivamente en formato JSON.
	public Response listado() { //"Response" es la clase estándar de Java que permite que tu código hable e HTTP, permitiéndote enviar no solo datos, sino también el estado y la configuración de esa respuesta.
		
		JSONObject respuestaAlumnos = new JSONObject(); // Crea un objeto JSON vacío. Este será el "paquete" principal que devolveremos.
		
		for(Alumno alu : DataBase.listaAlumnos) {
			JSONObject alumnoJSON = new JSONObject();
			alumnoJSON.put("id", alu.getId());
			alumnoJSON.put("nombre", alu.getNombre());
			alumnoJSON.put("apellido1", alu.getApellido1());
			respuestaAlumnos.append("alumnos", alumnoJSON); // Añadimos este minipaquete a una lista llamada "alumnos" dentro del paquete principal.
		}
		
		System.out.println("EN el metodo");
		
		return Response.status(200).entity(respuestaAlumnos.toString()).build();
		// Se construye y se envía la respuesta al cliente.
		// status(200) significa "OK, todo ha ido bien".
		// entity(...) es el cuerpo del mensaje, donde metemos el paquete JSON convertido a texto.
	}
	
	
	
	
	@DELETE    //@DELETE indica que este método se usa para borrar recursos.
	@Path("/{id}")  //El {id} entre llaves es una "variable de ruta". Significa que el cliente enviará un número en la URL (ej: /alumno/5) y capturaremos ese 5.
	public Response borraAlumno(@PathParam("id") int idAlumno) { // @PathParam("id") coge ese '5' de la URL y lo mete en la variable 'idAlumno' de Java.
		for(Alumno alu : DataBase.listaAlumnos) {
			if(alu.getId() == idAlumno) {
				DataBase.listaAlumnos.remove(alu);
				return Response.status(200).entity(true).build();
			}
		}
		
		return Response.status(401).entity(false).build();
		
	}
	
	@POST // @POST indica que este método sirve para crear o insertar datos nuevos.
	@Produces(MediaType.APPLICATION_JSON) // Va a devolver un JSON
	@Consumes(MediaType.APPLICATION_JSON) // Va a recibir un JSON
	public Response alta(InputStream inputStream) { // Recibe un InputStream, que es el "flujo de datos en bruto" que llega por internet.
		BufferedReader bReader = new BufferedReader(new InputStreamReader(inputStream));
		StringBuilder sb = new StringBuilder();
		String linea = "";
		try {
			while((linea = bReader.readLine()) != null) { // Lee línea a línea hasta que no haya más texto.
				sb.append(linea); // Va uniendo los trozos de texto.
			}
		} catch (IOException e) {
			return Response.status(500).entity(true).build();
		}
		
		
		JSONObject jsonRecibido = new JSONObject(sb.toString()); // Aquí convertimos todo ese texto gigante que hemos leído en un objeto JSON manejable.
		Alumno alumno = new Alumno();

		if(jsonRecibido.has("id") && !(jsonRecibido.getString("id").isEmpty())) {
			System.out.println("NO ES UNA ALTA, es una moidifcacion");
			return Response.status(409).entity(false).build();
		} else {
			alumno.setId(siguienteId());
			alumno.setNombre(jsonRecibido.getString("nombre"));
			alumno.setApellido1(jsonRecibido.getString("apellido1"));
		}
		
		DataBase.listaAlumnos.add(alumno);
		
		JSONObject respuestaJSON = new JSONObject();
		JSONObject alumnoJSON = new JSONObject();
		alumnoJSON.put("id", alumno.getId());
		alumnoJSON.put("nombre", alumno.getNombre());
		alumnoJSON.put("apellido1", alumno.getApellido1());
		respuestaJSON.put("alumno", alumnoJSON);
		
		return Response.status(200).entity(respuestaJSON.toString()).build();
	}
	
	private int siguienteId() {
		int maximo=0;
		
		for(Alumno alu: DataBase.listaAlumnos) {
			if(alu.getId() > maximo)
				maximo = alu.getId();
		}
		
		return ++maximo;
	}
}
