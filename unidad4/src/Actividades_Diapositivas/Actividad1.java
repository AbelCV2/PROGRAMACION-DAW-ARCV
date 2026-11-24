public class Actividad1 {
    public static void main(String[] args) {
        
        // int[] vector={1,2,3,4};

        // for (int i=0 ; i<4 ; i++){
        //     System.out.print(vector[i]+"");
        // }

        // IMPRIME 1234

        // int[][] matriz={{1,2},{3,4}};

        // for (int i=0 ; i<2 ; i++) {
        //     for(int j=0 ; j<2 ; j++) {
        //         System.out.print(matriz[i][j]+"");
        //         System.out.println();
        //     }
        // }

        // IMPRIME 1
        //         2
        //         3
        //         4

        // ACTIVIDAD: Realiza una función que busca un número en un array e indica dónde está o devuelve -1

        // ACTIVIDAD: Realiza un programa que muestra tu horario y qué clases tienes hoy según el día de la semana

        // ACTIVIDAD: ¿Cómo harías al suma de estas dos matrices en una matriz C? 

        // A : 2 0 1        B: 1 0 1
        //     3 0 0           1 2 1
        //     5 1 1           1 1 0

        // String[][] matrizA = {
        //     {"2", "0", "1"},
        //     {"3", "0", "0"},
        //     {"5", "2", "1"}
        // };

        // String[][] matrizB = {
        //     {"1", "0,", "1"},
        //     {"1", "2", "1"},
        //     {"1", "1", "0"}
        // };

        // int[][] matrizA = { {2, 0, 1}, {3, 0, 0}, {5, 1, 1} };

        // int[][] matrizB = {{1, 0, 1}, {1, 2, 1}, {1, 1, 0}};

        // int suma=0;

        // for (int i=0; i<3; i++) {
        //     for (int j=0; j<3; j++) {
        //         suma=i+j;
        //         System.out.println(suma);
        //     }
        // }

        
        
        // EXPLICACION:


        // INT: INDICA QUE LOS DATOS QUE VOY A ALMANCENAR SON DE TIPO INT (NUMEROS ENTEROS)
        // [][]: INDICA QUE ESTOY CREANDO UN ARRAY BIDIMENSIONAL, OSEA QUE TIENE FILAS Y COLUMNAS
        // MATRIZA: ES EL NOMBRE QUE LE DOY AL ARRAY
        // =: ASIGNA LOS VALORES QUE APARECEN A CONTINUACION EN LA MATRIZ

        int[][] matrizA = {
            {2, 0, 1},
            {3, 0, 0},
            {5, 1, 1}
        };

        // POR LO TANTO TENEMOS ALGO ASI:

        //MATRIZ A:

        // 2([0][0]) 0([0][1]) 1([0][2])
        // 3([1][0]) 0([1][1]) 0([1][2])
        // 5([2][0]) 1([2][1]) 1([2][2])

        // DONDE [][] SON LAS POSICIONES DE CADA VALOR
        // IMPORTANTE: LAS POSICIONES EN ARRAYS SIEMPRE COMIENZAN CON 0, NO POR 1


        int[][] matrizB = {
            {1, 0, 1},
            {1, 2, 1},      // SE HIZO EXACTAMENTE LO MISMO CON LA MATRIZ B
            {1, 1, 0}
        };


        // ESTOS BUCLES FOR SIRVEN PARA RECORRER Y MOSTRAR TODOS LOS ELEMENTOS DE LA MATRIZ A
        // ¿COMO?

        // PRIMER FOR:
        // for (int i = 0; i < matrizA.length; i++)

        // INT I = 0 CREA LA VARIABLE I QUE COMIENZA POR 0 Y REPRESENTA LA FILA QUE ESTAMOS RECORRIENDO
        // I < MATRIZA.LENGTH ESTABLECE QUE EL BUCLE CONTINUARA MIENTRAS I SEA MENOR QUE EL NUMERO DE FILAS DE LA MATRIZ
        // I++ AUMENTA EL VALOR DE I DE 1 EN 1 DESPUES DE CADA REPETICION

        // ¿QUE ES .LENGTH? 
        // ES UNA PROPIEDAD QUE NOS PERMITE CONOCER LA CANTIDAD DE FILAS QUE TIENE UNA MATRIZ

        // EN ESTE CASO:

        // matrizA.length = 3

        // POR LO TANTO EL PRIMER FOR RECORRERA LAS FILAS 0, 1 Y 2

        // SEGUNDO FOR: 
        // for (int J = 0; J < matrizA[I].length; J++)

        // ESTE SEGUNDO BUCLE ESTA DENTRO DEL PRIMERO

        // INT J=0 CREAMOS UNA VARIABLE LLAMADA J QUE COMIENZA EN  Y REPRESENTA LA COLUMNA
        // J<MATRIZA[I].LENGTH COMPRUEBA QUE NO HAYAMOS LLEGADO AL FINAL DE LAS COLUMNAS DE LA FILA ACTUAL
        // J++ AUMENTA LA COLUMNA EN 1 DESPUES DE CADA REPETICION

        // ¿PARA QUE SIRVE EL MATRIZA[J].LENGTH?
        // NOS PERMITE CONOCER CUANTAS COLUMNAS TIENE LA FILA QUE ESTAMOS RECORRIENDO

        //POR EJEMPLO, SI I = 0 SERIA ASI:

        // matrizA[0].length

        // Y COMO ESA FILA TIENE 3 COLUMNAS, EL RESULTADO SERA 3

        // EL PRIMER FOR ES PARA RECORRER LAS FILAS
        // EL SEGUNDO FOR ES PARA RECORRER LAS COLUMNAS DE CADA FILA

        
    
        for (int i = 0; i < matrizA.length; i++) {          // RECORRE LAS 3 FILAS
            for (int j = 0; j < matrizA[i].length; j++) {  // RECORRE LAS 3 COLUMNAS 
             System.out.print(matrizA[i][j] + " ");
            }
            System.out.println(); // SALTO DE LINEA
        }

        System.out.println(); // SALTO DE LINEA


        for (int k=0; k<matrizB.length; k++) {
            for(int l=0; l<matrizB[k].length; l++) {
                System.out.print(matrizB[k][l] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("SUMA:");

        System.out.println();

        int [][] matrizC= new int[3][3]; // MATRIZ DONDE SE GUARDARA LA SUMA

        //SUMAR POSICION POR POSICION
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }


        //MOSTRAR EL RESULTADO
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++){
                System.out.print(matrizC[i][j]+" ");
            }

            System.out.println();
        }

    }


}
