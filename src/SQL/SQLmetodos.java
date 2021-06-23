
package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQLmetodos {
    
    Connection conexion;
    PreparedStatement sentencia_preparada;
    ResultSet resultado;
    String sql;
    
    
    public void buscarUsuarioRegistrado( String DNI, String PASSWORD ) {
        
        try {
            conexion = ConexionBD.conectar();
            sql = " SELECT DNI, PASSWORD FROM biblioteca_integrador WHERE DNI = '"+DNI+"' && PASSWORD = '"+PASSWORD+"' ";
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        
    }
    
    
    
}
