import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Entrada {

    private List<Subsidio> subsidios;

    public Entrada() {
        subsidios = new ArrayList<>();
        cargarDesdeArchivo();
    }

    private void cargarDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("subsidios.csv"))) {
            while (scanner.hasNextLine()) {
                String[] datosSubsidios = scanner.nextLine().split(",");
                Subsidio temp = new Subsidio(datosSubsidios[2], Integer.parseInt(datosSubsidios[3]), datosSubsidios[4]);
                subsidios.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de municipios: " + e.getMessage());
        }
    }
    
   public int[] subsidiosPorEstadoTodos(){
        int subsidiosDia[] = new int [8];
        int i=0;
        while (i<subsidios.size()){
            Subsidio temp = subsidios.get(i);
            
            switch (temp.estado) {
                case "Asignados": subsidiosDia[0] += 1;
                                break;
                case "Renuncias al subsidio":   subsidiosDia[1] += 1;
                                break;
                case "Apto con subsidio vencido":  subsidiosDia[2] += 1;
                                break;
                case "Asignado con aplicacion en Vivienda Gratuita":   subsidiosDia[3] += 1;
                                    break;
                case "Restitucion SFV por Indemnizacion":  subsidiosDia[4] += 1;
                                break;
                case "Restitucion de subsidios no aplicados": subsidiosDia[5] += 1;
                                break;
                case "Renuncia a la postulacion":  subsidiosDia[6] += 1;
                                break;
                default:    subsidiosDia[7]+=1;
                            break;
            }
            i++;
        }
        return subsidiosDia;
    }
    
    public int[] subsidiosPorEstado2014() {
        int subsidiosDia[] = new int[8];
        int i = 0;
        while (i < subsidios.size()) {
            Subsidio temp = subsidios.get(i);

            if(temp.anio>2013){
                switch (temp.estado) {
                    case "Asignados":
                        subsidiosDia[0] += 1;
                        break;
                    case "Renuncias al subsidio":
                        subsidiosDia[1] += 1;
                        break;
                    case "Apto con subsidio vencido":
                        subsidiosDia[2] += 1;
                        break;
                    case "Asignado con aplicacion en Vivienda Gratuita":
                        subsidiosDia[3] += 1;
                        break;
                    case "Restitucion SFV por Indemnizacion":
                        subsidiosDia[4] += 1;
                        break;
                    case "Restitucion de subsidios no aplicados":
                        subsidiosDia[5] += 1;
                        break;
                    case "Renuncia a la postulacion":
                        subsidiosDia[6] += 1;
                        break;
                    default:
                        subsidiosDia[7]+=1;
                        break;
                }
            }
            i++;
        }
        return subsidiosDia;
    }
    
    
}
