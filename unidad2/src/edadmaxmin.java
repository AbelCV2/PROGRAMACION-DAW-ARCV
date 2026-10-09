import java.util.Scanner;

public class edadmaxmin {
    public static void main(String[] args) {
        //Halla la edad maxima y minima de un grupo de alumnos hasta que el programa lea un -1
        int edades;
        int contador;

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca las edades:");
        edades=sc.nextInt();

        do {
            System.out.println("Introduzca la siguiente edad:");
            edades=sc.nextInt();
        }while (edades>=0);
        


        //while (variable1.hasNext() {
        //if})
    }
}
