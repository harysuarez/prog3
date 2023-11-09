package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class Ima2 extends Thread {
    private int tiempo;
    
    public Ima2(int milisegundos){
        this.tiempo = milisegundos;
    }
    public void run(){
        while (true){
            int num = (int)(Math.random()*8)+1;
            String ruta = "src\\Imagenes\\" + num + ".png";
            ImageIcon imageIcon = new ImageIcon(ruta);
            (new Interfaz.JuegoTragamonedas()).imagen2.setIcon(imageIcon);
            try {
                Thread.sleep(this.tiempo);  
            } catch (InterruptedException ex){
                Logger.getLogger(Ima2.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    } 
}

