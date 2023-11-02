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
}
    
   