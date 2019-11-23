<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--the above 3 meta tag must* come first in the head; any other head content must come *äfter* these tags -->
        <link rel="icon" href="ico/favicon.png">
        <title>Departamento de Recursos Humanos - My Company</title>
        <!--Boostrap core CSS -->
        <link href="css/boostrap.min_1.css" rel="stylesheet">
        <link href="css/bootstrap_1.css" rel="stylesheet">
        <!--custom styles for this template -->
        <link href="css/justified-nav.css" rel="stylesheet">
    </head>

    <body>
        <div class="container">
            <!--the justified navigation menu is meant for single line per list item.Multiple lines will require customs code not provided by Bootstrap-->
            <div class="masthead">
                <h3 class="text-muted">My company - Administración</h3>  
                <nav>
                    <ul class="nav nav-justified">
                        <li><a href="#">Crear Vacante</a></li>
                        <li><a href="#">Vacantes</a></li>
                        <li><a href="#">Salir</a></li>
                    </ul>
                </nav>
            </div>
            <br>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Crear Vacante</h3>  
                </div>
                <div class="panel-body">
                    <!--Formulario para la busqueda. El formulario es enviado por POST al busquedaController-->
                    <form method="post" action="vacante">
                        <div class="form- group">
                            <label for="nombre">Nombre</label>
                            <input type="text" name="nombre" required id="nombre" value="" class="form-control" placeholder="Escriba el nombre de la vacante"><br>
                        </div>
                        <div class="form- group">
                            <label for="nombre">Descripcion</label>
                            <textarea type="text" name="descripcion" required rows="3" id="descripcion" class="form-control" placeholder="Escriba una descripcion de la vacante"></textarea><br>
                        </div>
                        <div class="form- group">
                            <label for="nombre">Escriba los detalles</label>
                            <textarea type="text" name="detalle" required rows="4" id="detalle" class="form-control" placeholder="Escriba los detalles de la vacante"></textarea><br>
                        </div>
                        <button type="submit" class="btn btn-default">Guardar</button>
                    </form>
                </div>
            </div>

            <!--Site footer-->
            <center>
                <footer class="footer">
                    <p>&copy;2019 My Company, Inc</p>
                </footer>
            </center>

        </div><!--/container-->
    </body>
</html>
