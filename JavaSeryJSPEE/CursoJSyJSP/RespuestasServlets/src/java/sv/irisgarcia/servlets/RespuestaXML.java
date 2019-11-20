
package sv.irisgarcia.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RespuestaXML extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              //response xml
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out= response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            out.println("<CATALOG>");
            out.println("<CD>");
            out.println("<TITLE>Empire Burlesque</TITLE>");
            out.println("<ARTIST>Bob Dylan</ARTIST>");
            out.println("<COUNTRY>USA</COUNTRY>");
            out.println("<COMPANY>Columbia</COMPANY>");
            out.println("<PRICE>100.0</PRICE>");
            out.println("<YEAR>1987</YEAR>");
            out.println("</CD>");
            out.println("</CATALOG>");
    }
}
