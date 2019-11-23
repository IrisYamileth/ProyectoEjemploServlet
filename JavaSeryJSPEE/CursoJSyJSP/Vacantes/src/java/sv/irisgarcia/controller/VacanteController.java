
package sv.irisgarcia.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sv.irisgarcia.dao.DbConnection;
import sv.irisgarcia.dao.VacanteDao;
import sv.irisgarcia.model.Vacante;


public class VacanteController extends HttpServlet {  
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Recibir parametros, nombre, descripcion es el que declaramos en el atributo  name de frmvacantes
        String nombreParam=request.getParameter("nombre");
        String descripcionParam=request.getParameter("descripcion");
        String detalleParam=request.getParameter("detalle");
        
        //crear objeto de tipo vacante, como se tiene constructor que recibe id y el id es autoincremental le vamos a dar 
        //valor de 0
        Vacante vacante =new Vacante(0);
        //asignar los datos del formulario a nuesttro objeto java beans
        vacante.setNombre(nombreParam);
        vacante.setDescripcion(descripcionParam);
        vacante.setDetalle(detalleParam);
        
        //imprimir metodo vacante, cuando se imprime un metodo se va imprimir el metodo toString de vacante el cual contiene
        //todos los parametros de la bd
        System.out.println(vacante);
        
        //codigo para insertar el registro en la base de datos
              //Procesamos los datos guardar en BD
        DbConnection conn= new DbConnection();
        VacanteDao vacanteDao=new VacanteDao(conn);
        boolean status =vacanteDao.insert(vacante);
        
        //Preparamos un mensaje para el usuario
        String mensaje="";
        if(status){
            mensaje="La vacante fue guardada correctamente";
        }else{
        mensaje="Ocurrio un error.La vacante no fue guardada correctamente";
        }
        conn.disconnect();
        RequestDispatcher rd;
        
        //compartimos la variable mensaje, para poder accederla desde la vista con Expresion languaje
        request.setAttribute("message", mensaje);
        
        //enviamos respuesta  renderizamos la vista mensaje.jsp
        rd=request.getRequestDispatcher("/mensaje.jsp");
        rd.forward(request, response);
        
    }

}
