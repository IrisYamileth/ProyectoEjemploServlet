<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--the above 3 meta tag must* come first in the head; any other head content must come *äfter* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="favicon.icon">
        <link rel="icon" href="ico/favicon.png">
        <title>Departamento de Recursos Humanos - My Company</title>
        <!--Boostrap core CSS -->
        <link href="css/boostrap.min_1.css" rel="stylesheet">
        <link href="css/bootstrap_1.css" rel="stylesheet">
        <!--custom styles for this template -->
        <link href="css/justified-nav.css" rel="stylesheet">
    </head>

    <body>
        <div>
            <!--the justified navigation menu is meant for single line per list item.Multiple lines will require customs code not provided by Bootstrap-->
            <div class="masthead">
                <h3 class="text-muted">My company</h3>  
                <nav>
                    <ul class="nav nav-justified">
                        <li><a href="#">Inicio</a></li>
                        <li><a href="#">Administracion</a></li>
                        <li><a href="#">Acerca</a></li>
                    </ul>
                </nav>
            </div>
        <!--Formulario para la busqueda. El formulario es enviado por POST al busquedaController-->
        <form method="post" action="#" class="navbar-form navbar-right" >
            <div class="form- group">
                <input type="text" name="query" required placeholder="Buscar oferta..." class="form-control">
            </div>
            <button type="submit" class="btn btn-success">Buscar</button>
        </form>
        
        <!--Jumbotron-->
        <div class="jumbotron">
            <h2>¡ENCUENTRA TU TRABAJO IDEAL!</h2>  
            <!--<h4>Estamos contratando</h4>  -->
            <p class="lead text-justify">Bienvenido a My Company.Aqui podras encontrar ofertas de empleo que sean adecuados a tu Perfil,
                experiencia y ubicacion.
                Es muy facil de usar, solo haz clic en una vacante, ingresa para ver los detalles y envianos tu CV en formato PDF o DOC. 
                Nostros revisaremos tu CV y posteriormente te contrataremos<br><br>
            <p><a class="btn btn-lg btn-success" href="#" role="button">Ver mas ofertas</a></p>
        </div>
        
        <h1>Ofertas recientes</h1> 
        <!--Example row of columns-->
        <div class="row">
            <div class="col-lg-4">
                <h2>Safari bug warning!</h2>
                <p class="text-danger text-justify">As of v8.0, Safari exhibits a bug in which resizing your browser horizontally
                <p class="text-justify">Donec id elit non mi porta gravida at eget metus.fusce dapibus,tellus ac cursus commodo,
                <p><a class="btn btn-primary" href="#"role="button">Views details &raquo;</a></p>
            </div>

            <div class="col-lg-4">
                <h2>Heading</h2>
                <p class="text-danger text-justify">As of v8.0, Safari exhibits a bug in which resizing your browser horizontally
                <p class="text-justify">Donec id elit non mi porta gravida at eget metus.fusce dapibus,tellus ac cursus commodo,
                <p><a class="btn btn-primary" href="#"role="button">Views details &raquo;</a></p>
            </div>
            <div class="col-lg-4">
                <h2>Heading</h2>
                <p class="text-danger text-justify">As of v8.0, Safari exhibits a bug in which resizing your browser horizontally
                <p class="text-justify">Donec sed odio dui. Cras justo odio, dapibus ac facilisis in,egestas eget quam. vestibulum
                <p><a class="btn btn-primary" href="#"role="button">Views details &raquo;</a></p>
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
