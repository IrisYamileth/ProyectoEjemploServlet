
package sv.irisgarcia.servlets;

import sv.irisgarcia.model.Producto;
import sv.irisgarcia.model.ProductoDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CatalogoProductos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //inidcar al navegador web el tipo de respuesta que se va enviar al servidor web
        //Respuesta seria pagina HTML 
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Catalogo de Productos</title>");
            out.println("<meta charset= 'UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Catalogo de productos</h3>");
            
            out.println("<table border='1' style='width:100%; '>");
            
            out.println("<tr>");            
            out.println("<th>Id</th>");
            out.println("<th>Categoria</th>");
            out.println("<th>Nombre</th>");
            out.println("<th>Precio</th>");
            out.println("</tr>");
            
            //Generamos contenido HTML dinamico
            ProductoDB db = new ProductoDB();
            List<Producto> lista = db.getAll();
            for (Producto prod : lista) {

                out.println("<tr>");
                out.println("<td>" + prod.getId() + "</td>");
                out.println("<td>" + prod.getCategoria() + "</td>");
                out.println("<td>" + prod.getNombre() + "</td>");
                out.println("<td>$ " + prod.getPrecio() + "</td>");
                out.println("</tr>");
            }
            //Termina contenido dinamico            
            out.println("</table>");
          /*  codigo para colocar un enlace que permita regresar al menu principal */
            out.println("<br>");
            out.println("<a href=\""); 
          /*permite que el servlet regrese a  /tablasHTML */
            out.println(response.encodeURL ("/tablasHTML")); 
            out.println("\">Regresar Menú</a>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


}
