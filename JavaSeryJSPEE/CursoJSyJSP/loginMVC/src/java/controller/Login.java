package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LoginBean;

public class Login extends HttpServlet {

    //2. El controller recibe la peticion de tipo POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //3. Se reciben o validan los datoas usados por el usuario
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        LoginBean bean = new LoginBean();
        bean.setName(name);
        bean.setPassword(password);

        //4. realizamos la logica del negocio (Procesar los datos)
        boolean status = bean.validate();

        //5. compartimos al objeto para usarlo en la vista(JSP) user es el que se asigna a archivo success.jsp
        request.setAttribute("user", bean);

        //6.Dependiendo de nuestra logica redireccionamos (enviamos la respuesta)
        if (status) {
            RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
            rd.forward(request, response);

        } else {
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }
    }

}
