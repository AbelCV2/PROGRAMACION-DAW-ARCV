import java.util.Scanner;

public class fibonacciv2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce N: ");
        int N = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        sc.close();
    }
}

