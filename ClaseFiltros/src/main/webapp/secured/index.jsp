<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zona Segura</title>
<style>
    body { font-family: Arial, sans-serif; text-align: center; margin-top: 100px; background-color: #e4fce4; }
    .caja { background-color: white; padding: 40px; border-radius: 10px; display: inline-block; box-shadow: 0 4px 8px rgba(0,0,0,0.1); border-top: 5px solid #5cb85c; }
    h1 { color: #5cb85c; margin-top: 0; }
    p { color: #555; font-size: 18px; }
    .ruta { background-color: #eee; padding: 10px; border-radius: 5px; font-family: monospace; color: #333; margin-top: 20px; display: inline-block; }
</style>
</head>
<body>
    <div class="caja">
        <h1>✅ ¡Bienvenido a la Zona Segura!</h1>
        <p>El filtro <b>MiFiltro</b> ha comprobado tu sesión y te ha dejado pasar.</p>
        <p>¡Estás logueado con éxito!</p>
        
        <div class="ruta">Ruta actual: /secured/index.jsp</div>
    </div>
</body>
</html>