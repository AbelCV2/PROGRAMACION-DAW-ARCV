package Relacion_Ejercicios.Ejercicio5;

import java.io.FileReader;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LeerFichero {
    public static void main(String[] args) {
        
        try {
            
            //Pedir la ruta por teclado
            Scanner sc = new Scanner(System.in);
            
            String ruta;

            System.out.println("Ingrese la ruta del archivo Heroes(JSON):");

            ruta=sc.nextLine();

            // Leer el fichero JSON
            Object obj = new JSONParser().parse(new FileReader(ruta));

            
            //Pedir por teclado la letra con la que va a empezar a buscar (G)
            String letra;
            System.out.println("Ingrese la letra con la cual empiezan sus heroes a buscar:");
            letra=sc.nextLine();

        
            // Convertir el contenido en un array JSON
            JSONArray heroes = (JSONArray) obj;
            System.out.printf("%-20s %-30s%n","SUPERHEROE", "ALTER EGO");
            System.out.println("-----------------------------------------------");
            

            // Recorrer los héroes del fichero (ahora es un array)
            for (Object elemento : heroes) {
                JSONObject heroe = (JSONObject) elemento;
                //Vamos a ller datos del héroe
                String superhero = (String) heroe.get("superhero");
                String publisher = (String) heroe.get("publisher");
                String alterEgo = (String) heroe.get("alter_ego");
                

                // Mostrar únicamente los héroes de DC y con el parametro de empezar con G
                if (superhero.startsWith(letra) && publisher.equals("DC Comics")) {
                    System.out.printf("%-20s %-30s%n",superhero, alterEgo);
                }
            }
            System.out.println("-----------------------------------------------");
        } catch (Exception e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
