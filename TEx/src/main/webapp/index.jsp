<%@page import="java.util.Hashtable"%>

<%@page import="edu.ucam.domain.Habitacion"%>

<%@taglib uri="mistags" prefix="dad2" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Ejemplo Examen</title>
</head>


<body>

<h2>Gestión de habitaciones:</h2><br>


<form action = "ServletInsertar" method="POST">
ID:<input type ="text" name="ID"><br>
Nombre:<input type="text" name="NOMBRE"><br>
Tipo:<input type="text" name="TIPO"><br>
Camas:<input type="text" name="CAMAS"><br>
<input type="submit"><br>

</form>


<br><br>

<h3>Listado de habitaciones:</h3>


<%
	Hashtable<String, Habitacion> habitaciones = (Hashtable<String, Habitacion>)request.getServletContext().getAttribute("HABITACIONES");

	if (habitaciones != null){
		
		for(Habitacion habitacion : habitaciones.values()){
			out.println("<br>" + habitacion.getId() + " - " + habitacion.getNombre() + " - Tipo: " + habitacion.getTipo()  + " - " + 
		habitacion.getCamas() + " camas");

			%>
			
			<a href="servletborrar?ID=<%= habitacion.getId() %>">Borrar</a>			
			
			<%
			
			if(habitacion.isReservada()){
				%>
				
				<a href="servletcambiarestado?ID=<%= habitacion.getId() %>">Liberar</a>			
				
				<%
				
			}else{
				%>
				
				<a href="servletcambiarestado?ID=<%= habitacion.getId() %>">Reservar</a>			
				
				<%
				
			}
		}	
	}
%>


<br><br>Listado con etiqueta<br>

<dad2:listar/>

</body>


</html>