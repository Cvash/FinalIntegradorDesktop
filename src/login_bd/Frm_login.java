package login_bd;

import SQL.SQLmetodos;

public class Frm_login extends javax.swing.JFrame {
    
    private int limite  = 9;

    public Frm_login() {
        initComponents();
    }
    // instanciamos el metodo
    SQLmetodos SQLmetodos = new SQLmetodos();
    Frm_reserva_citas reservaCita = new Frm_reserva_citas();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        logo_icon = new javax.swing.JLabel();
        user_login = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnNuevoUsuario = new javax.swing.JButton();
        txtNombreBiblioteca1 = new javax.swing.JLabel();
        txtNombreBiblioteca = new javax.swing.JLabel();
        txtNombreBiblioteca2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");
        setResizable(false);

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo_biblioteca.png"))); // NOI18N
        background.add(logo_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 440, 200));

        user_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user_login.png"))); // NOI18N
        user_login.setMaximumSize(new java.awt.Dimension(256, 2560));
        background.add(user_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 260));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setText("Iniciar Sesión");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Usuario:");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Contraseña:");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        txtUser.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        background.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 260, 40));

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        background.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 432, 260, 40));

        btnIngresar.setBackground(new java.awt.Color(51, 101, 166));
        btnIngresar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        background.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 130, 50));

        btnNuevoUsuario.setBackground(new java.awt.Color(51, 101, 166));
        btnNuevoUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoUsuario.setText("Crear Nuevo Usuario");
        btnNuevoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });
        background.add(btnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 230, 50));

        txtNombreBiblioteca1.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreBiblioteca1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtNombreBiblioteca1.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreBiblioteca1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombreBiblioteca1.setText("Biblioteca Histórica");
        background.add(txtNombreBiblioteca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 390, 70));

        txtNombreBiblioteca.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreBiblioteca.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtNombreBiblioteca.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombreBiblioteca.setText("Palacio Municipal");
        background.add(txtNombreBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, 280, 70));

        txtNombreBiblioteca2.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreBiblioteca2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtNombreBiblioteca2.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreBiblioteca2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombreBiblioteca2.setText("del");
        background.add(txtNombreBiblioteca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 390, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.jpg"))); // NOI18N
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 440, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // lleva los datos al metodo SQL
        SQLmetodos.buscarUsuarioRegistrado(txtUser.getText(), txtPassword.getText());
        SQLmetodos.datosUsuarioLogin(txtUser.getText(), txtPassword.getText());
        
        if ( reservaCita.isEnabled() ) {
            this.dispose();
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        // TODO add your handling code here:
        Frm_new_user newUser = new Frm_new_user();
        newUser.setVisible(true);
        
        //ocultamos la ventana de login
        this.setVisible(false); 
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        if (txtUser.getText().length()== limite)
            evt.consume();
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        if (txtPassword.getText().length()== limite)
                evt.consume();
    }//GEN-LAST:event_txtPasswordKeyTyped

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
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel logo_icon;
    private javax.swing.JLabel txtNombreBiblioteca;
    private javax.swing.JLabel txtNombreBiblioteca1;
    private javax.swing.JLabel txtNombreBiblioteca2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel user_login;
    // End of variables declaration//GEN-END:variables
}
