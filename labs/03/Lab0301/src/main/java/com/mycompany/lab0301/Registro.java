
package com.mycompany.lab0301;

import java.util.LinkedList;

public class Registro {
    Estudiante estudiante;
    LinkedList<Asignatura> listAsignatura;
    
    Registro(Estudiante estudiante){
        this.estudiante = estudiante;
        listAsignatura = new LinkedList<>();
    }
}
