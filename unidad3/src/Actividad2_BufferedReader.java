import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.time.LocalDate;

public class Actividad2_BufferedReader {
    public static void main(String[] args) {
        String contenido;
        
        try {
            //Ruta que voy a ingresar por teclado para que lo busque
            String ruta;

            //Le doy a la variable la ruta escrita por teclado
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la ruta del archivo:");

            ruta=sc.nextLine();
            
            //Con la ruta escrita, ahora uso otro Scanner para leer dicho archivo usando la ruta
            Scanner leerArchivo = new Scanner(new File(ruta));

            //Ahora con el archivo leido, quiero que cree otro archivo con el mismo contenido
            //Y mismo nombre (añadiendo copia y fecha) --> usar LocalDate


            //Usar PrintWriter para escribir el contenido en otro archivo con el formato copia y fecha
            PrintWriter escribirArchivo = new PrintWriter("nombre_ejemplo"+"_copy_"+LocalDate.now()+"_.txt");

            
            //Proceso de copia de contenido

            while (leerArchivo.hasNextLine()) { //Mientras el archivo tenga lineas
                String linea = leerArchivo.nextLine(); // "linea" leera las lineas del .txt
                escribirArchivo.println(linea); // escribirArchivo escribira las lineas en el nuevo archivo copia
            }

            System.out.println("El archivo ha sido creado con exito"); //Mensaje para confirmar su creacion
            
        
            //CERRAMOS EL SCANNER
            leerArchivo.close();
            escribirArchivo.close();


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
