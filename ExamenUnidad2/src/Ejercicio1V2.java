import java.util.Scanner;

public class Ejercicio1V2 {
    
    public static boolean SonPareja(boolean valor) {
        if (valor=true) {
            return true;
        }

        else {
            return false;
        }
    }
    
    public static int IdentificarDia (String dia) {
        if (dia.equalsIgnoreCase("Lunes")) {
            return 1;
        }
        else if (dia.equalsIgnoreCase("Martes")) {
            return 2;
        }
        else if (dia.equalsIgnoreCase("Miercoles")) {
            return 3;
        }
        else if (dia.equalsIgnoreCase("Jueves")) {
            return 4;
        }
        else if (dia.equalsIgnoreCase("Viernes")) {
            return 5;
        }

        else if (dia.equalsIgnoreCase("Sabado")) {
            return 6;
        }

        else if (dia.equalsIgnoreCase("Domingo")) {
            return 7;
        }
        
        else {
            return 0;
        }
    }

    public static int IdentificarDescuento (boolean tarjeta, int preciounitario) {
        int descuento;
        if (tarjeta=true) {
            return descuento=preciounitario-(preciounitario/10);
        }

        else {
            return descuento=0;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Venta de entradas CineCampa");

        Scanner sc=new Scanner(System.in);

        int entradas=0;
        String dia;
        boolean tarjeta;
        int preciounitario=8;

        boolean pareja;
        
        int descuento;

        if (IdentificarDia("Lunes")==1) {
            preciounitario=8;
        }
        
        else if (IdentificarDia("Miercoles")==3) {
            preciounitario=5;
        }

        else if (IdentificarDia("Martes")==2) {
            preciounitario=8;
        }

        else if (IdentificarDia("Jueves")==4) {
            if(SonPareja(true))
            preciounitario=5;

            else {
                preciounitario=8;
            }
        }

        else if (IdentificarDia("Viernes")==5) {
            preciounitario=8;
        }

        else if (IdentificarDia("Sabado")==6) {
            preciounitario=8;
        }

        else if (IdentificarDia("Domingo")==7) {
            preciounitario=8;
        }


        System.out.println("Numero de entradas:");
        entradas=sc.nextInt();

        System.out.println("Dia de la semana:");
        dia=sc.next();


        //System.out.println(dia);

        System.out.println("Tiene tarjeta CineCampa?");
        tarjeta=sc.nextBoolean();

        System.out.println("Son pareja?");
        pareja=sc.nextBoolean();
        //System.out.println(tarjeta);

        System.out.println("Aqui tiene sus entradas. Gracias por su compra");

        System.out.println("Numero de entradas: "+entradas);
        System.out.println("Precio por entrada individual: "+preciounitario);

        
        

        int total=(entradas * preciounitario);
        System.out.println("Total: "+total);

        descuento=IdentificarDescuento(tarjeta, preciounitario);
        System.out.println(descuento);

        //System.out.println("A pagar: "+(total-descuento));

    }
}

    //         if (recuperacion.equalsIgnoreCase("apto")) {  //.equals() es para comparar el contenido (distingue entre mayusculas y minusculas) | .equalsIgnoreCase() es para comparar el contenido (no distingue entre mayuculas y minusculas)
    //             System.out.println("Usted ha aprobado con 5");
    //         }
