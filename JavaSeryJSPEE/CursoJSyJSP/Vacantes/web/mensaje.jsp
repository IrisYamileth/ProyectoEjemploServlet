<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--the above 3 meta tag must* come first in the head; any other head content must come *äfter* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="ico/favicon.png">
        <title>Administracion del sistema</title>
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
                <h3 class="text-muted">My company - Administracion</h3>  
                <nav>
                    <ul class="nav nav-justified">
                        <li><a href="#">Crear Vacantes</a></li>
                        <li><a href="#">Vacantes</a></li>
                        <li><a href="#">Salir</a></li>
                    </ul>
                </nav>
            </div>
            <br>

            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Sistema</h3> 
                </div>
                <!--Usando expresion Language este atributo se esta compartiendo en el servlet linea 49 de VacanteController-->
                <div class="panel-body">
                    <h4>${message}</h4> 
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

