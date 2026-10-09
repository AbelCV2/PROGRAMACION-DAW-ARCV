import java.util.Scanner;

public class pruebasdig {
    
    public static int Impares (int num, int contador) {
        if (num<10) {
            return 1;
        }

        else {
            do {
                int ultimodig;
                ultimodig=num%10;

                if (ultimodig%2==0) {
                    num=Math.divideExact(num, 10);
                }

                else {
                    contador++;
                    num=Math.divideExact(num, 10);
                }
            }while(num!=0);
            return contador;
        }

    }
    public static int Pares (int num, int contador) {
        if (num<10) {
            return 1;
        }

        else {
            do {
                //EJEM 418
                int ultimodig;
                ultimodig=num%10; //8

                if (ultimodig%2==0) { //8 ES PAR?
                contador++; //SI, ASI QUE CONTADOR+1
                num=Math.divideExact(num, 10); //NUM=418/10=41,8 SIN EL DECIMAL OSEA 41
                
                }

                else {
                    num=Math.divideExact(num, 10);
                }

            
        }while(num!=0);
        return contador;
        }
    }
    public static void main(String[] args) {
        int num;
        int contador=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su numero:");

        num=sc.nextInt();

        if (num<10 && num%2==0) {
            System.out.println("Su numero tiene un solo digito par");
        }

        else if (num<10 && num%2!=0) {
            System.out.println("Su numero tiene un solo digito impar");
        }

        else {
        System.out.println("Su numero tiene "+Pares(num, contador)+" digitos pares y "+Impares(num, contador)+" digitos impares");
        }
        
    }
}
