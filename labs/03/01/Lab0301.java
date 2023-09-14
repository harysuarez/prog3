package com.mycompany.lab0301;
import java.util.LinkedList;
import java.util.Queue;

public class Lab0301 {
    Queue<Integer> regis = new LinkedList <>();
    public static void main(String[] args) {
    registro_estudiante();
    registro_asignaturas();
    reporte_registrofinal();
    }
public static void registro_estudiante(){
    int codigo = Entrada.readInt("Codigo estudiante: ");
    String nombre = Entrada.readText("Nombre estudiante: ");
    String correo = Entrada.readText("Correo estudiante: ");
    int semestre = Entrada.readInt("Semestre");
}
public static void registro_asignaturas(){
    
}
public static void reporte_registrofinal(){
    
}
}
