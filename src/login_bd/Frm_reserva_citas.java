
package login_bd;

import SQL.ConexionBD;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import metodos.dao.CategoriaDao;

import SQL.ConexionBD;

public class Frm_reserva_citas extends javax.swing.JFrame {

    public Frm_reserva_citas() {
        initComponents();

       CategoriaDao categoria = new CategoriaDao();
        DefaultComboBoxModel modelCategoria = new DefaultComboBoxModel(categoria.mostrarCategoria());
        cbxCategoria.setModel(modelCategoria);
       
     /*PreparedStatement ps = null;
     ResultSet rs = null;
     ConexionBD conn = new ConexionBD();
     Connection con = conn.conectar();
     
     try{
         String sql = "SELECT * FROM libro";
         ps = conn.prepareStatement(sql);
         rs = ps.executeQuery();
         
         while(rs.next()){
             cbxCategoria.addItem("descripcionCategoria");
         }
         rs.close();
     }catch(SQLException ex){
         System.err.println(ex.toString());
     }*/
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        cbxAutor = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        btnBusscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtReservar = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDisponibilidad = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reserva de Citas para lectura de libros en Sala");
        setResizable(false);

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo_sala.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 160, 80));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Reserva de citas para lectura de libros en sala");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Biblioteca Histórica del Palacion Municipal");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("40567890");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("MARIO LUIS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 40, -1, -1));

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 51, 102))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 220, 650));

        jLabel8.setText("Categoría");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel9.setText("Autor");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jLabel10.setText("Libro");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        cbxCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCategoriaItemStateChanged(evt);
            }
        });
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 220, 40));

        jPanel2.add(cbxAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 256, 220, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 314, 220, 40));

        btnBusscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBusscar.setText("Buscar");
        jPanel2.add(btnBusscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, -1));

        jtReservar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtReservar);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, 790, 100));

        jtDisponibilidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtDisponibilidad);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 790, 90));

        jButton2.setBackground(new java.awt.Color(0, 204, 102));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reservar Libro");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 700, -1, -1));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reserva de Libros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 1120, 660));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Libros a Reservar");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, -1, -1));

        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disponibilidad de Libros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 1010, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
  
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void cbxCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCategoriaItemStateChanged
        
        if ( evt.getStateChange() == ItemEvent.SELECTED ) {
            
            CategoriaDao categoria = (CategoriaDao)cbxCategoria.getSelectedItem();
            
            try {
                
                DefaultTableModel modelo = new DefaultTableModel();
                jtDisponibilidad.setModel(modelo);

                PreparedStatement sentencia_preparada;
                ResultSet resultado;
                ConexionBD conexionDB = new ConexionBD();
                Connection conexion = ConexionBD.conectar();
                

                String sql;
                 
                // Analizar la query que es lo que vamos a mostrar en la tabla
                sql = "SELECT idLibro, tituloLibro, anioLibro FROM libro WHERE id_Categoria=" + categoria.getId();
                System.out.println(sql);
                sentencia_preparada = conexion.prepareStatement(sql);
                resultado = sentencia_preparada.executeQuery();
                
                ResultSetMetaData rsMd = resultado.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();
                
                modelo.addColumn("Id");
                modelo.addColumn("Titulo");
                modelo.addColumn("Ano Libro");
//                modelo.addColumn("Estado");
//                modelo.addColumn("Seleccionar");
                
                int[] anchos = {50, 200};
                
                for ( int x = 0 ; x < cantidadColumnas ; x++ ) {
                    jtDisponibilidad.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
                }
                
                while( resultado.next() ) {
                 
                    final Object[] filas = new Object[cantidadColumnas];
                    
                    for ( int i = 0 ; i < cantidadColumnas ; i++ ) {
                        
                        filas[i] = resultado.getObject( i + 1 );
                    }
                    
                    modelo.addRow(filas);
                    
                }                
                
                
            } catch (Exception e) {
                System.out.println("El error es: " + e.toString());
            }
            
        }
        
    }//GEN-LAST:event_cbxCategoriaItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_reserva_citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_reserva_citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_reserva_citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_reserva_citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_reserva_citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusscar;
    private javax.swing.JComboBox<String> cbxAutor;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jtDisponibilidad;
    private javax.swing.JTable jtReservar;
    // End of variables declaration//GEN-END:variables
}
