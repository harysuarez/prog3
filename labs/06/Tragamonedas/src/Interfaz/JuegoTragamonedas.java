package Interfaz;

import Clases.Ima1;
import Clases.Ima2;
import Clases.Ima3;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JuegoTragamonedas extends javax.swing.JFrame {
Ima1  imag1;
Ima2  imag2;
Ima3  imag3;

boolean respuesta1 = false;
boolean respuesta2 = false;
boolean respuesta3 = false;

    public JuegoTragamonedas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Detener2 = new javax.swing.JButton();
        Detener3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Detener1 = new javax.swing.JButton();
        imagen3 = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();
        imagen2 = new javax.swing.JLabel();
        imagen1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Detener2.setBackground(new java.awt.Color(255, 255, 102));
        Detener2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Detener2.setText("DETENER");
        jPanel1.add(Detener2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 90, 30));

        Detener3.setBackground(new java.awt.Color(255, 255, 102));
        Detener3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Detener3.setText("DETENER");
        Detener3.setToolTipText("");
        jPanel1.add(Detener3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Puntos.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 120, 170));

        Detener1.setBackground(new java.awt.Color(255, 255, 102));
        Detener1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Detener1.setText("DETENER");
        Detener1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Detener1ActionPerformed(evt);
            }
        });
        jPanel1.add(Detener1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 90, 30));

        imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4.png"))); // NOI18N
        jPanel1.add(imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 130, 170));

        Iniciar.setBackground(new java.awt.Color(255, 255, 102));
        Iniciar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Iniciar.setText("INICIAR");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        jPanel1.add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 290, 40));

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5.png"))); // NOI18N
        jPanel1.add(imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 130, 160));

        imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        jPanel1.add(imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 130, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
     int tiempoMilisegundos = 0;
     imag1 = new Ima1(tiempoMilisegundos);
     imag2 = new Ima2(tiempoMilisegundos);
     imag3 = new Ima3(tiempoMilisegundos);
     respuesta1 = false;
     Iniciar.setEnabled(false);
     imag1.start();
     imag2.start();
     imag3.start();
     
    }//GEN-LAST:event_IniciarActionPerformed

    private void Detener1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Detener1ActionPerformed
     imag1.stop();
     respuesta1 = true;
    }//GEN-LAST:event_Detener1ActionPerformed

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
            java.util.logging.Logger.getLogger(JuegoTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoTragamonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Detener1;
    private javax.swing.JButton Detener2;
    private javax.swing.JButton Detener3;
    private javax.swing.JButton Iniciar;
    public javax.swing.JLabel imagen1;
    public javax.swing.JLabel imagen2;
    public javax.swing.JLabel imagen3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
private void comprobarResultado(){
    if(respuesta1 && respuesta2 && respuesta3){
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex){
            Logger.getLogger(JuegoTragamonedas.class.getName()).log(Level.SEVERE, null, ex);
        }
        Iniciar.setEnablet(true);
        if ()
    }
}

}

