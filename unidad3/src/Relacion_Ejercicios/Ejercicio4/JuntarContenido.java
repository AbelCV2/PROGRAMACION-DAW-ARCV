package Relacion_Ejercicios.Ejercicio4;

import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class JuntarContenido {
    public static void main(String[] args) {
        try {
            //ESTABLECER LAS RUTAS DE MIS DOS FICHEROS
            
            Scanner sc = new Scanner(System.in);
            
            String ruta1;
            
            System.out.println("Ingrese la ruta del primer fichero:");
            
            ruta1=sc.nextLine();
            
            File fichero1 = new File(ruta1);

            String ruta2;

            System.out.println("Ingrese la ruta del segundo fichero:");

            ruta2=sc.nextLine();

            File fichero2 = new File(ruta2);

            //Dar una ruta para el fichero final con los contenidos combinados

            // String rutasalida;

            // System.out.println("Ingrese la ruta de salida del fichero final:");

            // rutasalida=sc.nextLine();

            //Leer los contenidos de ambos ficheros

            //Fichero 1 y 2

            Scanner leerArchivo1 = new Scanner(new File(ruta1));
            Scanner leerArchivo2 = new Scanner(new File(ruta2));

            String rutaSalida = "./unidad3/src/Relacion_Ejercicios/Ejercicio4";
            // PrintWriter escribirArchivo = new PrintWriter(ficherosalida);
            File ficheroSalida = new File(rutaSalida, fichero1.getName().replace(".txt", "")+"_"+fichero2.getName().replace(".txt", "")+".txt");
            PrintWriter escribirArchivo = new PrintWriter(ficheroSalida);

            while (leerArchivo1.hasNextLine() && leerArchivo2.hasNextLine()) { //Mientras el archivo tenga lineas
                String linea1 = leerArchivo1.nextLine(); // "linea" leera las lineas del .txt
                String linea2 = leerArchivo2.nextLine();
                escribirArchivo.println(linea1); // escribirArchivo escribira las lineas en el nuevo archivo copia
                escribirArchivo.println(linea2);    
            }

            leerArchivo1.close();
            leerArchivo2.close();
            escribirArchivo.close();

            System.out.println("El archivo ha sido creado con exito");

        }catch(Exception e) {
            System.out.println("Ha ocurrido un error "+e.getMessage());
        }

    }
}
