import java.util.Scanner;
public class unidad2_ejercicio2{
    public static int Pagodehoras(int hora) {
        int pago;
        if (hora<=40) {
            pago=12*hora;
            return pago;
        }

        else {
            pago=(40*12)+((hora-40)*16);
            return pago;
        }
    }
    
    public static void main(String[] args) {
       int horas, pago;
       Scanner sc=new Scanner(System.in); 
       System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana:");
       horas=sc.nextInt();

       System.out.println("El sueldo semanal que le corresponde es de: "+Pagodehoras(horas)+" euros");


    }
}

//TERMINADO!