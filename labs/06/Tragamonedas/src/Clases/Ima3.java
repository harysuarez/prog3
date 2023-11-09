package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class Ima3 extends Thread {
    private int tiempo;
    
    public Ima3(int milisegundos){
        this.tiempo = milisegundos;
    }
    public void run(){
        while (true){
            int num = (int)(Math.random()*8)+1;
            String ruta = "src\\Imagenes\\" + num + ".png";
            ImageIcon imageIcon = new ImageIcon(ruta);
            (new Interfaz.JuegoTragamonedas()).imagen3.setIcon(imageIcon);
            try {
                Thread.sleep(this.tiempo);  
            } catch (InterruptedException ex){
                Logger.getLogger(Ima3.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    } 
}