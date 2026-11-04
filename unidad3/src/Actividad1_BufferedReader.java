import java.io.File;
import java.util.Scanner;

public class Actividad1_BufferedReader {
    public static void main(String[] args) {
       //Leer el archivo .txt
       
        try {

            //Leer el .txt
            Scanner leer = new Scanner(new File("./unidad3/src/TextoActividad1.txt"));
            
            //Pedir que palabra desea buscar
            String palabra;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce que palabra desea buscar:");
            palabra=sc.nextLine();

            //Contador de las veces que aparece la palabra en el texto
            int contador=0;

            //Leer el archivo linea por linea

            while (leer.hasNextLine()) {
                String linea = leer.nextLine();

                //Separar las palabras con espacios usando el useDelimiter
                //Tengo que usar un nuevo Scanner (separar) para poder usar el useDelimiter
                Scanner separar = new Scanner(linea);
                separar.useDelimiter("[,;\\s]+");
                //Este Scanner trabaja sobre la linea que acabamos de leer
                
                //Ahora tengo que recorrer las palabras de la linea
                while (separar.hasNext()) { //Mientras haya palabras en la linea
                    String texto=separar.next(); //Saco la siguiente palabra

                    //Ahora usar el equalsIgnoreCase para distinguir mayusculas y minusculas de la palabra
                    if (texto.equalsIgnoreCase("hola")) { //"Hola" es mi palabra
                        contador++; //Si la palabra hola aparece el contador ira subiendo de 1 en 1
                    }

                }

                separar.close(); //Cerrar el Scanner (SIEMPRE CERRARLO)
            }

            
            leer.close();
            
            //Imprimir resultado
            System.out.println("La palabra "+palabra+" aparece "+contador+" veces");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

//TEXTO: Hola mundo, hola estudiantes.
//Hoy aprenderemos Java.
//HOLA es una palabra de ejemplo.
