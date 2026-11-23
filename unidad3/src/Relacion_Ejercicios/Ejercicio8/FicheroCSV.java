// package Relacion_Ejercicios.Ejercicio8;

// import com.opencsv.CSVReader;
// import com.opencsv.exceptions.CsvValidationException;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.List;

// public class FicheroCSV {
    
//     public static void main(String[] args) {
//         List<Persona> listaPersona = new ArrayList<>();
//         try (CSVReader reader = new CSVReader(new FileReader("./unidad3/src/Relacion_Ejercicios/Ejercicio8/Personas.csv"))) {
//             String[] fila;
//             boolean esPrimeraLinea=true;

//             while ((fila = reader.readNext()) != null) {
//                 for(String celda : fila) {
//                     //System.out.println(celda+" | ");

//                     if(esPrimeraLinea) {
//                         esPrimeraLinea=false;
//                         continue;
//                     }

//                     String[] datos=fila.split(";");
//                 }

//                 System.out.println();
//             }
//         }catch (IOException | CsvValidationException e) {
//             e.printStackTrace();
//         }
//     }
// }

// INTENTE UTLIZAR UNA LIBRERIA CAPAZ DE LEER LOS ARCHIVOS CSV, PERO NO PUDE INTERPRETARLO BIEN.... (APRENDER MAS ADELANTE)
