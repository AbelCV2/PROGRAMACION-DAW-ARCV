import java.util.Scanner;

public class numeroaleatorio {
    public static void main(String[] args) {
        // int numero;
        // int minimo;
        // int maximo;
        // int intentos;
        // int min=1;
        // int max=100;
        // int prueba;
        // int contador=0;

        // numero=(int)(Math.random() * (max-min+1)+min);
        // System.out.println("El numero que tienes que adiviniar es: "+numero);
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Ingrese su numero:");
        // prueba=sc.nextInt(); sc.nextLine();


        // if (prueba==numero) {
        //     System.out.println("Felicidades, has adivinado el numero: "+numero);
        // }

        // else {
        //    do {
            
        //     if (prueba<numero) {
        //         contador++;
        //         System.out.println("Tu numero es menor, prueba con uno mas grande");
        //         prueba=sc.nextInt();
        //     }

        //     else {
        //         contador++;
        //         System.out.println("Tu numero es mayor, prueba con uno mas pequeño");
        //         prueba=sc.nextInt();
        //     }
        // }while(prueba==numero);

        // if (prueba==numero) {
        //     System.out.println("Lo lograste adivinaste el numero: "+prueba+" despues de "+contador+" intentos");

        //    }

        // }
        int numero, aleatorio, intentos=0;
        boolean encontrado=false;
        aleatorio=(int)(Math.random() * (100-1+1)+1);
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 100:");
        numero=sc.nextInt(); sc.nextLine();

        do {
            if (numero<aleatorio) {
                intentos++;
                System.out.println("Tu numero es menor, prueba con uno mas grande");
                numero=sc.nextInt(); sc.nextLine();
            }

            else if (numero>aleatorio) {
                intentos++;
                System.out.println("Tu numero es mayor, prueba con uno mas pequeño");
                numero=sc.nextInt(); sc.nextLine();
            }

            else {
                encontrado=true;
                System.out.println("Felicidades, has adivinado el numero: "+aleatorio+" despues de "+intentos+" intentos");
            }
            intentos++;
        }while(!encontrado);


    }
}
