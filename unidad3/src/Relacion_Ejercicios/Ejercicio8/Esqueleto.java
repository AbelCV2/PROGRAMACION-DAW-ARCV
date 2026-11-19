// package Relacion_Ejercicios.Ejercicio8;

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.List;

// public class Esqueleto {

//     public static void main(String[] args) {
//         String rutaArchivo = "./unidad3/src/Relacion_Ejercicios/Ejercicio8/Personas.csv";
//         List<Persona> listaPersonas = new ArrayList<>();

//         try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
//             String linea;
//             boolean esPrimeraLinea = true;

//             while ((linea = br.readLine()) != null) {
//                 // Saltamos la fila de los encabezados (PERSONA, EDAD, NUMERO, PUEBLO)
//                 if (esPrimeraLinea) {
//                     esPrimeraLinea = false;
//                     continue;
//                 }

//                 // Aquí ocurre la magia: el método split crea el arreglo que buscas
//                 String[] datos = linea.split(",");

//                 // Asignamos cada posición del arreglo a una variable
//                 String nombre = datos[0].trim();
//                 int edad = Integer.parseInt(datos[1].trim());
//                 String numero = datos[2].trim();
//                 String poblacion = datos[3].trim();

//                 // Creamos el objeto Persona y lo guardamos en la lista
//                 Persona p = new Persona(nombre, edad, numero, poblacion);
//                 listaPersonas.add(p);
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         // Comprobación: imprimimos los datos cargados
//         for (Persona p : listaPersonas) {
//             System.out.println("Nombre: " + p.nombre + " | Edad: " + p.edad + " | Pueblo: " + p.poblacion);
//         }
//     }
// }
