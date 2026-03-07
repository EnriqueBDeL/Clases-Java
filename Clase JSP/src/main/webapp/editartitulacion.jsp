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

<%


	Hashtable<String, Titulacion> titulaciones = (Hashtable<String, Titulacion>) this.getServletContext().getAttribute(ServletInsertarTitulacion.ATR_TITULACIONES);

	String paramId = request.getParameter("ID");

	Titulacion titulacion = titulaciones.get(paramId);

%>


Editar titulación<br>

<form action="editartitulacion" method="POST">
<input type="hidden" name="ID" value="<%= titulacion.getId() %>"><br>
Nombre:<input type="text" name="NOMBRE" value="<%= titulacion.getNombre() %>"><br>
<input type="submit">
</form>

</body>
</html>