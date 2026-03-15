<%@page import="java.util.Hashtable"%>
<%@page import="edu.ucam.domain.Titulacion"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Añadir Titulaciones</title>
</head>
<body>

    <h1>Gestor de Titulaciones</h1>
    
    <%
        // 1. Recuperamos la "caja" global de titulaciones
        Hashtable<String, Titulacion> tabla = (Hashtable<String, Titulacion>) request.getServletContext().getAttribute("TITULACIONES");
        
        int cantidad = 0;
        if (tabla != null) {
            cantidad = tabla.size();
        }
    %>
    
    <p>Total de titulaciones guardadas: <b><%= cantidad %></b></p>

    <h3>Titulaciones Registradas:</h3>
    <ul>
        <%
            // Comprobamos que la tabla exista y no esté vacía
            if (tabla != null && !tabla.isEmpty()) {
                
                // Recorremos todos los objetos Titulacion que hay dentro de la Hashtable
                for (Titulacion t : tabla.values()) {
        %>
                    <li>
                        <b>ID:</b> <%= t.getId() %> | <b>Nombre:</b> <%= t.getNombre() %>
                    </li>
        <%
                }
            } else {
        %>
                <li><i>Todavía no hay ninguna titulación guardada.</i></li>
        <%
            }
        %>
    </ul>
    <hr> 

    <h3>Añadir Nueva Titulación:</h3>
    
    <form action="<%= request.getContextPath() %>/AddAtributoASesion" method="POST">
        
        ID de la Titulación: 
        <input type="text" name="idTitulacion" required>
        <br><br>
        
        Nombre de la Titulación: 
        <input type="text" name="nombreTitulacion" required>
        <br><br>

        <input type="submit" value="Guardar en el Servidor">
        
    </form>

</body>
</html>