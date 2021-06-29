/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_bd;

/**
 *
 * @author user
 */
public class Frm_new_user extends javax.swing.JFrame {

    /**
     * Creates new form Frm_new_user
     */
    public Frm_new_user() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        celular = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        plusDatoDNI = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtpasswordNew = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo Usuario");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("Login:");
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background_newUser.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 0, 460, 660));

        password.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setText("Password:");
        password.setToolTipText("");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        nombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("Nombre(s):");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        apellido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(0, 0, 0));
        apellido.setText("Apellidos:");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        celular.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        celular.setForeground(new java.awt.Color(0, 0, 0));
        celular.setText("N° de Celular:");
        jPanel1.add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        correo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        correo.setForeground(new java.awt.Color(0, 0, 0));
        correo.setText("Correo Electrónico:");
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        direccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        direccion.setForeground(new java.awt.Color(0, 0, 0));
        direccion.setText("Dirección:");
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        plusDatoDNI.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        plusDatoDNI.setForeground(new java.awt.Color(0, 102, 102));
        plusDatoDNI.setText("(*) Ingrese su DNI");
        jPanel1.add(plusDatoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 174, 180, 30));
        jPanel1.add(txtpasswordNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 214, 180, 30));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 254, 180, 30));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 294, 180, 30));
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 344, 180, 30));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 394, 180, 30));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 444, 180, 30));

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 51));
        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, -1, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 640, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Frm_new_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_new_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_new_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_new_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_new_user().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel password;
    private javax.swing.JLabel plusDatoDNI;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtpasswordNew;
    // End of variables declaration//GEN-END:variables
}
