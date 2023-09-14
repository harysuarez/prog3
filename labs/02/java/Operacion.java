public class Operacion { 
  public static double[][] suma(double [][]matA, double [][] matB) {
    double[][] matR = new double[matA.length][matA[0].length];

    for (int i = 0; i < matR.length; i++)
      for (int j = 0; j < matR[0].length; j++)
        matR[i][j] = matA[i][j] + matB[i][j];
    return matR;
  }

  public static double[][] producto(double [][]matA, double [][]matB) {
    double[][] matR = new double[matA.length][matB[0].length] ;
    for (int i = 0; i < matR.length; i++)
      for (int j = 0; j < matR[0].length; j++)
          for (int k = 0; k < matA[0].length; k++) {
        matR[i][j] = matA[i][k] * matB[k][j];
  }
      return matR;
  }
  public static double[][] productoEscalar(double escalar, double [][]matA) {
    double[][] matR  = new double[matA.length][matA[0].length];
    for (int i = 0; i < matR.length; i++)
      for (int j = 0; j < matR[0].length; j++)
        matR[i][j] = escalar * matA[i][j];
    return matR;
  }
  public static double[][]transpuesta(double [][]matA) {
    double[][] matR = new double[matA[0].length][matA.length];
      for (int i = 0; i < matR.length; i++)
              for (int j = 0; j < matR[0].length; j++)
        matR[i][j] = matA[j][i];
    return matR;
  }
}