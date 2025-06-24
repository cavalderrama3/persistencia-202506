<%-- 
    Document   : subsidio_form
    Created on : 23/06/2025, 6:43:17 p. m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Subsidio</title>
        <link href="../libs/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="../libs/bootstrap/js/bootstrap.js" type="text/javascript"></script>
    </head>
    <body class="bg-light">
        <div class="container mt-5">
            <div class="card shadow">
                <div class="card-header bg-primary text-white">
                    <h2 class="card-title">Formulario Subsidio</h2>
                </div>
                <div class="card-body">
                    <form action="SubsidioServlet" method="post">

                        <div class="mb-3"><label>ID</label><input type="text" name="subsidio_id" class="form-control"></div>
                        <div class="mb-3"><label>Persona ID</label><input type="text" name="persona_id" class="form-control"></div>
                        <div class="mb-3"><label>Programa ID</label><input type="text" name="programa_id" class="form-control"></div>
                        <div class="mb-3"><label>Monto</label><input type="text" name="monto" class="form-control"></div>
                        <div class="mb-3"><label>Fecha Entrega</label><input type="date" name="fecha_entrega" class="form-control"></div>

                        <button type="submit" class="btn btn-success mt-3">Guardar</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
