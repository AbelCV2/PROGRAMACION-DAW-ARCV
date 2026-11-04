import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class LeeFichero {
        public static void main(String[] args) {

            // try {
            //     BufferedReader leer = new BufferedReader(new FileReader("./unidad3/src/FicheroEjemplo.txt"));

            //     String linea;
            //     while((linea = leer.readLine()) != null) {
            //         System.out.println(linea);
            //     }
            //     leer.close();
            // } catch(Exception e) {
            //     System.out.println(e.getMessage());
            // }

            try {

                Scanner leer = new Scanner(new File("./unidad3/src/FicheroEjemplo.txt"));
                String linea;
                while (leer.hasNextLine()) {
                    System.out.println(leer.nextLine());
                }

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
}
