
public class Lab0201 {

    public static void main(String args[]) {
    int op = 0;
    do {
       System.out.print("\tMENÚ PRINCIPAL\n\n  1. Suma de matrices\n" +
            "  2. Producto de matrices\n  3. Producto de un escalar con una " +
            "matriz\n  4. Traspuesta de una matriz\n  5. Salir");
        op = Captura.nextInt("\n\n  Su opcion [1-5]: ");
        if (op == 5) break;
        int f = Captura.nextInt("\n# filas:");
        int c = Captura.nextInt("# columnas:");
        switch(op) {
            case 1:
                sumaMatrices(f, c);  break;
            case 2:
                prodMatrices(f, c);  break;
            case 3:
                prodMatEscalar(f, c);  break;
            case 4:
                transpMatr(f, c);
        }
    } while (true);
  }

  public static void sumaMatrices(int rows, int cols) {
      double mat1[][] = Captura.readMat(rows, cols, "\nPRIMERA MATRIZ\n");
      double mat2[][] = Captura.readMat(rows, cols, "\nSEGUNDA MATRIZ\n");
      Salida.printMat(Operacion.suma(mat1, mat2), "\nMATRIZ SUMA\n");
  }

  public static void prodMatrices(int rows, int cols) {
      double mat1[][] = Captura.readMat(rows, cols, "\nPRIMERA MATRIZ\n");
      int c2 = Captura.nextInt("\n# columnas 2a. matriz: ");
      double mat2[][] = Captura.readMat(cols, c2, "\nSEGUNDA MATRIZ\n");
      Salida.printMat(Operacion.producto(mat1, mat2), "\nMATRIZ PRODUCTO\n");
  }
  
  public static void prodMatEscalar(int rows, int cols) {
      double mat1[][] = Captura.readMat(rows, cols, "\nPRIMERA MATRIZ\n");
      double esc = Captura.nextDouble("Digite un escalar "); 
      Salida.printMat(Operacion.productoEscalar(esc, mat1), "\nMATRIZ PRODUCTO ESCALAR\n");          
  }

  public static void transpMatr(int rows, int cols) {
      double mat1[][] = Captura.readMat(rows, cols, "\nMATRIZ\n");
       Salida.printMat(Operacion.transpuesta( mat1), "\nMATRIZ TRANSPUESTA\n");        
  }
}