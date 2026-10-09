import java.util.Scanner;

public class adivinarnumero {
    public static void main(String[] args) {
        int numero;
        int prueba;
        int max=100;
        int min=0;
        int contador=0;

        Scanner sc=new Scanner(System.in);
        numero=(int)(Math.random() * (max-min+1)+min);
        System.out.println("El numero que tienes que adivinar es: "+numero);
        System.out.println("Ingrese su numero:");
        prueba=sc.nextInt(); sc.nextLine();

        if (prueba==numero) {
            System.out.println("Adivinaste");
        }
        
        else { 
            while (prueba!=numero) {
                do {
                    if (prueba<numero) {
                        contador++;
                        System.out.println("Tu numero es muy pequeño, prueba con uno mas grande");
                        prueba=sc.nextInt(); sc.nextLine();
                    }

                    else if (prueba>numero) {
                        contador++;
                        System.out.println("Tu numero es muy grande, prueba comn uno mas pequeño");
                        prueba=sc.nextInt(); sc.nextLine();
                    }
                }while(prueba==numero);
            
                if (prueba==numero) {
                    System.out.println("Adivinaste el numero despues de "+contador+" intentos");
                }
                
                
        }

        }
    }
}

