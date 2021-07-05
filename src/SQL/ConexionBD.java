
package SQL;


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
   
    
    private static String URL = "jdbc:mysql://localhost:3306/biblioteca_integrador";
    private static String USER = "root";
    private static String PASSWORD = "toor";
    
    
    public static Connection conectar(){
        
        Connection conexion = null;
        
        try { 
            
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión Establecida Éxitosamente");
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            
            System.out.println("Error: " + e);
            
        }
        return conexion;
    }
    
    
    public static void desconectar() {
        
        Connection conexion = null;
        if( conexion == null ) {
            
            System.out.println("La variable de conexion ha sido puesta en null");
            
        }
    }
    
}
