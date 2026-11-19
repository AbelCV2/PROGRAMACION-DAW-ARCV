import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class Actividad2_BufferedReaderCorreccion {
    public static void copiarArchivo() {
        try {
            //Tengo archivo para leer
            Scanner ficheroLeer = new Scanner("./unidad3/src/ficheroprueba.txt");

            //Tengo un archivo para escribir
            PrintWriter ficheroEscribir = new PrintWriter("./unidad3/src/ficheroEscribir.txt");

            while(ficheroLeer.hasNextLine()){
                String linea=ficheroLeer.nextLine();
                ficheroEscribir.println(linea);
            }
            ficheroLeer.close();
            ficheroEscribir.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        
    }
}
