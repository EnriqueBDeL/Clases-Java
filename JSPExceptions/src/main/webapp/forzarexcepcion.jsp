<%@ page import="java.util.Hashtable"%>

<!-- -------------------------------------------------------- -->
<%@ page errorPage="errorpage.jsp" %> <!-- Le dice a Tomcat que si mientras construyes esta página ocurre una excepción, inmediatamente manda al usuario a la página "errorpage.jsp" -->
<!-- -------------------------------------------------------- -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>DAD2: forzar error</title>
</head>




<body>

<%

	Hashtable tabla = null;  // Aquí estás provocando a propósito una excepción.
	
	tabla.get("");

// Creas una variable tabla y dices que no vale nada (null). Justo en la línea siguiente, intentas buscar algo dentro de ella con .get(""). 
// Explotará y lanzará un NullPointerException.

%>

</body>
</html>