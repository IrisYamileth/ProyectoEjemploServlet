/*
 Convertir clase a Servlets poniendo extends HttpServlet
 */
package sv.irisgarcia.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Daysi Sofia Garcia
 */
//Convertir clase HolaMundo a Servlets poniendo extends HttpServlet
public class HolaMundo extends HttpServlet {
//Presionar ctrl + Barra espaciadora para ver los metodos a los cuales tengo acceso al haber hecho el extends
    //generar metodo doGet para procesar peticiones Get
    //estas clases ya son servlet pero se deben configurar en el archivo WEB-INF crear el archivo 
    //dando clic izquierdo en WEB-INF new Standar Deployment Descriptor(web.xml)
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ejecutando metodo doGet");
    }

    //generar metodo doPost para procesar peticiones Post
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ejecutando metodo doPost");
    }
        
    
}
