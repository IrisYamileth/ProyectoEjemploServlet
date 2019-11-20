
package sv.irisgarcia.servlets;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RespuestaImagen extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException,IOException {
        
        //respuesta imagen
        response.setContentType("image/jpeg");
        
        //extraer ruta 
        String pathToWeb = getServletContext().getRealPath("/");
        System.out.println(pathToWeb);
        //a ruta concatenar la el nombre de la imagen que se va enviar como respuesta
        File f = new File(pathToWeb + "images/tomcat_1.jpg");
        BufferedImage bi = ImageIO.read(f);
        OutputStream out = response.getOutputStream();
        ImageIO.write(bi, "jpg", out);
        out.close();
    }
}
