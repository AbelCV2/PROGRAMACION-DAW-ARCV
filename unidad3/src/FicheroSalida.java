import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicheroSalida {
    public static void main(String[] args) {
        String contenido = "asdasdads";
        try {
            
            //ESTO ES CON EL PRINTWRITER:
            // PrintWriter escritor = new PrintWriter("./ejemplo.txt");
            // escritor.println(contenido); //Escribimos la cadena y añadimos un salto de linea
            // escritor.close(); //Cerramos el PrintWriter
            // System.out.println("Archivo creado.");
            
            
            //ESTO ES CON EL BUFFEDWRITER:
            FileWriter archivo = new FileWriter("ejemplo.txt", true); //---> EL TRUE ES PARA ESCRIBIR SOBRE LO QUE YA ESTA ESCRITO, SIN MACHACAR LO ANTERIOR
            BufferedWriter escritor = new BufferedWriter(archivo);
            escritor.write(contenido); // Escribimos la cadena en el archivo
            escritor.newLine(); // Añadimos una nueva línea
            escritor.close(); // Cerramos el BufferedWriter
            System.out.println("¡Archivo escrito con éxito!");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
