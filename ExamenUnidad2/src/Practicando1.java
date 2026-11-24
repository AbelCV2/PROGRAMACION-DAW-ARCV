
import java.util.Scanner;

public class Practicando1 {

    public static double IdentificarPrecioU(String dia) {

        if (dia.equalsIgnoreCase("Lunes") || dia.equalsIgnoreCase("Martes") || dia.equalsIgnoreCase("Viernes") || dia.equalsIgnoreCase("Sabado") || dia.equalsIgnoreCase("Domingo")) {
            return 8;
        }

        if (dia.equalsIgnoreCase("Miercoles")) {
            return 5;
        }

        if (dia.equalsIgnoreCase("Jueves")) {
            return 5.5;
        }

        else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("Venta de entradas CineCampa");

        int entradas;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantas entradas desea comprar?");
        entradas = sc.nextInt();

        System.out.println("Numero de entradas: " + entradas);

        String dia;

        System.out.println("Dia de la semana:");
        dia = sc.next();

        System.out.println("Dia de la semana: " + dia);

        double preciounitario;

        preciounitario = IdentificarPrecioU(dia);

        if (preciounitario == 0) {
            System.out.println("Dia no valido");
        }

        else {

            System.out.println("Precio por entrada individual: " + preciounitario);

            boolean tarjeta;

            System.out.println("¿Tiene tarjeta?");
            tarjeta = sc.nextBoolean();

            double total;
            double descuento = 0;
            double precioTotal;

            System.out.println("Aqui tiene sus entradas. Gracias por su compra");

            // JUEVES: ENTRADAS GRUPALES

            if (dia.equalsIgnoreCase("Jueves")) {

                System.out.println("Entradas grupales: " + (entradas/2));

                preciounitario = 11;

                System.out.println("Precio por pareja de entradas: " + preciounitario);

                total = preciounitario * (entradas/2);

                System.out.println("Total: " +total);

                if (tarjeta == true) {

                    descuento = total / 10;

                    System.out.println("Usted posee tarjeta");

                    System.out.println("Descuento: " + descuento);

                }

                else {

                    System.out.println("Usted no tiene tarjeta");

                }

                precioTotal = total - descuento;

                System.out.println("A pagar: " + precioTotal);

            }

            // MIERCOLES: ENTRADAS INDIVIDUALES

            else if (dia.equalsIgnoreCase("Miercoles")) {

                System.out.println("Entradas individuales: " + entradas);

                System.out.println("Precio por entrada individual: " + preciounitario);

                total = preciounitario * entradas;

                System.out.println("Total: " + total);

                if (tarjeta == true) {

                    descuento = total / 10;

                    System.out.println("Usted posee tarjeta");

                    System.out.println("Descuento: " + descuento);

                }

                else {

                    System.out.println("Usted no tiene tarjeta");

                }

                precioTotal = total - descuento;

                System.out.println("A pagar: " + precioTotal);

            }

            // RESTO DE DIAS: ENTRADAS INDIVIDUALES

            else {

                System.out.println("Entradas individuales: " + entradas);

                System.out.println("Precio por entrada individual: " + preciounitario);

                total = preciounitario * entradas;

                System.out.println("Total: " + total);

                if (tarjeta == true) {

                    descuento = total / 10;

                    System.out.println("Usted posee tarjeta");

                    System.out.println("Descuento: " + descuento);

                }

                else {

                    System.out.println("Usted no tiene tarjeta");

                }

                precioTotal = total - descuento;

                System.out.println("A pagar: " + precioTotal);

            }

        }

        sc.close();

    }

}
