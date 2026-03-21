package edu.ucam.listeners;

import java.util.Hashtable;

import edu.ucam.domain.Habitacion;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


@WebListener
public class InicializarContexto implements ServletContextListener {

  
    public InicializarContexto() {
    	
    }

	
    public void contextInitialized(ServletContextEvent sce)  
    { 
    	System.out.println("Inicializamos contexto...");
        
        Hashtable<String, Habitacion> habitaciones = new Hashtable<>();
        
        habitaciones.put("1", new Habitacion("1", "Habitación 1", "Doble", 2));
        
        sce.getServletContext().setAttribute("HABITACIONES", habitaciones);
    }

	
    
    public void contextDestroyed(ServletContextEvent sce)  { 

    }
	
}
