
package sv.irisgarcia.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RespuestaHTML extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //respuesta HTML
        response.setContentType("text/html;charset=UTF-8");
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Respuesta tipo HTML</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hemos recibido su información</h1>");
        out.println("<h2>Gracias por sus comentarios</h2>");
        
        /*  codigo para colocar un enlace que permita regresar al menu principal */
            out.println("<br>");
            out.println("<a href=\""); 
          /*permite que el servlet regrese a  /respuestasServlets */
            out.println(response.encodeURL ("/respuestasServlets")); 
            out.println("\">Regresar Menú</a>");
            
        out.println("</body>");
        out.println("</html>");

    }

   
}
