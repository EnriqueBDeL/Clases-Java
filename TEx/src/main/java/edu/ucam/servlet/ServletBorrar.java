package edu.ucam.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;

import edu.ucam.domain.Habitacion;


@WebServlet("/servletborrar")
public class ServletBorrar extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
  
    public ServletBorrar() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("ID");
		
		Hashtable<String, Habitacion> habitaciones = (Hashtable<String, Habitacion>)request.getServletContext().getAttribute("HABITACIONES");

		Habitacion habitacion = habitaciones.get(id);
		if(habitacion != null) {
			habitaciones.remove(id);
			System.out.println("Habitión eliminda.");
		}
		
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
