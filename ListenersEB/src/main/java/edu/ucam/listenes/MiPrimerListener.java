package edu.ucam.listenes;

import java.util.Hashtable;

import edu.ucam.domain.Titulacion;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;


@WebListener //Le dice a Tomcat que esta clase  no es un Servlet normal, sino un vigilante que debe arrancar automáticamente.
public class MiPrimerListener implements ServletContextListener, HttpSessionAttributeListener { //Necesario meter estas implementacioes.

 
    public MiPrimerListener() {
    }

	
    public void attributeReplaced(HttpSessionBindingEvent se)  { // Si modifica un dato que ya existía (attributeReplaced), imprimirá "atributo modificado".
    	System.out.println("✏️ [LISTENER] Atributo MODIFICADO en la sesión. Clave: " + se.getName()+"\n");   
    	
    }


    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    }


    public void contextInitialized(ServletContextEvent sce)  { // Este método salta SOLO UNA VEZ: exactamente en el milisegundo en que enciendes Tomcat.
    	         
         sce.getServletContext().setAttribute("TITULACIONES", new Hashtable<String, Titulacion>()); // Esto crea una memoria global que comparten TODOS los usuarios de tu web, no es individual como la Sesión.
         
     	System.out.println("✅ [LISTENER] Servidor arrancado. Caja de Titulaciones lista.\n");
         
    }

	
    public void contextDestroyed(ServletContextEvent sce)  { // Este método salta cuando apagas Tomcat. Aquí se suele poner código para cerrar conexiones a bases de datos, etc.
    	System.out.println("🛑 [LISTENER] Servidor apagado.\n");
    }


    public void attributeAdded(HttpSessionBindingEvent se)  { // Si un usuario guarda un dato nuevo en su sesión (attributeAdded), imprimirá "Atributo añadido".
    	
    	System.out.println("Atributo añadido");
    }
    
    
    
    
  
}
