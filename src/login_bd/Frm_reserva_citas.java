package login_bd;

import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import metodos.dao.CategoriaDao;

import SQL.ConexionBD;
import SQL.SQLmetodos;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class Frm_reserva_citas extends javax.swing.JFrame {

    public Frm_reserva_citas() {
        initComponents();

        CategoriaDao categoria = new CategoriaDao();
        DefaultComboBoxModel modelCategoria = new DefaultComboBoxModel(categoria.mostrarCategoria());
        cbxCategoria.setModel(modelCategoria);

    }
    
    
    public void buscarLibro(String buscar) {
        SQLmetodos metodos = new SQLmetodos();
        
        DefaultTableModel modelo = metodos.buscarLibro(buscar);
        
        jtDisponibilidad.setModel(modelo);
        
        addCheckBox(2, jtDisponibilidad);
        
    }
    
    public void addCheckBox( int column, JTable jtDisponibilidad ) {
        TableColumn tc = jtDisponibilidad.getColumnModel().getColumn(column);
        tc.setCellEditor(jtDisponibilidad.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(jtDisponibilidad.getDefaultRenderer(Boolean.class));
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
        txtLibro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtReserva = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDisponibilidad = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

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

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Categoría");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Autor");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Libro o Año");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

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

        txtLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibroActionPerformed(evt);
            }
        });
        txtLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLibroKeyReleased(evt);
            }
        });
        jPanel2.add(txtLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 314, 220, 40));

        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, -1));

        jtReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Año", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(jtReserva);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, 790, 100));

        jtDisponibilidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Año", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jtDisponibilidad);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 790, 140));

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reservar Libro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 700, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Seleccionados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 550, -1, -1));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reserva de Libros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 1120, 660));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Libros a Reservar");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, -1, -1));

        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disponibilidad de Libros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 1010, 390));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.jpg"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 110, 80));

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

    private void txtLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLibroActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed

    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void cbxCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCategoriaItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED ) {

            CategoriaDao categoria = (CategoriaDao) cbxCategoria.getSelectedItem();

            try {

                DefaultTableModel modelo = new DefaultTableModel();
                jtDisponibilidad.setModel(modelo);

                PreparedStatement sentencia_preparada = null;
                ResultSet resultado = null;
                ConexionBD conn = new ConexionBD();
                Connection conexion = conn.conectar();

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
                modelo.addColumn("Año Libro");

                int[] anchos = {50, 200};

                for (int i = 0; i < cantidadColumnas + 1 ; i++) {
                    jtDisponibilidad.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                    System.out.println(i);
                }

                while (resultado.next()) {

                    Object[] filas = new Object[cantidadColumnas];

                    for (int i = 0; i < cantidadColumnas - 1 ; i++) {
                        filas[i] = resultado.getObject(i + 1);
                        System.out.println(i);
                    }
                    modelo.addRow(filas);
                }

            } catch (SQLException ex) {
                System.err.println("El error es: " + ex.toString());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error Array: " + e);
                
            }
        }
    }//GEN-LAST:event_cbxCategoriaItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Frm_reserva_sala reserva_sala = new Frm_reserva_sala();
        reserva_sala.setVisible(true);
        
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLibroKeyReleased
        
        buscarLibro(txtLibro.getText());
        
    }//GEN-LAST:event_txtLibroKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        TableModel modelo1 = jtDisponibilidad.getModel();
        int[] filas = jtDisponibilidad.getSelectedRows();
        Object[] row = new Object[3];
        
        DefaultTableModel modelo2 = (DefaultTableModel) jtReserva.getModel();
        
        for (int i = 0; i < filas.length; i++) {
            row[0] = modelo1.getValueAt(filas[i], 0);
            row[1] = modelo1.getValueAt(filas[i], 1);
            row[2] = modelo1.getValueAt(filas[i], 2);
            
            modelo2.addRow(row);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbxAutor;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTable jtDisponibilidad;
    private javax.swing.JTable jtReserva;
    private javax.swing.JTextField txtLibro;
    // End of variables declaration//GEN-END:variables
}
