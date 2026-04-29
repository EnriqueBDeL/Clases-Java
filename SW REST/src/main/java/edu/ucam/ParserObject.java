package edu.ucam;

import org.json.JSONObject;

import edu.ucam.objetos.Alumno;

public class ParserObject {
	
	
	 // Clase  encargada de transformar (Parser) datos de alumnos entre formato JSON y objetos Java (Alumno) .
	

	public static Alumno JSONToAlumno(JSONObject alumnoJson) { // Pasa de JSON a Alumno
		Alumno alumno = new Alumno();
		
		return alumno;
	}
	
	public static JSONObject AlumnoToJSON(Alumno alu) { // Pasa de Alumno a JSON
		JSONObject jsonObject = new JSONObject();
		
		return jsonObject;
	}
}
