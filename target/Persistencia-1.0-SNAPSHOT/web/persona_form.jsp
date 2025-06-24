<%-- 
    Document   : persona_form
    Created on : 23/06/2025, 6:41:12 p. m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Persona</title>
        <link href="../libs/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="../libs/bootstrap/js/bootstrap.js" type="text/javascript"></script>
    </head>
    <body class="bg-light">
        <div class="container mt-5">
            <div class="card shadow">
                <div class="card-header bg-primary text-white">
                    <h2 class="card-title">Formulario Persona</h2>
                </div>
                <div class="card-body">
                    <form action="PersonaServlet" method="post">

                        <div class="mb-3"><label>ID</label><input type="text" name="persona_id" class="form-control"></div>
                        <div class="mb-3"><label>Nombre</label><input type="text" name="nombre" class="form-control"></div>
                        <div class="mb-3"><label>Ubicación</label><input type="text" name="ubicacion" class="form-control"></div>
                        <div class="mb-3"><label>Género</label><input type="text" name="genero" class="form-control"></div>
                        <div class="mb-3"><label>Origen Étnico</label><input type="text" name="origen_etnico" class="form-control"></div>
                        <div class="mb-3"><label>Nivel de Pobreza</label><input type="text" name="nivel_pobreza" class="form-control"></div>
                        <div class="mb-3"><label>Ingresos</label><input type="text" name="ingresos" class="form-control"></div>
                        <div class="mb-3"><label>Discapacidad</label><input type="text" name="discapacidad" class="form-control"></div>

                        <button type="submit" class="btn btn-success mt-3">Guardar</button>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>
