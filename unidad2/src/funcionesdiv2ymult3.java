import java.util.Scanner;
public class funcionesdiv2ymult3 {
    public static boolean esPar(int numero) {
        if (numero%2==0) {
            return true;
        }
        else {
            return false;
        }

        }
    public static boolean esDivisiblepor2y3(int numero) {
        if (numero%3==0 && numero%2==0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i=1; i<=20; i++) {
            if (esPar(i)==true && esDivisiblepor2y3(i)==true) {
                System.out.println(i+" es par y divislbe por 2 y 3");
            }
        }
    }

}
