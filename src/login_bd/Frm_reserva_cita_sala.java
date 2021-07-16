
package login_bd;

import SQL.SQLmetodos;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import SQL.ConexionBD;
import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class Frm_reserva_cita_sala extends javax.swing.JFrame {

    public Frm_reserva_cita_sala() {
        
        initComponents();
        
        Calendar fechaActual = new GregorianCalendar();
        dateFecReserva.setCalendar(fechaActual);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnReservaSala = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisponibilidadSala = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        dateFecReserva = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnReservaCitasSalas = new javax.swing.JButton();
        btnReservaLibros = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        btnBuscarDisponibilidad = new javax.swing.JButton();
        contenedorReservaCitas = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblUsuarioNombre = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reserva de citas pata lectura de libros en sala");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo_sala.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 160, 80));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Reserva de Citas para Lectura de Libros en Sala");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 20)); // NOI18N
        jLabel3.setText("Biblioteca Histórica del Palacio Municipal");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Fecha:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, 30));

        btnReservaSala.setBackground(new java.awt.Color(0, 102, 51));
        btnReservaSala.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnReservaSala.setForeground(new java.awt.Color(255, 255, 255));
        btnReservaSala.setText("Reservar Sala");
        btnReservaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaSalaActionPerformed(evt);
            }
        });
        jPanel1.add(btnReservaSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 680, -1, -1));

        tblDisponibilidadSala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sala", "Hora", "Aforo", "Disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDisponibilidadSala);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 790, 100));

        jLabel10.setText("   ");
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disponibilidad de Salas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 890, 390));
        jPanel1.add(dateFecReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 150, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 730, 150, -1));

        btnSalir.setBackground(new java.awt.Color(0, 102, 153));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 250, -1));

        btnReservaCitasSalas.setBackground(new java.awt.Color(0, 102, 153));
        btnReservaCitasSalas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReservaCitasSalas.setForeground(new java.awt.Color(255, 255, 255));
        btnReservaCitasSalas.setText("Reserva de Citas de Salas");
        btnReservaCitasSalas.setEnabled(false);
        jPanel1.add(btnReservaCitasSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 250, -1));

        btnReservaLibros.setBackground(new java.awt.Color(0, 102, 153));
        btnReservaLibros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReservaLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnReservaLibros.setText("Reserva de Libros");
        btnReservaLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaLibrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnReservaLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 173, 250, 30));

        lblMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menú", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 51, 102))); // NOI18N
        jPanel1.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 270, 660));

        btnBuscarDisponibilidad.setBackground(new java.awt.Color(0, 153, 153));
        btnBuscarDisponibilidad.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDisponibilidad.setText("Buscar");
        btnBuscarDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDisponibilidadActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        contenedorReservaCitas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        contenedorReservaCitas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reserva de Citas de Salas de Lectura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.add(contenedorReservaCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 1120, 670));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/usuario.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 20, -1, 60));

        lblUsuarioNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUsuarioNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuarioNombre.setText("lblUsuarioNombre");
        jPanel1.add(lblUsuarioNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 50, 210, -1));

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("lblUsuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 30, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1484, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnReservaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaSalaActionPerformed
        Frm_reserva_exitosa reserva_sala = new Frm_reserva_exitosa();
        reserva_sala.setVisible(true);  
        //Datos a pasar a la Reserva de sala exitósa
        reserva_sala.lblUsuario.setText(lblUsuario.getText());
        reserva_sala.lblUsuarioNombre.setText(lblUsuarioNombre.getText());
        //Fecha
        Date  fechaFormulario = dateFecReserva.getDate();
        DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = f.format(fechaFormulario);
        reserva_sala.lblFecha.setText(fecha);
        String msjReservaExitosa = lblUsuarioNombre.getText() + ", tu reserva de sala de lectura se realizó exitósamente.";
        reserva_sala.lblUsuarioMsj.setText(msjReservaExitosa);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnReservaSalaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Frm_reserva_citas reserva_libros = new Frm_reserva_citas();
        reserva_libros.setVisible(true);
        this.setVisible(false); 
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Frm_login login = new Frm_login();
        login.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReservaLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaLibrosActionPerformed
        Frm_reserva_citas reserva_libros = new Frm_reserva_citas();
        reserva_libros.setVisible(true);
        reserva_libros.lblUsuario.setText(lblUsuario.getText());
        reserva_libros.lblUsuarioNombre.setText(lblUsuarioNombre.getText());
        this.setVisible(false); 
        
    }//GEN-LAST:event_btnReservaLibrosActionPerformed

    private void btnBuscarDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDisponibilidadActionPerformed
        
        SQLmetodos logica = new SQLmetodos();
        
        Date  fechaFormulario = dateFecReserva.getDate();
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = f.format(fechaFormulario);

        DefaultTableModel modelo = logica.buscarSalaDisponible(fecha);
        tblDisponibilidadSala.setModel(modelo);

    }//GEN-LAST:event_btnBuscarDisponibilidadActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(Frm_reserva_cita_sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_reserva_cita_sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_reserva_cita_sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_reserva_cita_sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_reserva_cita_sala().setVisible(true);
            }
        });
        
      
        //dateFecReserva.setDateFormatString(fechaActual);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarDisponibilidad;
    private javax.swing.JButton btnReservaCitasSalas;
    private javax.swing.JButton btnReservaLibros;
    private javax.swing.JButton btnReservaSala;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel contenedorReservaCitas;
    private com.toedter.calendar.JDateChooser dateFecReserva;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMenu;
    public javax.swing.JLabel lblUsuario;
    public javax.swing.JLabel lblUsuarioNombre;
    private javax.swing.JTable tblDisponibilidadSala;
    // End of variables declaration//GEN-END:variables
}
