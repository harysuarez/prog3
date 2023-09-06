package com.mycompany.lab2;

import java.util.Scanner;

public class Lab2 {
    static int primeraMatriz[][] = new int [3][3];
    static int segundaMatriz[][] = new int [3][3];
    int resultado[][] = new int [3][3];
    
    public static void main(String[] args) {
        System.out.println("--------BIENVENIDOS--------");
        System.out.println("1. Calculadora de matrices\n2. Ordenar arreglo de números\n3. Carros");
        Scanner cin = new Scanner(System.in);  
        OperacionesMatrices OpMat= new OperacionesMatrices();
        int opc = cin.nextInt();
        
        switch (opc){
        case 1: 
             System.out.println("--------CALCULADORA DE MATRICES--------");
             System.out.println("1. Suma \n2. Producto \n3. Producto de un escalar \n4. Transpuesta");
          
          
             int opc2 = cin.nextInt();
             
             switch(opc2){
                 case 1:
                     System.out.println("Ingrese la primera matriz: ");
                     for (int i = 0; i<3; i++){
                         for (int j = 0; j<3; j++){
                    System.out.println("Digite un elemento en la posición ["+i+"]["+j+"]: ");    
                    primeraMatriz[i][j]=cin.nextInt(); 
                         }
                     }
                     System.out.println("Ingrese la segunda matriz: ");
                     for (int i = 0; i<3; i++){
                         for (int j = 0; j<3; j++){
                    System.out.println("Digite un elemento en la posición ["+i+"]["+j+"]: ");    
                    segundaMatriz[i][j]=cin.nextInt(); 
                         }
                     }
                     
                    System.out.println("La suma de la matriz es: " + OpMat.sumaMatrices());
                 
                     break;
                 case 2:
                     break;
                 case 3:
                     break;      
                 case 4:
                     break;
                 default:
                                
             }
        case 2: 
             
             
    }
    }
}
