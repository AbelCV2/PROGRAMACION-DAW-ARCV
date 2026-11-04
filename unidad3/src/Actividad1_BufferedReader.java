import java.io.File;
import java.util.Scanner;

public class Actividad1_BufferedReader {
    public static void main(String[] args) {
       //Leer el archivo .txt
       
        try {

            Scanner leer = new Scanner(new File("./unidad3/src/TextoActividad1.txt"));
            String linea;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce que palabra desea buscar:");
            linea=sc.nextLine();

            sc.useDelimiter("[,;\\s]+");
            linea.equalsIgnoreCase("hola");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
