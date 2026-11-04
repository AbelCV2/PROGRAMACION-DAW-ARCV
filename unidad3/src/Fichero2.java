import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fichero2 {
    public static void leerDatos(String ruta) {
        int partidasJugador1=0,partidasJugador2=0, partidasJugador3=0;
        try {
            Scanner sc = new Scanner(new File(ruta)); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
            
            String linea = sc.nextLine();
            Scanner scLinea = new Scanner(linea);
            while (sc.hasNext()) {
             //Lectura de toda la línea
            
            //Sobre la línea leída vamos a ver qué partes la componen
                scLinea.useDelimiter("[=\\s]+");
                String jugador = scLinea.next();
                int partidas = scLinea.nextInt();

                if(jugador.equals("jugador1")){
                    partidasJugador1=partidas;
                }

                else if(jugador.equals("jugador2")){
                    partidasJugador2=partidas;
                }

                else {
                    partidasJugador3=partidas;
                }
            
            }
        scLinea.close();
        
    
        System.out.println(partidasJugador1+"-"+partidasJugador2+"-"+partidasJugador3);
        sc.close();
    
        } catch (FileNotFoundException e) {
        System.out.println("No se encuentra el fichero.");
        }    
    }


    public static void main(String[] args) {
        leerDatos("./unidad3/src/Victorias.txt");
    }
}

//CORREGIR EN CASA