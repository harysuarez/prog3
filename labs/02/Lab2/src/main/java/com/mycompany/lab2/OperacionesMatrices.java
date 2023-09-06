package com.mycompany.lab2;
public class OperacionesMatrices extends Lab2 {
    public void sumaMatrices(){
          for (int i = 0; i < primeraMatriz.length; i++){
             for (int j = 0; j < segundaMatriz.length; j++){
                resultado[i][j]=primeraMatriz[i][j]+segundaMatriz[i][j];    
                }
            }
}
}
