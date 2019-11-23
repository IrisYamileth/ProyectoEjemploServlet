package sv.irisgarcia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    //Constantes de instancia de la clase
    /*Se declaran constantes porqe van siempre los mismos valores
    cada vez que se vaya a crear un objeto de tipo DbConnection*/

    static String bd = "sistemadb";
    static String login = "root";
    static String password = "admin";
    static String url = "jdbc:mysql://localhost/" + bd + "?serverTimezone=UTC";

    //esta variable va guardar la conexion
    Connection conn = null;

    /*Constructor de DbConnection se llama constructor porqe tiene el mismo
    que la clase y cuando se crea un nuevo objeto de esta clase es como
    se va inicializar al crear un nuevo objeto de este tipo*/
    public DbConnection() {
        try {
            //obtenemos el driver para mysql
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtenemos la conexion
            conn = DriverManager.getConnection(url, login, password);
            //si conn no es nulo, significa que se pudo conectar
            if (conn != null) {
                System.out.println("connecting database [" + conn + "] OK");
            }
        } catch (SQLException e)//Excepcion ocurrida por la conexion
        {
            System.out.println("Excepcion conexion: " + e.getMessage());
        } catch (ClassNotFoundException e)//Excepcion ocurrida por no encontrar el driver
        {
            System.out.println("Exception driver: " + e.getMessage());
        }
    }

    /*Permite retornar la conexion*/
    public Connection getConnection() {
        return conn;
    }

    /*Quitamos de memoria la conexion*/
    public void disconnect() {
        System.out.println("closing database : [" + conn + "] OK");
        if (conn != null) {
            try {
                //system.out.println("desconectado de" + bd + "OK");
                conn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }
}
