package Relacion_Ejercicios.Ejercicio8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FicheroCSV_v2 {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        //ESTO CREA UNA LISTA VACIA DONDE SE IRAN GUARDANDO CADA OBJETO PARA MI CLASE PERSONA QUE VOY A CREAR
        //A PARTIR DE LOS DATOS DEL ARCHIVO CSV

        try {
            //BUFFERREADER PARA LEER EL ARCHIVO CSV
            BufferedReader csv=new BufferedReader(new FileReader("./unidad3/src/Relacion_Ejercicios/Ejercicio8/Personas.csv"));
            
            //VARIABLE LINEA PARA IR LEYENDO LINEA POR LINEA EL ARCHIVO CSV
            String linea;

            //ESTO ES PARA QUE PUEDA SALTARSE LA PRIMERA FILA DE LOS DATOS CON LOS NOMBRE GENERICOS
            //NOMBRE EDAD NUMERO PUEBLO ---> NO QUIERO QUE IMPRIMA ESTO TAMBIEN
            boolean esPrimeraLinea=true;


            //MIENTRAS NO SE LLEGUE AL FINAL DEL ARCHIVO (NULL)
            //IRA GUARDANDO CADA LINEA DE TEXTO LEIDA EN LA VARIABLE "LINEA"
            while((linea=csv.readLine()) != null) {
                
                //EN LA PRIMERA LINEA DEL BUCLE, ENTRA AQUI |
                                                        //  V
                
                if(esPrimeraLinea) {
                    esPrimeraLinea=false; //APAGA EL INTERRUMPTOR (LE DA EL VALOR FALSE) PARA NO VOLVER A ENTRAR
                    //Y EJECUTA CONTINUE PARA QUE EL PROGRAMA IGNORE EL RESTO DEL CODIGO DE ESA VUELTA
                    //Y SALTE DIRECTAMENTE A LEER LA SEGUNDA LINEA 
                    continue;
                }


                //INSTRUCCION CLAVE: TOMA LA LINEA COMPLETA (ABEL;21;614757435;HUERCAL OVERA) Y LA CORTA
                //CADA VEZ QUE ENCUENTRA (";") EL RESULTADO LO GUARDA EN UN ARREGLO (STRING[])
                String[] datos = linea.split(";");
                //A ESE STRING[] LO LLAMAMOS "DATOS"


                //AHORA DESDE EL ORDEN 0, EMPIEZA A ASIGNAR DATOS ENTRE CADA ; QUE HAY
                String nombre= datos[0].trim(); //TOMA EL PRIMERA PEDAZO (ABEL) Y LE APLICA ".TRIM"
                // QUE SIRVE PARA RECORTAR CUALQUIER ESPACIO EN BLANCO SOBRANTE AL INICIO O FINAL DEL TEXTO

                int edad= Integer.parseInt(datos[1].trim()); //LO MISMO CON EL SEGUNDO PEDAZO (21)

                String telefono= datos[2].trim(); //LO MISMO CON EL TERCER PEDAZO (614757435)
                
                String poblacion = datos[3].trim(); //Y TAMBIEN CON EL ULTIMO PEDAZO (HUERCAL OVERA)
                

                //AHORA LLAMAR AL CONSTRUCTO DE MI CLASE "PERSONA" Y DARLE LAS 4 VARIABLES LIMPIAS
                //PARA FABRICAR UN NUEVO OBJETO CON ESOS ATRIBUTOS
                Persona p = new Persona(nombre, edad, telefono, poblacion);

                //listaPersonas.add(p) --> METE EL OBJETO "PERSONA" RECIEN CREADO ("P") DENTRO DE UNA LISTA
                //QUE CREAMOS AL PRINCIPIO, Y EL BUCLE VUELVE A EMPEZAR CON LA SIGUIENTE LINEA DEL CSV
                listaPersonas.add(p);
            }
        }catch(IOException e) {
            System.out.println("No se pudo encontrar el archivo o esta dañado" + e.getMessage());
        }

        for (Persona p : listaPersonas) {
            System.out.println("===============================");
            System.out.println("Nombre: "+p.getNombre());
            System.out.println("Edad: "+p.getEdad());
            System.out.println("Número: "+p.getTelefono());
            System.out.println("Población: "+p.getPoblacion());
            System.out.println("===============================");
        }
    }
}
