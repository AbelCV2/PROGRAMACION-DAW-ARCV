import java.util.Scanner;
public class actividadbucles3v3 {
    public static void main(String[] args) {

        int edad;
        int contador;
        int minimo;
        int maximo;
        contador=0;
        maximo=0;
        minimo=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la edad:");
        edad=sc.nextInt();

        do {
            edad=sc.nextInt();
            if (contador==0) {
                minimo=edad;
                maximo=edad;
                contador=contador+1;
            }

            if (minimo>edad && edad!=1) {
                minimo=edad;
            }

            if (maximo<edad) {
                maximo=edad;
            }
        }while (edad==-1);

        System.out.println("La edad minima es: "+minimo);
        System.out.println("La edad maxima es: "+maximo);

    }
}
