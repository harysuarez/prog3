//Autores: Hary Manuela Suarez y Juan Andrés Torres.

package com.mycompany.parcial2;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Temporizador extends TimerTask {
    private String mensaje;
    private long tiempoInicio; // Para registrar el tiempo de inicio

    public Temporizador(String mensaje) {
        this.mensaje = mensaje;
        this.tiempoInicio = 0; // Inicialmente no hay tiempo de inicio registrado
    }

    @Override
    public void run() {
        if (tiempoInicio == 0) {
            tiempoInicio = System.currentTimeMillis(); // Registro del tiempo de inicio al ejecutarse
        }
        System.out.println(mensaje);
    }

    public long obtenerTiempoTranscurrido() {
        if (tiempoInicio == 0) {
            return 0; // Si el temporizador nunca se ha ejecutado, el tiempo transcurrido es 0
        }
        return System.currentTimeMillis() - tiempoInicio;
    }
}