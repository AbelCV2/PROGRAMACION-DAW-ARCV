import java.util.Scanner;
//CREAR TRY CATCH PROPIO - NUMEROS NEGATIVOS
public class Ejercicio5 {
    public static void contarPositivos() {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca su numero positivo: ");
        
        do {
            num=sc.nextInt(); sc.nextLine();



        }while(num!=0 && num>=1);
    }
    
    public static void main(String[] args) throws Exception{
        
     //Crear excepcion (NO PUEDE INGRESAR NUMEROS NEGATIVOS)
     try {
        contarPositivos();
     }catch(Exception e) {
        System.out.println("No puede ingresar numeros negativos");
     }
        
    }
}
