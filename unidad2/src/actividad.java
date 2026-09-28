public class actividad { 
    public static void main(String[] args) {
        int min1=1;
        int max1=100;

        double aleatorio1=Math.random()*(max1-min1+1)+min1;
        System.out.println("El primer numero aleatorio es: "+aleatorio1);

        int min2=1;
        int max2=100;

        double aleatorio2=Math.random()*(max2-min2+1)+min2;
        System.out.println("El segundo numero aleatorio es: "+aleatorio2);

        double media;
        media=(aleatorio1+aleatorio2)/2;

        double potencia1;
        potencia1=Math.pow(aleatorio2, aleatorio1);

        double raiz1;
        raiz1=Math.sqrt(aleatorio1);

        double raiz2;
        raiz2=Math.sqrt(aleatorio2);

        //Falta el cociente hacerlo en casa

        
        //Respuesta final System.out.println();

    }

}
