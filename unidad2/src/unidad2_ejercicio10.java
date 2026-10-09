import java.util.Scanner;
public class unidad2_ejercicio10 {
    public static int Pares(int num) {
        if (num<10) {
            return num;
        }

        else {
            return (int)Math.log10(num)+1;//(num%10) * (int)Math.pow(10,dig); //+Pares(num/10, dig);
        }
    }

    //public static int Impares(int num) {

    //}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;

        System.out.println("Ingrese su numero:");
        num=sc.nextInt();

        int dig=0;

        System.out.println(Pares(num));




    }
}
