/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash;

public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        LoadingLabel = new javax.swing.JLabel();
        NameBiblioteca = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        BackgroundLogo = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoadingLabel.setText("Loading . . .");
        BackgroundPanel.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        NameBiblioteca.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        NameBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameBiblioteca.setText("Name Biblioteca");
        BackgroundPanel.add(NameBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 900, -1));

        LoadingValue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(255, 255, 255));
        LoadingValue.setText("0 %");
        BackgroundPanel.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, -1, -1));

        BackgroundLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackgroundLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo_biblioteca.png"))); // NOI18N
        BackgroundPanel.add(BackgroundLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 900, 260));
        BackgroundPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 482, 900, 20));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/splash.jpg"))); // NOI18N
        BackgroundImage.setPreferredSize(new java.awt.Dimension(900, 500));
        BackgroundPanel.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() ) {
                if ( "Nimbus".equals(info.getName()) ) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
        
        SplashScreen splash = new SplashScreen();
        splash.setVisible(true);
        
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(100);
                splash.LoadingValue.setText( i + "%");
                
                if ( i == 10 ) {
                    splash.LoadingLabel.setText("Esperando los Módulos ...");
                }
                if ( i == 20 ) {
                    splash.LoadingLabel.setText("Cagando Módulos ...");
                }
                if ( i == 50 ) {
                    splash.LoadingLabel.setText("Conectando a la Base de Datos ...");
                }
                if ( i == 70 ) {
                    splash.LoadingLabel.setText("Conexión Satisfactoria...");
                }
                if ( i == 80 ) {
                    splash.LoadingLabel.setText("Cargando Aplicación ...");
                }
                
                splash.LoadingBar.setValue(i);
            }
        } catch (Exception e) {
            
            System.out.println("Error en la carga del Splash: " + e);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel BackgroundLogo;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel NameBiblioteca;
    // End of variables declaration//GEN-END:variables
}
