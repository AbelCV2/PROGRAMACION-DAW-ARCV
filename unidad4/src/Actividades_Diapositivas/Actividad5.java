import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Relacion_Ejercicios.Ejercicio8.Persona;

public class Actividad5 {
    public static void main(String[] args) {
        
        //double[][] temperaturas = new double[4][7];

        // String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        // String[] localidad = {"Huercal-Overa", "Pulpi", "Granada", "Sevilla"};

        // double[][] temperaturas = {
        //     {localidad[0], localidad[1], localidad[2], localidad[3]},
        //     {"Pollo", "Sándwich", "Verduras", "Atún", "Bistec", "Champiñones", "Espagueti"};
        // }

        double[][] temperaturas = {
        //  L1  L2  L3  L4
            {0 , 0 , 0 , 0}, //LUNES
            {0 , 0 , 0 , 0}, //MARTES
            {0 , 0 , 0 , 0}, //MIERCOLES
            {0 , 0 , 0 , 0}, //JUEVES
            {0 , 0 , 0 , 0}, //VIERNES
            {0 , 0 , 0 , 0}, //SABADO
            {0 , 0 , 0 , 0} //DOMINGO
        };

        //double[][] temperaturas = new double[7][4];

        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        String[] localidad = {"Huercal", "Pulpi", "Granada", "Sevilla"};

        Scanner sc = new Scanner(System.in);
        
        System.out.println("=PUNTO 1=");

        double temp;

        System.out.println();


        System.out.println("Introduzca las temperaturas de la primera localidad: "+localidad[0]);

        for (int i=0 ; i<7 ; i++) {
            temp=sc.nextDouble();
            temperaturas[i][0]=temp;
        }

        System.out.println("Temperaturas de la primera localidad:");

        for (int i=0 ; i<7 ; i++) {
            System.out.print(temperaturas[i][0]+" | ");
        }

        System.out.println();

        System.out.println("================================================");

        System.out.println();

        System.out.println("Introduzca las temperaturas de la segunda localidad: "+localidad[1]);

        for (int i=0 ; i<7 ; i++) {
            temp=sc.nextDouble();
            temperaturas[i][1]=temp;
        }

        System.out.println("Temperaturas de la segunda localidad:");

        for (int i=0 ; i<7 ; i++) {
            System.out.print(temperaturas[i][1]+" | ");
        }
        System.out.println();

        System.out.println("================================================");

        System.out.println();

        System.out.println("Introduzca las temperaturas de la tercera localidad: "+localidad[2]);

        for (int i=0 ; i<7 ; i++) {
            temp=sc.nextDouble();
            temperaturas[i][2]=temp;
        }

        System.out.println("Temperaturas de la tercera localidad:");

        for (int i=0 ; i<7 ; i++) {
            System.out.print(temperaturas[i][2]+" | ");
        }
        System.out.println();

        System.out.println("================================================");

        System.out.println();

        System.out.println("Introduzca las temperaturas de la cuarta localidad: "+localidad[3]);

        for (int i=0 ; i<7 ; i++) {
            temp=sc.nextDouble();
            temperaturas[i][3]=temp;
        }

        System.out.println("Temperaturas de la cuarta localidad:");

        for (int i=0 ; i<7 ; i++) {
            System.out.print(temperaturas[i][3]+" | ");
        }

        // PUNTO 2
        System.out.println();

        System.out.println("================================================");

        System.out.println();
        // MOSTRAR LA MATRIZ CON LAS TEMPERATURAS ORGANIZADAS POR LOCALIDAD Y DIA
        
        System.out.println(localidad[0]+" "+localidad[1]+" "+localidad[2]+" "+localidad[3]);
        for (int k=0 ; k<dias.length ; k++) {
            System.out.println(dias[k]+" | ");
        }
        for (int i=0 ; i<temperaturas.length ; i++) {
            
            for (int j=0 ; j<temperaturas[i].length ; j++) {
                
                System.out.print(temperaturas[i][j]+" | ");
            }
            System.out.println();
        }
        // List<Double> listaTemperaturas = new ArrayList<>();

        // double temp;

        // int limite=0;

        // System.out.println("Ingresa las temperaturas de los 7 dias de la localidad:");
        // temp=sc.nextDouble();
        // listaTemperaturas.add(0, temp);
        // do{
        //     temp=sc.nextDouble();

        //     for (int i=0 ; i<6 ; i++) {
        //         listaTemperaturas.add(temp);
        //     }

    

        //     limite++;
        // }while(limite<7);

        // double temp;

        // System.out.println("Ingrese la temperatura de la primera localidad:");

        // temp=sc.nextDouble();

        // int limitebucle1=0;

        // do {
        //     temp=sc.nextDouble();
        //     limitebucle1++;

        //     for (int i=0 ; i<temperaturas[0].length ; i++) {
        //         temperaturas[0][i]=temp;

        //         System.out.println(temperaturas[0][i]);
        //     }
        // }while(limitebucle1<7);



        //     double temp;

        //     int numeroLocalidad;

        //     int limite=0;

            
        //     do{
        //         System.out.println("Ingrese la siguiente temperatura:");

        //         temp=sc.nextDouble();

        //         for (int i=0 ; i<7 ; i++) {
        //             temperaturas[i][0]=temp;
        //             System.out.println(temperaturas[0][i]);
        //         }

        //         limite++;
        //     }while(limite<7);
        
        
        // System.out.println("Temperaturas del lunes a domingo de la localidad 1: ");

        // System.out.println("Empezaremos por la localidad: "+localidad[0]);
        // System.out.println("Ingrese las 7 temperaturas registradas de la localidad:");

        // Scanner sc = new Scanner(System.in);

        // temp=sc.nextDouble();

        // // temperaturas[0][0] = temp;
        // int contador=0;

        // for(int i=0 ; i<temperaturas.length ; i++) {
        //     for (int j=0 ; j<temperaturas[i].length ; j++) {
        //         temperaturas[i][j]=temp;
        //     }
        // }


        
    }
}
