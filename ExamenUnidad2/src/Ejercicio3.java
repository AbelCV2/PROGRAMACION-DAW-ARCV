import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Introduzca sus numeros:");
            int contadorTotal=0;
            
            int maximoimpar;
            int minimoimpar;
            int maximopar;
            int minimopar;
            do {
            
            System.out.println("Introduzca un numero aleatorio (Ingrese 0 para detener):");
            num=sc.nextInt(); sc.nextLine();
            contadorTotal=contadorTotal++;

            //PARES POSITIVOS Y NEGATIVOS
            if (num%2==0) {
                maximopar=num;
                minimopar=num;

                if (num>maximopar) {
                    maximopar=num;
                }

                if ((num<minimopar) && (num!=-1)) {
                    minimopar=num;
                }
            }

            //IMPARES POSITIVOS Y NEGATIVOS
            if (num%2!=0) {
                maximoimpar=num;
                minimoimpar=num;
                
                if (num>maximoimpar) {
                    maximoimpar=num;
                }

                if ((num<minimoimpar) && (num!=1)) {
                    minimoimpar=num;
                }
            }
        }while(num!=0);


        System.out.println("El mayor numero positivo es: "+maximopar);
        System.out.println("El menor numero negativo es: "+minimoimpar);

    }
}
