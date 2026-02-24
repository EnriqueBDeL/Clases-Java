package edu.ucam.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletContext; /* Para guardar la información a nivel de contexto*/
import jakarta.servlet.http.HttpSession; /* Para comparar los inicios de sesión */

import java.io.IOException;

/**
 * Servlet implementation class Contador
 */

@WebServlet(urlPatterns = { "/contador"}, description = "Este es un servlet de bienvenida", name = "contador") 
public class Contador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contador() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
    
 
    
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ejecutado init");
		// TODO Auto-generated method stub
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/*sirve para contar los accesos al servlet globales*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int contadorSesion = 0;
		
//SESIÓN		
		if (request.getSession().getAttribute("ATR_CONTADOR") != null) {
			
			/*
			 * Revisa la "memoria privada" (Sesión) exclusiva del navegador que está visitando la página. 
			 * Pregunta si ya existe un dato guardado con la etiqueta "ATR_CONTADOR".
			 */
			
			contadorSesion = (int)request.getSession().getAttribute("ATR_CONTADOR"); // Si el dato ya existía, saca ese número y se lo asigna a nuestra variable.
			
		} //ATR_CONTADOR la etiqueta es la que decidamos.		
		
		request.getSession().setAttribute("ATR_CONTADOR", ++contadorSesion); //Le suma 1 al número (++) y lo vuelve a guardar actualizado en la memoria privada de ese navegador específico.
		
		
		
		
		
		int contadorServlet = 0;	
		
//CONTEXTO 
		
		if (request.getServletContext().getAttribute("ATR_CONTADOR") != null) {
			
			/*
			 * Revisa la "memoria pública" (Contexto) del servidor. 
			 * Esta memoria es compartida; la ven todos los usuarios del mundo que entren a tu Servlet.
			 */
			
			contadorServlet = (int)request.getServletContext().getAttribute("ATR_CONTADOR"); // Si el dato ya existía, saca ese número y se lo asigna a nuestra variable.
			
		} //ATR_CONTADOR la etiqueta es la que decidamos.	
		
		
		request.getServletContext().setAttribute("ATR_CONTADOR", ++contadorServlet); //Le suma 1 y lo actualiza en la pizarra pública.

		
		
		response.getWriter()
	    .append("SESION:\n")
	    .append("La sesion guarda informacion especifica para un solo usuario o navegador. Si abres otro navegador diferente, este contador empezara de cero.\n")
	    .append("Contador Sesion: " + contadorSesion + "\n\n")
	    .append("CONTEXTO:\n")
	    .append("El contexto guarda informacion global para toda la aplicacion. Este contador es compartido por todos los usuarios que entren al Servlet.\n")
	    .append("Contador Contexto: " + contadorServlet + "\n");
		
		
	//------------------------------------------------------------------------------------------------------------------------------|	
		response.getWriter().append("\n\nForma de impresion usada por el profe:\n");
		
		response.getWriter().append("Contador sesion: " + contadorSesion + " | Contador contexto: " + contadorServlet);		
	//------------------------------------------------------------------------------------------------------------------------------|	
	
		
	}
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
