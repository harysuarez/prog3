package com.mycompany.carro;

/**
 *
 * @author Santiago
 */
public class Carro {

     private final String marca;
    private final String modelo;
    private final String color;
    private final int kilometraje;
    

    // Constructor
    public Carro(String marca, String modelo, String color, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getKilometraje() {
        return this.kilometraje;
        
    }
    
}