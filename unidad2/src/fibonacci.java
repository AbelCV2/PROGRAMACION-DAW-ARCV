import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        
    
    int num1, num2, num3, n, i;

    Scanner sc=new Scanner(System.in);

    System.out.println("Ingrese el valor de N:");  
    
    n=sc.nextInt();

    num1=0;
    num2=1;
    

    for (i=0; i<n; i++) {
        System.out.print(num1+" ");
        num3=num1+num2;
        num1=num2;
        num2=num3;
        
    }

    sc.close();
    
}
}
