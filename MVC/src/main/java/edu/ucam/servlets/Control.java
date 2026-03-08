package edu.ucam.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;

import edu.ucam.acciones.Accion;
import edu.ucam.acciones.BorrarTitulacion;
import edu.ucam.acciones.InsertarTitulacion;


@WebServlet("/control")
public class Control extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private Hashtable<String, Accion> acciones  = null;
       
	
	
	/*
	  
	  En lugar de tener un Servlet distinto para cada página web, tenemos una única 
	  puerta de entrada. Este controlador recibe la orden (?ACTION_ID=...) y decide 
	  qué clase Java debe ejecutar la lógica.
	  
	 
	 */
   
    public Control() {
        super();
    }
    
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		acciones = new Hashtable<String, Accion>();
		
		acciones.put("INSERTAR_TITULACION", new InsertarTitulacion());
		acciones.put("BORRAR_TITULACION", new BorrarTitulacion());
		
		super.init(config);
	}



	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramActionId = request.getParameter("ACTION_ID");
		
		Accion accion = acciones.get(paramActionId);
		accion.ejecutar(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
