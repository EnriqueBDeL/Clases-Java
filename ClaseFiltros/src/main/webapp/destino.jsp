<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Acceso Denegado</title>
<style>
    body { font-family: Arial, sans-serif; text-align: center; margin-top: 100px; background-color: #fce4e4; }
    .caja { background-color: white; padding: 40px; border-radius: 10px; display: inline-block; box-shadow: 0 4px 8px rgba(0,0,0,0.1); }
    h1 { color: #d9534f; margin-top: 0;}
    p { color: #555; font-size: 18px; }
    .boton { display: inline-block; padding: 12px 24px; background-color: #0275d8; color: white; text-decoration: none; border-radius: 5px; font-weight: bold; margin-top: 20px; transition: 0.3s; }
    .boton:hover { background-color: #025aa5; }
</style>
</head>
<body>
    <div class="caja">
        <h1>🔒 Acceso Denegado</h1>
        <p>El filtro <b>MiFiltro</b> ha bloqueado tu paso.</p>
        <p>No tienes permiso para ver la zona segura porque no has iniciado sesión.</p>
        
        <a href="<%= request.getContextPath() %>/servlethola" class="boton">Iniciar Sesión Ahora</a>
    </div>
</body>
</html>