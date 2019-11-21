<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
    <center>
        <h2>Login</h2>
        <br>
        <img src='images/login.png'><br>
        <br>
        <!--1. Enviamos datos (peticion POST) -->
        <form action="login" method="post">
            <br>
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type='text' name='name' required=""/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type='password' name='password' required=""/></td>
                </tr>
                <tr>
                    <td colspan="2"><input name='submit' type="submit" value="Login" /></td>
                </tr>
            </table>            
        </form>
    </center>
</body>
</html>
