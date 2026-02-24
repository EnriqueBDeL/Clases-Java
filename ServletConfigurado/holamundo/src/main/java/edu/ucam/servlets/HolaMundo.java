package edu.ucam.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Servlet implementation class HolaMundo
 */

/*
*	urlPatterns = { "/holamundo", "/helloworld" }
*	Le indica al servidor que si un usuario entra en su navegador a tudominio.com/holamundo o tudominio.com/helloworld, debe ejecutar este código.
*
*	description y name: Son metadatos informativos que pueden ser leídos por el servidor de aplicaciones o por otras herramientas para identificar el Servlet
*/

@WebServlet(urlPatterns = { "/holamundo", "/helloworld" } , description = "Este es un servlet de bienvenida" , name = "holamundo") //Esta es la forma de configurar un Servlet
public class HolaMundo extends HttpServlet { //La clase hereda todas las capacidades para hablar el protocolo HTTP.
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolaMundo() {
        super();

	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException { 	//Este método solo se ejecuta una vez, justo cuando el servidor carga el Servlet en memoria por primera vez. Usualmente con la primera petición de un usuario.
																		// Sirve para inicializar cosas que tu Servlet va a necesitar siempre, como abrir una conexión a una base de datos o cargar archivos de configuración.
		System.out.println("Ejecutando init...");						

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 	//Se ejecuta cada vez que un cliente (como un navegador) hace una petición de tipo GET a la URL de tu Servlet. 
																															//(Una petición GET es lo que hace tu navegador cuando escribes una dirección web y le das a Enter).
		/*
			request: Contiene todo lo que el usuario envía (cabeceras, parámetros en la URL, etc.).
			
			response: Es el objeto que usas para armar lo que le vas a devolver al usuario.
		*/
		
		System.out.println("doGet...");

		response.getWriter().append("Served at: ").append(request.getContextPath()); 	//response.getWriter().append(...): Abre un canal de escritura hacia el navegador del cliente y le envía el texto "Served at: "
																					 	//append(request.getContextPath()): Envía el nombre de la aplicación web. Es decir, si tu app se llama "MiWeb", el navegador mostrará: Served at: /MiWeb.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // Se ejecuta cuando la petición HTTP es de tipo POST (esto ocurre generalmente cuando un usuario envía un formulario HTML con el atributo method="POST"
		
		this.doGet(request, response); //Si alguien me hace una petición POST, procésala exactamente igual que si fuera una petición GET
	}

}

