import java.util.Scanner;



public class Ejercicio1V3 {
    public static double IdentificarPrecioU (String dia) {
        if (dia.equalsIgnoreCase("Lunes")) {
            return 8;
        }

        if (dia.equalsIgnoreCase("Martes")) {
            return 8;
        }

        if (dia.equalsIgnoreCase("Miercoles")) {
            return 5;
        }

        if (dia.equalsIgnoreCase("Jueves")) {
            return 5.5;
        }

        if (dia.equalsIgnoreCase("Viernes")) {
            return 8;
        }

        if (dia.equalsIgnoreCase("Sabado")) {
            return 8;
        }

        if (dia.equalsIgnoreCase("Domingo")) {
            return 8;
        }

        else {
            return 0;
        }
    }    
    
    public static void main(String[] args) {
            System.out.println("Venta de entradas CineCampa");

            int entradas;

            Scanner sc=new Scanner(System.in);
            System.out.println("¿Cuantas entradas desea comprar?");
            entradas=sc.nextInt();
            
            System.out.println("Numero de entradas: "+entradas);

            String dia;
            System.out.println("Dia de la semana:");
            dia=sc.next();

            System.out.println("Dia de la semana: "+dia);

            double preciounitario;
            System.out.println("Precio por entrada individual: "+IdentificarPrecioU(dia));

            preciounitario=IdentificarPrecioU(dia);
            
            boolean tarjeta;

            System.out.println("¿Tiene tarjeta?");
            tarjeta=sc.nextBoolean();

            System.out.println("Aqui tiene sus entradas. Gracias por su compra");

            // if  (dia.equalsIgnoreCase("Jueves") && entradas%2==0) {
            //     System.out.println("Entradas grupales:");
            //     System.out.println(entradas/2);
            // }

            // else {
            //     preciounitario=8;
            // }

            if (dia.equalsIgnoreCase("Jueves")) {
                if (tarjeta=false) {
                    System.out.println("Entradas grupales: "+(entradas/2));
                    preciounitario=11;
                    System.out.println("Precio por entrada individual: "+preciounitario);
                
                    double total; 
                    total=(preciounitario*(entradas/2));
                    System.out.println("Total: "+total);
                }

                else {
                    System.out.println("Entradas grupales: "+(entradas/2));
                    preciounitario=11;
                    System.out.println("Precio por entrada individual: "+preciounitario);
                
                    double total; 
                    total=(preciounitario*(entradas/2));
                    System.out.println("Total: "+total);

                    double descuentotarjeta;

                    descuentotarjeta=total/10;

                    System.out.println("Descuento: "+descuentotarjeta);

                    System.out.println("A pagar: "+(total-descuentotarjeta));
                }

            if (dia.equalsIgnoreCase("Miercoles")) {
                
                if (tarjeta=false) {
                    System.out.println("Entradas individuales: "+entradas);
                    System.out.println("Precio por entrada individual: "+preciounitario);
                    double total;
                    total=preciounitario*entradas;

                    System.out.println("Total: "+total);


                    double descuento;

                    descuento=total/10;
                    System.out.println("Descuento: "+descuento);

                    System.out.println("A pagar: "+(total-descuento));
                }
            }

                else {
                    
                    
                    System.out.println("Entradas individuales: "+entradas);
                    System.out.println("Precio por entrada individual: "+preciounitario);
                    double total;
                    total=preciounitario*entradas;

                    System.out.println("Total: "+total);


                    double descuento;
                    double descuentotarjeta;

                    descuento=total/10;
                    descuentotarjeta=descuento/10;

                    double descuentototal=descuento+descuentotarjeta;
                    System.out.println("Descuento: "+(descuento+descuentotarjeta));

                    System.out.println("A pagar: "+(total-descuentototal));
                }

            // else {

            // }


           

            



        }

}
}
