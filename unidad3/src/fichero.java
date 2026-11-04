import java.io.File;

public class fichero {
    public static void main(String[] args) {
        
        // System.out.println("Directorio actual: " + new File(".").getAbsolutePath());

        try {
        File fichero = new File("./unidad3/src/FicheroEjemplo.txt");

        if (fichero.exists()) {
            System.out.println("Nombre del archivo: "+fichero.getName());
            System.out.println("Ruta : "+fichero.getPath());
            System.out.println("Ruta Absoluta: "+fichero.getAbsolutePath());
            System.out.println("Se puede escribir: "+fichero.canRead());
            System.out.println("Se puede leer: "+fichero.canWrite());
            System.out.println("Tamano: "+fichero.length());
            System.out.println("¿Se puede abrir?: "+fichero.canExecute());
        }

        else {
            throw new Exception("El fichero no existe");
        }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }

        //fichero.close();


        //CLASE SCANNER --> CONFORME VOY LEYENDO LINEAS VOY MOSTRANDO LINEAS (LEER ENTERO)
        //CLASE FILE READER, Y CLASE BUFFEREDREADER --> LEER UNA LINEA Y COPIARLA A OTRA LINEA


    }
}
