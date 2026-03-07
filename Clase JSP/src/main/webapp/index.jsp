<%@page import="edu.ucam.servlets.ServletInsertarTitulacion"%>
<%@page import="edu.ucam.domain.Titulacion"%>
<%@page import="java.util.Hashtable"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>DAD2</title>
</head>

<body>

Insertar titulación<br>

<form action="insertartitulacion" method="POST">	<!--  Crea un formulario con metodo de envio HTTP POST, que envia la información a "insertartitulacion". -->
ID:<input type="text" name="ID"><br>  				<!-- Crea un cuadro de texto. -->
Nombre:<input type="text" name="NOMBRE"><br>
<input type="submit">
</form>


<br>

<i><%=(request.getAttribute(ServletInsertarTitulacion.MSG)==null)?"":request.getAttribute(ServletInsertarTitulacion.MSG)%></i>
<!--  Esto es un if/else complejo en una sola liena. -->
<!--  Comprueba si el Servlet envió algún mensaje de error o éxito en el atributo de la petición. -->

<!--  <i> imprime el texto en cursiva. -->

<br>



<h2>Listado titulaciones</h2>



<%

	Hashtable<String, Titulacion> titulaciones = (Hashtable<String,Titulacion>) request.getServletContext().getAttribute(ServletInsertarTitulacion.ATR_TITULACIONES);

	// Obtiene la colección (Hashtable) de titulaciones desde el Contexto de la Aplicación (ServletContext).
	// El ServletContext es la memoria global, por lo que estos datos son compartidos por todos los usuarios de la web.

	
	
	if (titulaciones != null && titulaciones.size() > 0){
		
		for(Titulacion titulacion : titulaciones.values()){
%>
	
		<%= titulacion.getId() %> - <%= titulacion.getNombre() %>
		
		<a href="editartitulacion.jsp?<%= ServletInsertarTitulacion.PARAM_ID %>=<%= titulacion.getId() %>">[Editar]</a> <!-- Te redirige a otra página visual "editartitulacion.jsp" y se lleva consigo el "ID" para que esa nueva página sepa qué datos tiene que cargar en su formulario. -->
		
		<a href="borrartitulacion?ID=<%= titulacion.getId() %>">[Borrar]</a> <br> <!-- A diferencia del boton editar, este solo te lleva a ServletBorrarTitulacion.  -->
		
<% 		
		} 
		
	}else{
		out.println ("No hay titulaciones");
	}
%>

</body>
</html>