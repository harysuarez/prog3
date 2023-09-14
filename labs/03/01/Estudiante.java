
package com.mycompany.lab0301;

public class Estudiante {
    String codidgo;
    String nombre;
    String correo;
    int semestre;

    public Estudiante(String coidgo, String nombre, String correo, int semestre) {
        this.codidgo = coidgo;
        this.nombre = nombre;
        this.correo = correo;
        this.semestre = semestre;
    }

    public String getCoidgo() {
        return codidgo;
    }

    public void setCoidgo(String coidgo) {
        this.codidgo = coidgo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
}
