
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

    public void addCheckBox(int column, JTable jtDisponibilidad) {
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
        lblUsuarioNombre = new javax.swing.JLabel();
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
        btnReservaLibros = new javax.swing.JButton();
        btnReservaCitasSalas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();

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
        jLabel2.setText("Reserva de Citas para Lectura de Libros en Sala");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 20)); // NOI18N
        jLabel3.setText("Biblioteca Hist??rica del Palacio Municipal");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        lblUsuarioNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUsuarioNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuarioNombre.setText("lblUsuarioNombre");
        jPanel2.add(lblUsuarioNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 50, 210, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Categor??a");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Autor");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Libro o A??o");
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
                "Titulo", "A??o", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(jtReserva);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, 790, 100));

        jtDisponibilidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "A??o", "Seleccione"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/usuario.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 20, -1, 60));

        btnReservaLibros.setBackground(new java.awt.Color(0, 102, 153));
        btnReservaLibros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReservaLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnReservaLibros.setText("Reserva de Libros");
        btnReservaLibros.setEnabled(false);
        jPanel2.add(btnReservaLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 173, 250, 30));

        btnReservaCitasSalas.setBackground(new java.awt.Color(0, 102, 153));
        btnReservaCitasSalas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReservaCitasSalas.setForeground(new java.awt.Color(255, 255, 255));
        btnReservaCitasSalas.setText("Reserva de Citas de Salas");
        btnReservaCitasSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaCitasSalasActionPerformed(evt);
            }
        });
        jPanel2.add(btnReservaCitasSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 250, -1));

        btnSalir.setBackground(new java.awt.Color(0, 102, 153));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 250, -1));

        lblMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Men??", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 51, 102))); // NOI18N
        jPanel2.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 270, 660));

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("lblUsuario");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 30, 210, -1));

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

        if (evt.getStateChange() == ItemEvent.SELECTED) {

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
                modelo.addColumn("A??o Libro");

                int[] anchos = {50, 200};

                for (int i = 0; i < cantidadColumnas + 1; i++) {
                    jtDisponibilidad.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                    System.out.println(i);
                }

                while (resultado.next()) {

                    Object[] filas = new Object[cantidadColumnas];

                    for (int i = 0; i < cantidadColumnas - 1; i++) {
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

        if (filas.length > 0) {
            System.out.println("si hay datos");
            Object[] row = new Object[3];

            DefaultTableModel modelo2 = (DefaultTableModel) jtReserva.getModel();

            for (int i = 0; i < filas.length; i++) {

                row[0] = modelo1.getValueAt(filas[i], 0);
                row[1] = modelo1.getValueAt(filas[i], 1);
                //row[2] = modelo1.getValueAt(filas[i], 2);

                modelo2.addRow(row);
            }
        }else {
            System.out.println("No hay datos!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Frm_login login = new Frm_login();
        login.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReservaCitasSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaCitasSalasActionPerformed
        Frm_reserva_cita_sala reserva_citas_salas = new Frm_reserva_cita_sala();
        reserva_citas_salas.setVisible(true);
        reserva_citas_salas.lblUsuario.setText(lblUsuario.getText());
        reserva_citas_salas.lblUsuarioNombre.setText(lblUsuarioNombre.getText());
        this.setVisible(false);  
    }//GEN-LAST:event_btnReservaCitasSalasActionPerformed

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
    private javax.swing.JButton btnReservaCitasSalas;
    private javax.swing.JButton btnReservaLibros;
    private javax.swing.JButton btnSalir;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtDisponibilidad;
    public static javax.swing.JTable jtReserva;
    private javax.swing.JLabel lblMenu;
    public javax.swing.JLabel lblUsuario;
    public javax.swing.JLabel lblUsuarioNombre;
    private javax.swing.JTextField txtLibro;
    // End of variables declaration//GEN-END:variables
}
