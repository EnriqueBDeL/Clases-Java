package edu.ucam.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;

import edu.ucam.domain.Habitacion;


@WebServlet("/ServletInsertar")
public class ServletInsertar extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
   
    public ServletInsertar() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("ID");
		String nombre = request.getParameter("NOMBRE");
		String camas = request.getParameter("CAMAS");
		String tipo = request.getParameter("TIPO");
		
		Hashtable<String, Habitacion> habitaciones = (Hashtable<String, Habitacion>)request.getServletContext().getAttribute("HABITACIONES");


		Habitacion habitacion = habitaciones.get(id);
		
		if(habitacion == null) {
			habitacion = new Habitacion(id,nombre, tipo, Integer.parseInt(camas));
			habitaciones.put(id, habitacion);
			System.out.println("Habitacion creada.");
		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
