
package com.mycompany.temporizadores;
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();
        List<Temporizador> tareas = new ArrayList<>();

        while (true) {
            System.out.println("1. Crear temporizador");
            System.out.println("2. Detener temporizador");
            System.out.println("3. Reiniciar temporizador");
            System.out.println("4. Mostrar todos los temporizadores iniciados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el mensaje del temporizador: ");
                scanner.nextLine(); // Consume la nueva línea
                String mensaje = scanner.nextLine();
                System.out.print("Ingrese el tiempo de espera en milisegundos: ");
                long tiempoEspera = scanner.nextLong();
                Temporizador tarea = new Temporizador(mensaje);
                timer.schedule(tarea, tiempoEspera);
                tareas.add(tarea);
                System.out.println("Temporizador creado.");
            } else if (opcion == 2) {
                System.out.print("Ingrese el mensaje del temporizador a detener: ");
                scanner.nextLine(); // Consume la nueva línea
                String mensaje = scanner.nextLine();
                for (Temporizador task : tareas) {
                    if (task.mensaje.equals(mensaje)) {
                        task.cancel();
                        tareas.remove(task);
                        System.out.println("Temporizador detenido.");
                        break;
                    }
                }
            } else if (opcion == 3) {
                System.out.print("Ingrese el mensaje del temporizador a reiniciar: ");
                scanner.nextLine(); // Consume la nueva línea
                String mensaje = scanner.nextLine();
                for (Temporizador task : tareas) {
                    if (task.mensaje.equals(mensaje)) {
                        task.cancel();
                        tareas.remove(task);
                        System.out.print("Ingrese el nuevo tiempo de espera en milisegundos: ");
                        long tiempoEspera = scanner.nextLong();
                        Temporizador nuevaTarea = new Temporizador(mensaje);
                        timer.schedule(nuevaTarea, tiempoEspera);
                        tareas.add(nuevaTarea);
                        System.out.println("Temporizador reiniciado.");
                        break;
                    }
                }
            } else if (opcion == 4) {
                System.out.println("Temporizadores iniciados:");
                for (Temporizador task : tareas) {
                    long tiempoTranscurrido = task.obtenerTiempoTranscurrido();
                    System.out.println(task.mensaje + " (Tiempo transcurrido: " + tiempoTranscurrido + " ms)");
                }
            } else if (opcion == 5) {
                break;
            }
        }

        scanner.close();
        timer.cancel();
    }
}

