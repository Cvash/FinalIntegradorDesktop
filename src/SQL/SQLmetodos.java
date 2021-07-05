
package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import login_bd.Frm_reserva_citas;


public class SQLmetodos {
   
    Connection conexion;
    PreparedStatement sentencia_preparada;
    ResultSet resultado;
    String sql;
    // instanciamos el menu principal para que se muestre.
    Frm_reserva_citas reserva_cita = new Frm_reserva_citas();
    
    // Usuario es el DNI - contraseña es contrasenia de la base de datos.
    // Para el login
    public void buscarUsuarioRegistrado(String user, String contrasenia) {
        
        try {
            conexion = ConexionBD.conectar();
            sql = "SELECT usuarioRegistrado, contrasenia FROM usuario WHERE usuarioRegistrado = '" + user + "' && contrasenia = '" + contrasenia + "'";
            sentencia_preparada = conexion.prepareStatement(sql);
           // System.out.println(sentencia_preparada);
            // ejecutamos la query
            resultado = sentencia_preparada.executeQuery();
            
            //validamos los usuarios.
            if ( resultado.next() ) {
                user = resultado.getString("usuarioRegistrado");
                contrasenia = resultado.getString("contrasenia");
                
                //mostraremos el menú principal.
                reserva_cita.setVisible(true);
                
                //conexion.close();
            } else {
                JOptionPane.showMessageDialog(null, "Error en el usuario o contraseña Ingresada!");
            }
            
            conexion.close();
            ConexionBD.desconectar();
            
        } catch ( SQLException e) {
            System.out.println("Error: " +e);
        }
        
    }
}
