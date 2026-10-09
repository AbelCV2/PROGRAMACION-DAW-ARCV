 import java.util.Scanner;
 public class actividadbucles2 {
     public static void main(String[] args) {
        
         int num;
         int contador=0;
         int factorial;

         Scanner sc=new Scanner(System.in);
         System.out.println("Introduzca un numero:");
         num=sc.nextInt();

         while (num>1 && contador!=num) {
             contador=contador+1;
             factorial=num;
             num=num*factorial;
             System.out.println(num);
            
         }

        



     }
 }




// import java.util.Scanner;
// public class actividadbucles2 {
//     public static void main(String[] args) {
        
//         int num;
//         int contador;

//         Scanner sc=new Scanner(System.in);
//         System.out.println("Introduzca un numero:");
//         num=sc.nextInt();

        
//         do {
//             contador=num;
//             num=num*contador;
//             num++;
//         }while(num>1);

//         System.out.println(num);



//     }
// }