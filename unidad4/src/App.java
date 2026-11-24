public class App {
    public static void main(String[] args) throws Exception {
        int[] num = {4, 7, 3, 9};

        // int random;

        // for(int i=0 ; i<num.length ; i++) {
        //     random=(int)(Math.random()*10);
        //     num[i]=random;

        //     System.out.print(num[i]);
        // }

        //System.out.println(num[5]); //ERROR
        int[] resultado=null;
        resultado=multiplicar(num);


        System.out.print("Resultado: ");
        for(int i=0 ; i<resultado.length ; i++) {
            System.out.print(resultado[i]+", ");
        }

        System.out.println();


        // SALIDA CUANDO SE USA EL PROPIO PARAMETRO DENTRO DE LA FUNCION

        multiplicar2(num);

        System.out.print("Resultado: ");
        
        for(int i=0 ; i<num.length ; i++) {
            System.out.print(num[i]+", ");
        }
    }

    public static int[] multiplicar(int[] vector) {
        int[] salida={0,0,0,0};

        for(int i=0 ; i<vector.length ; i++) {
            salida[i] = 2*vector[i];
        }

        return salida;
    }


    //....


    public static void multiplicar2(int[] vector) {
        for(int i=0 ; i<vector.length ; i++) {
            vector[i] = 2*vector[i];
        }
    }
}
