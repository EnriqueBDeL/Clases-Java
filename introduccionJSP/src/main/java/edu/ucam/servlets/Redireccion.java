package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/redireccion")
public class Redireccion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Redireccion() {
        super();
    }


    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("servlet ejecutado");
		
		request.getRequestDispatcher("destino.jsp").forward(request, response);
		
		// request.getRequestDispatcher("destino.jsp") --> Pide al servidor que localice y prepare el el recurso "destino.jsp" que se encntra dentro de tu aplicación web.
		
		// forward(request, response) --> Toma los objetos originales de la petición (request) y de la respuesta (response) que recibió el Servlet, y se los entrega intactos al JSP.
		
		
	}

	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
