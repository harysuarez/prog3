import java.util.Scanner;

class Captura {   // se recomienda guardarlo en un archivo .java separado
  private static Scanner leer = new Scanner(System.in);

  public static double nextDouble(String message) {
    System.out.print(message);
    return leer.nextDouble();
  }

  public static int nextInt(String message) {
    System.out.print(message);
    return leer.nextInt();
  }
  public static double [][] readMat(int filas, int cols) {
    double [][] matR = new double[filas][cols];
    for (int i = 0; i < filas; i++)
      for (int j = 0; j < cols; j++)
        matR[i][j] = nextDouble("Elem(" + i + "," + j + "): ");
    return matR;
  }

  public static double [][] readMat(int filas, int cols, String mss) {
    System.out.print(mss);
    return readMat(filas, cols);
  }
}