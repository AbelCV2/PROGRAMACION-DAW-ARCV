public class Actividad3 {
    // public static int BuscarNumero() {
    //     int[] numeros = {0,0,0,0,0,0,0,0,0,0};

    //     int random;

    //     for(int i=0 ; i<numeros.length ; i++) {
    //         random=(int)(Math.random()*50);
    //         numeros[i]=random;

    //         System.out.print(numeros[i]+", ");

    //         if (numeros[i]==39) {
    //             System.out.println("Se encontro el numero, en la posicion: "+i);
    //         }

    //         else {
    //             System.out.println("-1");
    //         }
    //     }

        

        // for (int i=0 ; i<numeros.length ; i++) {
        //     System.out.print(numeros[i]);

        //     if (numeros[i]==49) {
        //         System.out.println("Se encontro el numero --> "+numeros[i]);
        //     }

        //     else {
        //         System.out.println("No se encontro el numero --> "+numeros[i]);
        //         System.out.println("-1");
        //     }
        // }


    // public static int[] BuscarNum(int[] vector) {
    //         int[] nums = {4,8,10,24,30};
            
    //         for(int i=0 ; i<vector.length ; i++) {
    //             if (nums[i]==10) {
    //                 System.out.println("Se ha encontrado el numero!");
    //                 System.out.println("En la posicion: "i);
    //             }

    //             else {
    //                 return -1;
    //             }
    //         }
    //     }


    public static void BuscaNumero3(int[] vector, int numero) {
        int encontrado=-1;
        for(int i=0 ; i<vector.length ; i++) {
            if(vector[i]==numero) {
                System.out.println("Se encontro el numero en la posicion: "+i);
            }
        }

        // return encontrado;
    }
    public static void main(String[] args) {
        //BuscarNumero();

        int[] practica = {4,5,1,8,5};

        //System.out.println(BuscaNumero3(practica, 5));

        BuscaNumero3(practica, 5);
    }
}
