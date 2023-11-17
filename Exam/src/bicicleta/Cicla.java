package bicicleta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Cicla extends javax.swing.JFrame {

    int Contadorclicks;
    int ContadorPedal1;
    int ContadorPedal2;
    int clicks;
    int distanciaRecorrida;
    int tiempo;
    Timer timer;
    boolean modoAuto;
    
    public Cicla() {
        initComponents();
        setLocationRelativeTo(null);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (modoAuto) {
                    simularClick();
                }
                tiempo++;
                actualizarDatos();
            }
        });
        tiempo = 0;
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Pedal1 = new javax.swing.JButton();
        Pedal2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        manual = new javax.swing.JRadioButton();
        auto = new javax.swing.JRadioButton();
        clickTxt = new javax.swing.JTextField();
        vel = new javax.swing.JTextField();
        Iniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pedalazos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        metros = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tiempoTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pedal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicleta/Sin título.png"))); // NOI18N
        Pedal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pedal1ActionPerformed(evt);
            }
        });

        Pedal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicleta/Sin título.png"))); // NOI18N
        Pedal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pedal2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Velocidad");

        jLabel2.setText("Clicks necesarios para un pedalazo");

        jLabel3.setText("BIBICLETA");

        buttonGroup1.add(manual);
        manual.setText("Manual");
        manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualActionPerformed(evt);
            }
        });

        buttonGroup1.add(auto);
        auto.setText("Automático");
        auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoActionPerformed(evt);
            }
        });

        vel.setEditable(false);
        vel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velActionPerformed(evt);
            }
        });

        Iniciar.setText("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        jLabel4.setText("Pedalazos");

        pedalazos.setEditable(false);
        pedalazos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedalazosActionPerformed(evt);
            }
        });

        jLabel5.setText("Metros");

        metros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metrosActionPerformed(evt);
            }
        });

        jLabel6.setText("Tiempo");

        tiempoTxt.setEditable(false);
        tiempoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoTxtActionPerformed(evt);
            }
        });

        jLabel7.setText("m/s");

        jLabel8.setText("m");

        jLabel9.setText("s");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(auto)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(clickTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(manual))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Pedal1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(Pedal2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(tiempoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(vel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addComponent(pedalazos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel7))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(metros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel8))))))))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(clickTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manual)
                    .addComponent(auto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Iniciar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pedal1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pedal2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pedalazos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(metros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tiempoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pedal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pedal1ActionPerformed
        
    Contadorclicks++;
        if (Contadorclicks == clicks) {
            ContadorPedal1++;
            Pedal1.setEnabled(false);
            Pedal2.setEnabled(true);
            Contadorclicks = 0;
            distanciaRecorrida += 13;
            actualizarDatos();
        }
    }//GEN-LAST:event_Pedal1ActionPerformed

    private void Pedal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pedal2ActionPerformed
        Contadorclicks++;
        if (Contadorclicks == clicks) {
            ContadorPedal2++;
            Pedal2.setEnabled(false);
            Pedal1.setEnabled(true);
            Contadorclicks = 0;
            distanciaRecorrida += 13;
            actualizarDatos();
        }
    }//GEN-LAST:event_Pedal2ActionPerformed

    private void velActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velActionPerformed
        
    }//GEN-LAST:event_velActionPerformed

    private void autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoActionPerformed
        if (auto.isSelected()) {
            Pedal1.setEnabled(false);
            Pedal2.setEnabled(false);
            modoAuto = true;
            timer.start();
        }
    }//GEN-LAST:event_autoActionPerformed

    private void manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualActionPerformed
        if (manual.isSelected()) {
            Pedal1.setEnabled(true);
            Pedal2.setEnabled(false);
            modoAuto = false;
            timer.start();
        }
    }//GEN-LAST:event_manualActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        String text = clickTxt.getText();
        clicks = Integer.parseInt(text);

        if (auto.isSelected()) {
            Pedal1.setEnabled(false);
            Pedal2.setEnabled(false);
            modoAuto = true;
        } else {
            modoAuto = false;
            Pedal1.setEnabled(true);
            Pedal2.setEnabled(false);
            timer.start();
        }   
    }//GEN-LAST:event_IniciarActionPerformed

    private void simularClick() {
    if (Pedal1.isEnabled()) {
            Pedal1ActionPerformed(null);
        } else {
            Pedal2ActionPerformed(null);
        }
        tiempo++;
        tiempoTxt.setText(String.valueOf(tiempo));
        Pedal1ActionPerformed(null);
}

    
    private void pedalazosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedalazosActionPerformed
       
    }//GEN-LAST:event_pedalazosActionPerformed

    private void actualizarDatos() {
        vel.setText(String.valueOf(distanciaRecorrida / 10));
        pedalazos.setText(String.valueOf(ContadorPedal1 + ContadorPedal2));
        metros.setText(String.valueOf(distanciaRecorrida));
        tiempoTxt.setText(String.valueOf(tiempo));
    }
    
    private void tiempoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoTxtActionPerformed

    private void metrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metrosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cicla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton Pedal1;
    private javax.swing.JButton Pedal2;
    private javax.swing.JRadioButton auto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField clickTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton manual;
    private javax.swing.JTextField metros;
    private javax.swing.JTextField pedalazos;
    private javax.swing.JTextField tiempoTxt;
    private javax.swing.JTextField vel;
    // End of variables declaration//GEN-END:variables
}
