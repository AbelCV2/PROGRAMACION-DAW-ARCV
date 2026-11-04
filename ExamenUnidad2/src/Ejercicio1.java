import java.util.Scanner;

public class Ejercicio1 {
    //Realiza un procedimiento que calcule el precio de unas entradas de cine en función
    //del número de personas y del día de la semana. El precio base de una entrada son 8€. El miércoles
    //(día del espectador), el precio base es de 5€. Los jueves son el día de la pareja, por lo que la entrada
    //para dos tiene un precio base de 11 €. Además, con la tarjeta CineCampa se obtiene un 10% de
    //descuento adicional
    //El programa pedirá el día, la cantidad de personas y si tiene la tarjeta
    //CineCampa. 

    int dia;

    public static int PrecioU_Dia (int dia) {
        int precioU;

        if (dia==1) {
            return precioU=8;
        }

        if (dia==2){
            return precioU=8;
        }

        if (dia==3) {
            return precioU=5;
        }

        if (dia==4) {
            return precioU=8;
        }

        if (dia==5) {
            return precioU=8;
        }

        if (dia==6) {
            return precioU=8;
        }

        if (dia==7) {
            return precioU=8;
        }

        else {
            return 0;
        }
    }
    
    // public static int Descuento(int dia, boolean descuento) {
    //     if (dia==1) {
    //         descuento=false;
    //     }

    //     if (dia==2) {
    //         descuento=false;
    //     }

    //     if (dia==3){
    //         descuento=true;
    //     }

    //     if (dia<=4) {
    //         descuento=false;
    //     }
    // }

    public static int CalcularTotal (int dia, int personas, int descuento) {
        int total;

        total=PrecioU_Dia(dia)*personas*descuento;
        return total;
    }


    public static void main(String[] args) {
        int dia;
        int precioU;
        boolean descuento;
        String tarjeta;
        int personas;
        Scanner sc=new Scanner(System.in);

        System.out.println("Inserte el dia:");
        dia=sc.nextInt();

        if (dia>7) {
            System.out.println("Dia incorrecto");
        }

        else {
            System.out.println("Inserte la cantidad de personas");
            personas=sc.nextInt();

            if (personas<=0) {
                System.out.println("Numero de personas incorrecto");
            }

            else {
                System.out.println("¿Tiene tarjeta?");

                tarjeta=sc.nextLine();
                
                if (tarjeta.equalsIgnoreCase("No")) {
                    System.out.println("No aplica descuento");

                    descuento=false;

                    if (descuento=false){
                        
                        int total=CalcularTotal(dia, personas, 1);
                        System.out.println(total);
                        
                    }
                }

                else if (tarjeta.equalsIgnoreCase("Si")) {
                    System.out.println("Si aplica descuento");

                    descuento=true;

                    int total=CalcularTotal(dia, personas, 1/10);
                    System.out.println(total);
                }
            }
        }

        


    }
}
