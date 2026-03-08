package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "miservlet" , urlPatterns = {"/servlethola"} )
public class ServletHola extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       

    public ServletHola() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		request.getSession().setAttribute("LOGIN", true); // Busca tu sesión actual en el servidor y crea una variable llamada "LOGIN" y le asignas el valor true dentro de esa sesión.
		
		request.getRequestDispatcher("/secured/index.jsp").forward(request, response);
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
