
package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQLmetodos {
    
    Connection conexion;
    PreparedStatement sentencia_preparada;
    ResultSet resultado;
    String sql;
    
    
    public void buscarUsuarioRegistrado( String USER, String PASSWORD ) {
        
        try {
            conexion = ConexionBD.conectar();
            sql = " SELECT USER, PASSWORD FROM biblioteca_integrador WHERE USER = '"+USER+"' && PASSWORD = '"+PASSWORD+"' ";
        } catch (Exception e) {
        }
        
        
    }
    
    
    
}
