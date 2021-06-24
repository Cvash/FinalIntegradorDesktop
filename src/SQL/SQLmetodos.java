
package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import javax.swing.JOptionPane;
//import login_bd.Frm_login;

public class SQLmetodos {
   /* 
    Connection conexion;
    PreparedStatement sentencia_preparada;
    ResultSet resultado;
    String sql;
    
    // instanciar el formulario
    Frm_login login = new Frm_login();
    
<<<<<<< HEAD
    public void buscarUsuarioRegistrado( String DNI, String PASSWORD ) {
        
        try {
            conexion = ConexionBD.conectar();
            sql = " SELECT DNI, PASSWORD FROM biblioteca_integrador WHERE DNI = '"+DNI+"' && PASSWORD = '"+PASSWORD+"' ";
        } catch (Exception e) {
=======
    */
    /*
    public void buscarUsuarioRegistrado( String DNI, String PASSWORD ) {
       
        try {
            conexion = ConexionBD.conectar();
            sql = " SELECT DNI, PASSWORD FROM biblioteca_integrador WHERE DNI = '"+DNI+"' && PASSWORD = '"+PASSWORD+"' ";
            sentencia_preparada = conexion.prepareStatement(sql);
            resultado = sentencia_preparada.executeQuery();
            
            if (resultado.next()) {
                DNI = resultado.getString("DNI");
                PASSWORD = resultado.getString("PASSWORD");
                
                login.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Error en el usuario o contraseña ingresada!");
            }
            
        } catch (SQLException e) {
>>>>>>> carlosv
            System.out.println("Error: " + e);
        }
        
        
    }
    */
    
}
