package Clases;

import Interfaz.JuegoTragamonedas;
import javax.swing.SwingUtilities;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class Ima1 extends Thread {
    private int tiempo;
    private JuegoTragamonedas juegoTragamonedas;
    private volatile boolean ejecutar = true;
   
    public Ima1(int milisegundos, JuegoTragamonedas juegoTragamonedas){
        this.tiempo = milisegundos;
        this.juegoTragamonedas = juegoTragamonedas;
    }
    public void run(){
        while (ejecutar){
            int num = (int)(Math.random()*(8) +  1);
            String ruta = "src\\Imagenes\\" + num + ".png";
            ImageIcon imageIcon = new ImageIcon(ruta);
            
            SwingUtilities.invokeLater(new Runnable() {
                
            public void run() {
            juegoTragamonedas.imagen1.setIcon(imageIcon);
           
              }
             });
              try {
                Thread.sleep(this.tiempo);  
            } catch (InterruptedException ex){
                Logger.getLogger(Ima1.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    } 
     public void detener(){
        ejecutar = false;
    }
}
