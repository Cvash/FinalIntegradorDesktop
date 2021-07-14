package metodos.dao;

import SQL.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class CategoriaDao {

    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vector<CategoriaDao> mostrarCategoria() {

        PreparedStatement sentencia_preparada;
        ResultSet resultado;
        String sql;
        ConexionBD conecxionBD = new ConexionBD();
        Connection conexion = conecxionBD.conectar();

        Vector<CategoriaDao> categoria = new Vector<>();
        CategoriaDao categoria_dao = null;

        try {

            sql = "SELECT * FROM categoria;";
            sentencia_preparada = conexion.prepareStatement(sql);
            resultado = sentencia_preparada.executeQuery();

            categoria_dao = new CategoriaDao();
            categoria_dao.setId(0);
            categoria_dao.setNombre("Selecciona Categoria");
            categoria.add(categoria_dao);

            while (resultado.next()) {

                categoria_dao = new CategoriaDao();
                categoria_dao.setId(resultado.getInt("idCategoria"));
                categoria_dao.setNombre(resultado.getString("descripcionCategoria"));
                categoria.add(categoria_dao);
            }
            //resultado.close();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        // retrnamos el vector que creamos
        return categoria;

    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
