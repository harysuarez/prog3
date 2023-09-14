public class Salida {
  public static void printMat(double mat[][]) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++)
        System.out.printf("%6.2f", mat[i][j]);
      System.out.println();
    }
  }

  public static void printMat(double mat[][], String head) {
    System.out.print(head);
    printMat(mat);
  }
}