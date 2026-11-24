//Copiar el contenido de una matriz a otra

public class Practica1 {
    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,4,5};

        int[] numeros_copia = {0,0,0,0,0};
        
        for(int i=0 ; i<numeros.length ; i++) {
            numeros_copia[i]=numeros[i];
        }

        System.out.println("Matriz original: ");

        for(int i=0 ; i<numeros.length ; i++) {
            System.out.print(numeros[i]+" - ");
        }

        System.out.println();
        
        System.out.println("Matriz copia:");

        for(int i=0 ; i<numeros_copia.length ; i++) {
            System.out.print(numeros_copia[i]+ " - ");
        }
    }
}
