import java.util.Scanner;

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

        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        String[] localidad = {"Huercal", "Pulpi", "Granada", "Sevilla"};

        System.out.println("=PUNTO 1=");

        System.out.println();


        double temp;

        System.out.println("Empezaremos por la localidad: "+localidad[0]);
        System.out.println("Ingrese las 7 temperaturas registradas de la localidad:");

        Scanner sc = new Scanner(System.in);

        temp=sc.nextDouble();

        // temperaturas[0][0] = temp;
        int contador=0;

        for(int i=0 ; i<temperaturas.length ; i++) {
            for (int j=0 ; j<temperaturas[i].length ; j++) {
                temperaturas[i][j]=temp;
            }
        }


        
    }
}
