package edu.ucam.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;


@WebFilter(servletNames = { "miservlet" }) // Este filtro está configurado para vigilar exclusivamente a un Servlet con el nombre "miservlet".
public class FiltroServlet extends HttpFilter implements Filter {
       
 
    public FiltroServlet() {
        super();

    }


	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Filtro control Servlet ejecutado.");
		//Este filtro no hace nada en especial. Solo imprime el mensaje cuando se ejecuta el Servlet.
		chain.doFilter(request, response);
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
