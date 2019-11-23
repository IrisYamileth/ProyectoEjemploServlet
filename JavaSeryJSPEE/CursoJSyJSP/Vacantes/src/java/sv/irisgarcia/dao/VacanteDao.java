
package sv.irisgarcia.dao;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import sv.irisgarcia.model.Vacante;

public class VacanteDao {
    //conexion a bd
    DbConnection conn;
    
    //constructor de DbConnection

    public VacanteDao(DbConnection conn) {
        this.conn = conn;
    }
    
    //metodo insertar vacantes
    public boolean insert(Vacante vacante){
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        String sql ="insert into Vacante values(?,?,?,?,?)";
        try {
            PreparedStatement ps =conn.getConnection().prepareStatement(sql);
            //parametros para realizar el insert
            ps.setInt(1, vacante.getId());
            ps.setString(2, format.format(vacante.getFechapublicacion()));
            ps.setString(3,vacante.getNombre());
            ps.setString(4, vacante.getDescripcion());
            ps.setString(5,vacante.getDetalle());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
}
