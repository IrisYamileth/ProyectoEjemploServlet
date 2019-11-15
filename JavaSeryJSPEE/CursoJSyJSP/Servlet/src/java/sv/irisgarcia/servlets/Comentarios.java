/*
 creacion de servlet con el asistente
 */
package sv.irisgarcia.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Comentarios extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //para mandar parametros a una URL Se pone signo de interrogacion y despues se ponen los parametros 
        //ejemplo http://localhost:8080/servlets/comentarios?name=alonso&perfil=admin&id=4852

        //1. recibimos los parametros del formulario
        String name = request.getParameter("name");
        String perfil = request.getParameter("perfil");
        String id = request.getParameter("id");

        //2 aplicamos las reglas del negocio con la informacion enviada por el usuario
        //en este caso solo se van imprimir en pantalla, pero una regla de negocio podria ser guardar datos en bd
        //hacer calculos con los datos, etc.
        System.out.println("Name " + name);
        System.out.println("Perfil " + perfil);
        System.out.println("Id " + id);

        //3. siempre regresamos una respuesta al cliente.en este caso en un documento HTML
        if (perfil.equals("admin")) {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Comentarios</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h3>Acceso concedido</h3>");
                out.println("</body>");
                out.println("</html>");
            }
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }

    @Override
    //HttpServletRequest request es la peticion
    //HttpServletResponse response es la respuesta
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //1. recibimos los parametros del formulario
        //el valor entre parentesis es el que se declara en el archivo comentarios.html
        //en el formulario en el atributo name de cada valor ("name")
        String nombreParam = request.getParameter("nombre");
        String emailParam = request.getParameter("email");
        String gradoParam = request.getParameter("grado");
        String comentariosParam = request.getParameter("comentarios");

        //2 aplicamos las reglas del negocio con la informacion enviada por el usuario
        //en este caso solo se van imprimir en pantalla, pero una regla de negocio podria ser guardar datos en bd
        //hacer calculos con los datos, etc.
        System.out.println("Name " + nombreParam);
        System.out.println("Perfil " + emailParam);
        System.out.println("Id " + gradoParam);
        System.out.println("Id " + comentariosParam);

        //3. siempre regresamos una respuesta al cliente.en este caso en un documento HTML
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Comentarios</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Gracias por tus comentarios "+ nombreParam + "</h3>");
            out.println("<h4>En breve nos comunicaremos contigo </h4>");
            out.println("</body>");
            out.println("</html>");
        }
    }
// </editor-fold>

}
