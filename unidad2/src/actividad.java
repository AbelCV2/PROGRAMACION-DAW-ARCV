public class actividad { 
    public static void main(String[] args) {
        int min1=1;
        int max1=100;

        int aleatorio1=(int)(Math.random()*(max1-min1+1)+min1);
        System.out.println("El primer numero aleatorio es: "+aleatorio1);


        int aleatorio2=(int)(Math.random()*(max1-min1+1)+min1);
        System.out.println("El segundo numero aleatorio es: "+aleatorio2);

        double media;
        media=(aleatorio1+aleatorio2)/2.0;

        int potencia1;
        potencia1=(int)(Math.pow(aleatorio2, aleatorio1));

        double raiz1;
        raiz1=Math.sqrt(aleatorio1);

        double raiz2;
        raiz2=Math.sqrt(aleatorio2);

        //Falta el cociente (hacerlo en casa) y hacer los println de los resultados 
        int cociente;
        cociente=aleatorio1/aleatorio2;

        System.out.println("Los numeros aleatorios son: "+aleatorio1+" y "+aleatorio2);

        System.out.println("La media es: "+media);
        
        System.out.println("La potencia es: "+potencia1);
        
        System.out.println("La raiz cuadrada de "+aleatorio1+" es: "+raiz1);
        
        System.out.println("La raiz cuadrada de "+aleatorio2+" es: "+raiz2);
        
        System.out.println("El cociente es: "+cociente);

        //Tarea hecha 

        


    }

}
