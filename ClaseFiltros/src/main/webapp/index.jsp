<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Guia de Pruebas - Filtros</title>
    <style>
        body { 
            font-family: Arial, sans-serif; 
            line-height: 1.6; 
            color: #333; 
            max-width: 800px; 
            margin: 0 auto; 
            padding: 30px; 
            background-color: #f4f7f6; 
        }
        h1 { color: #2c3e50; border-bottom: 3px solid #3498db; padding-bottom: 15px; }
        h2 { color: #2980b9; margin-top: 0; border-bottom: 1px solid #eee; padding-bottom: 5px; }
        .seccion { background: #ffffff; padding: 20px 25px; margin-bottom: 25px; border-radius: 8px; box-shadow: 0 4px 6px rgba(0,0,0,0.05); }
        .preparacion { border-left: 5px solid #f39c12; }
        .prueba { border-left: 5px solid #3498db; }
        .url { background-color: #2c3e50; color: #ecf0f1; padding: 4px 8px; border-radius: 4px; font-family: monospace; font-size: 14px; }
        .consola { background-color: #1e1e1e; color: #4af626; padding: 10px; border-radius: 5px; font-family: monospace; margin-top: 10px; }
        .resultado { background-color: #e8f8f5; padding: 15px; border-left: 4px solid #1abc9c; margin-top: 15px; }
    </style>
</head>
<body>

    <h1>Guia de Pruebas: Filtros y Servlets</h1>

    <div class="seccion preparacion">
        <h2>[!] Preparacion Previa</h2>
        <ol>
            <li>Asegurate de que <b>Tomcat</b> esta arrancado en Eclipse.</li>
            <li>Abre la pestana <b>Console</b> en Eclipse y limpiala.</li>
            <li>Abre tu navegador web en una ventana de <b>INCOGNITO</b>.</li>
            <li>Averigua el nombre de tu proyecto en Eclipse (sustituye "TuProyecto" en las rutas).</li>
        </ol>
    </div>

    <div class="seccion prueba">
        <h2>Prueba 1: Comprobar el Guardian de Seguridad (MiFiltro)</h2>
        <p><b>Objetivo:</b> Ver como el filtro nos bloquea por no estar logueados.</p>
        <ol>
            <li>En el navegador, escribe la URL de la zona protegida: <br><br>
                <span class="url">http://localhost:8080/TuProyecto/secured/index.jsp</span>
            </li>
            <li>Pulsa Enter.</li>
        </ol>
        <div class="resultado">
            <b>Resultado Esperado:</b>
            <ul>
                <li>El navegador te mostrara la pantalla de "Acceso Denegado".</li>
                <li>La consola de Eclipse imprimira:</li>
            </ul>
            <div class="consola">
                Filtro ejecutado.<br>
                haz login
            </div>
        </div>
    </div>

    <div class="seccion prueba">
        <h2>Prueba 2: Comprobar el Observador (FiltroServlet)</h2>
        <p><b>Objetivo:</b> Ver como un filtro detecta que usamos el Servlet de login.</p>
        <ol>
            <li>En la pantalla de Acceso Denegado, haz clic en el boton "Iniciar Sesion Ahora".</li>
        </ol>
        <div class="resultado">
            <b>Resultado Esperado:</b>
            <ul>
                <li>El navegador te mostrara la pantalla de "Zona Segura".</li>
                <li>La consola de Eclipse imprimira:</li>
            </ul>
            <div class="consola">
                Filtro control Servlet ejecutado.
            </div>
        </div>
    </div>

    

</body>
</html>