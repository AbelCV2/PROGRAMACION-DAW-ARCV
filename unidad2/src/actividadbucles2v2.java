import java.util.Scanner;
public class actividadbucles2v2 {
    public static void main(String[] args) {
        
        int num, num2, contador=0, factorial;

        Scanner sc=new Scanner(System.in);
         System.out.println("Introduzca un numero:");
         num=sc.nextInt();

        num2=num;

        do {
            
            contador=contador+1;
            factorial=num2-1;
            num2=num2*factorial;
        }while (num>1 && contador < num);

        System.out.println(num2);
    }
}
