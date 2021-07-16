
package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login_bd.Frm_reserva_cita_sala;
import login_bd.Frm_reserva_citas;

public class SQLmetodos {
   
    static Connection conexion;
    static PreparedStatement sentencia_preparada;
    static ResultSet resultado;
    String sql;
    // instanciamos el menu principal para que se muestre.
    Frm_reserva_citas reserva_cita = new Frm_reserva_citas();

    // Usuario es el DNI - contraseña es contrasenia de la base de datos.
    // Para el login
    public void buscarUsuarioRegistrado(String user, String contrasenia) {
        
        try {
            conexion = ConexionBD.conectar();
            sql = "SELECT usuarioRegistrado, contrasenia, nombre, apellido FROM usuario WHERE usuarioRegistrado = '" + user + "' && contrasenia = '" + contrasenia + "'";
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
                   
            } else {
                JOptionPane.showMessageDialog(null, "Error en el usuario o contraseña Ingresada!");
            }
            
           // conexion.close();
           // ConexionBD.desconectar();
            
        } catch ( SQLException e) {
            System.out.println("Error: " +e);
        }
        
    }
    
    //metodo para guardar datos usuario
    public int guardar(String usuarioRegistrado, String contrasenia, String nombre, String apellido, String email, String telefono, String direccion) {
        int resultado = 0; //tenemos que retornar datos
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO usuario(usuarioRegistrado,contrasenia,nombre,apellido,email,telefono,direccion) VALUES (?,?,?,?,?,?,?)");//sentencia para guardar en la base de datos
        try {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, usuarioRegistrado);
            sentencia_preparada.setString(2, contrasenia);
            sentencia_preparada.setString(3, nombre);
            sentencia_preparada.setString(4, apellido);
            sentencia_preparada.setString(5, email);
            sentencia_preparada.setString(6, telefono);
            sentencia_preparada.setString(7, direccion);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    
    
    public DefaultTableModel buscarLibro(String buscar)
    {

        int contador = 1; // Dedicado para acomular en número de registros que hay en la tabla
        
        String []  nombresColumnas = {"titulo","Año", "Seleccionar"};//Indica el nombre de las columnas en la tabla
        String [] registros = new String[2];
        
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        String sql = "SELECT tituloLibro, anioLibro  FROM libro WHERE tituloLibro LIKE '%"+buscar+"%' OR anioLibro LIKE '%"+buscar+"%'";
        
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;                           
        
        try
        {
            cn = ConexionBD.conectar();
            pst = cn.prepareStatement(sql);   
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("tituloLibro");
                registros[1] = rs.getString("anioLibro"); 
                
                modelo.addRow(registros);
                
                contador++;
                
            }                      
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar. "+e.getMessage());
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    }
     
    public void datosUsuarioLogin(String user, String contrasenia) {
        
        try {
            conexion = ConexionBD.conectar();
            
            sql = "SELECT usuarioRegistrado, nombre, apellido FROM usuario WHERE usuarioRegistrado = '" + user + "' && contrasenia = '" + contrasenia + "'";
            
            sentencia_preparada = conexion.prepareStatement(sql);
            resultado = sentencia_preparada.executeQuery();

            if ( resultado.next() ) {
                reserva_cita.lblUsuario.setText(resultado.getString("usuarioRegistrado"));
                reserva_cita.lblUsuarioNombre.setText(resultado.getString("nombre") + " " + resultado.getString("apellido"));
    
                conexion.close();
            }

        } catch ( SQLException e) {
            System.out.println("Error: " +e);
        }
        
    }
    
    public DefaultTableModel buscarSalaDisponible(String fecha)
    {
       
        String []  nombresColumnas = {"Sala","Hora","Aforo","Disponible"};//Indica el nombre de las columnas en la tabla
        String [] registros = new String[4];
        
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        String sql="SELECT c.idSala,c.nombreSala as sala,d.descripcionHorario as horario,c.aforoSala as aforo, count(distinct a.idReserva) reservados, c.aforoSala - count(distinct a.idReserva) as disponibles\n" +
                    "FROM biblioteca_integrador.reserva a inner join biblioteca_integrador.reserva_detalle b on a.idReserva = b.id_Reserva\n" +
                    "inner join biblioteca_integrador.sala c on a.id_Sala = c.idSala\n" +
                    "inner join biblioteca_integrador.horario d on c.idHorarioSala = d.idHorario\n" +
                    "where a.fechaReserva = '" + fecha + "' \n" +
                    "and a.estadoReserva = 1 and b.estadoReservaDetalle = 1\n" +
                    "group by c.idSala, c.aforoSala,d.descripcionHorario";
        
        //String sql = "SELECT tituloLibro, anioLibro  FROM libro WHERE tituloLibro LIKE '%"+buscar+"%' OR anioLibro LIKE '%"+buscar+"%'";
        
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;                           
        
        try
        {
            cn = ConexionBD.conectar();
            pst = cn.prepareStatement(sql);   
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("sala");
                registros[1] = rs.getString("horario"); 
                registros[2] = rs.getString("aforo");
                registros[3] = rs.getString("disponibles"); 
                
                modelo.addRow(registros);
                
            }                      
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar. "+e.getMessage());
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    }
    
}
