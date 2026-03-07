<%@page import="edu.ucam.domain.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DAD2: p&aacute;gina destino</title>
</head>
<body>
JSP destino: <%= ((Usuario)request.getAttribute("USUARIO")).getNombre() %>
</body>
</html>