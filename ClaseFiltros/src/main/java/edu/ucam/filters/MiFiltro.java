package edu.ucam.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;


@WebFilter(urlPatterns = {"/secured/*"})

public class MiFiltro extends HttpFilter implements Filter {
       
   
    public MiFiltro() {
        super();
    }


	public void destroy() {

	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		
		System.out.println("Filtro ejecutado.");

		
		
		
		if (request instanceof HttpServletRequest) {
			
			if (((HttpServletRequest)request).getSession().getAttribute("LOGIN")==null){
				
				System.out.println("haz login");
				request.getRequestDispatcher("/destino.jsp").forward(request, response);
				
				/*
				 
				 Si el atributo "LOGIN" es nulo (el usuario no ha pasado por el ServletHola), 
				 el filtro le bloquea el paso, imprime "haz login" en la consola y lo reenvía obligatoriamente a la página /destino.jsp para que inicie sesión.
				
				*/
				
			}else {
				
				System.out.println("Está logueado");
				chain.doFilter(request, response);
				
				/*
				  
				 Si el atributo sí existe (porque el ServletHola se lo dio antes), el filtro dice "todo en orden", imprime "Está logueado" y ejecuta chain.doFilter(request, response);. 
				 Esta instrucción final es importantísima: es la que abre la puerta y deja que la petición continúe su viaje hacia la página protegida que el usuario quería ver originalmente.
				 
				 */
			}
		}else {
			chain.doFilter(request, response);
		}
	}

	
	
	
	
	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("Filtro activado.");
		
	}

}
