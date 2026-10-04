import java.util.Scanner;
public class actividad6 {
    public static void main(String[] args) {
        
        int operacion, ejecucion;
        double num1, num2, resultado;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Que operacion desea realizar? (1 para suma, 2 para resta, 3 para multiplicacion, 4 para division)");
        operacion = sc.nextInt();

        System.out.println("Ahora escriba -1 para ejecutar la calculadora");
        ejecucion = sc.nextInt();

        if (operacion < 1 || operacion > 4) {
            System.out.println("Operacion no valida. Por favor, introduzca un numero entre 1 y 4.");
        } 
        else if (ejecucion == -1) {
            System.out.println("Ejecutando calculadora...");

            System.out.println("Introduzca su primer numero:");
            num1 = sc.nextInt();

            System.out.println("Introduzca su segundo numero:");
            num2 = sc.nextInt();

            switch (operacion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado de la division es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
            }
        }

        else {
            System.out.println("No ejecuto la calculadora, por favor escriba -1 para ejecutar la calculadora");
        }

        // if (operacion < 1 || operacion > 4) {
        //     System.out.println("Operacion no valida. Por favor, introduzca un numero entre 1 y 4.");
        // }

        // else if (operacion==-1) {
        //     System.out.println("Ejecutando calculadora...");

        //     System.out.println("Introduzca su primer numero:");
        //     num1 = sc.nextInt();

        //     System.out.println("Introduzca su segundo numero:");
        //     num2 = sc.nextInt();

        //     switch (operacion) {
        //         case 1:
        //             resultado = num1 + num2;
        //             System.out.println("El resultado de la suma es: " + resultado);
        //             break;
        //         case 2:
        //             resultado = num1 - num2;
        //             System.out.println("El resultado de la resta es: " + resultado);
        //             break;
        //         case 3:
        //             resultado = num1 * num2;
        //             System.out.println("El resultado de la multiplicacion es: " + resultado);
        //             break;
        //         case 4:
        //             if (num2 != 0) {
        //                 resultado = num1 / num2;
        //                 System.out.println("El resultado de la division es: " + resultado);
        //             } else {
        //                 System.out.println("Error: No se puede dividir entre cero.");
        //             }
        //             break;
        //     }
        // }
        
        // System.out.println("Introduzca su primer numero:");
        // num1 = sc.nextInt();
        
        // System.out.println("Introduzca su segundo numero:");
        // num2 = sc.nextInt();
        
        // System.out.println("Introduzca la operacion que desea realizar: 1 para suma, 2 para resta, 3 para multiplicacion, 4 para division");
        // operacion = sc.nextInt();
        // resultado = 0;
        
        // switch (operacion) {
        //     case 1:
        //         resultado = num1 + num2;
        //         System.out.println("El resultado de la suma es: " + resultado);
        //         break;
        //     case 2:
        //         resultado = num1 - num2;
        //         System.out.println("El resultado de la resta es: " + resultado);
        //         break;
        //     case 3:
        //         resultado = num1 * num2;
        //         System.out.println("El resultado de la multiplicacion es: " + resultado);
        //         break;
        //     case 4:
        //         if (num2 != 0) {
        //             resultado = num1 / num2;
        //             System.out.println("El resultado de la division es: " + resultado);
        //         } else {
        //             System.out.println("Error: No se puede dividir entre cero.");
        //         }
        //         break;
        //     default:
        //         System.out.println("Operacion no valida. Por favor, introduzca un numero entre 1 y 4.");
        // }


    }
}
