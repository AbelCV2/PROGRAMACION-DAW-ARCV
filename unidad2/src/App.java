/**
 *      
 * App
 */

import java.util.Scanner;

/**
     * 
     * @author AbelRodrigo
     * @version 1.0
     * Unidad2: Fundamentos de la programacion 
     */
//import utilidades.Matematicas;

public class App {
   /**
    * Funcion main para ejecutar codigo java
    * @param args es un argumento
    */
    public static void main(String[] args) {
        // double edad;
        // edad=400000000;
        // boolean logico=(7<5);
        // String caracter="Domingo";
        // // System.out.println("Hola, Mundo! "+edad+", "+logico+", "+caracter);
        // System.out.println((1+2+3+1)/3);
        // System.out.println((1+2+3+1)/3.0);
        
        // int a='a';
        // System.out.println(a);
        // int[]b={4,0,-1};
        // System.out.println(b);
        // System.out.println(b[2]);
        // final int VALOR;
        // VALOR=3;

        // int variable=0;
        // System.out.println(variable);

        // // Declarar varias variasbles en una linea
        // int uno=1, dos=2, tres=3;

        // /*
        // sadsdsd
        // sdsadsads
        // sddasdasd
        // */

        // CLASE 2 
        //EJEMPLO DE INTRODUCIR UN VALOR POR TECLADO
        // Scanner sc=new Scanner(System.in);
        // int numero;

        // System.out.println("Introduce un numero entre 5 y 25:");
        // numero=Integer.parseInt(sc.nextLine());
        // String nombre=sc.next();
        // System.out.println("Introduce un nombre:");
        // System.out.println("El numero introducido y nombre introducido es:  "+numero+ " y "+nombre);

        // System.out.println("Introduce tu apellido:");
        // String apellido=sc.nextLine();
        // System.out.println("El apellido es: "+apellido);
        // System.out.println("Dame tu nombre, edad, y profesion:");
        // String nombre=sc.next();
        // int edad=sc.nextInt();
        // String profesion=sc.nextLine();
        // System.out.println("Tu nombre es: "+nombre+", tu edad es: "+edad+", y tu profesion es: "+profesion);
    //     LocalDateTime hoy = LocalDateTime.now();
    // System.out.println("Hoy es: " + hoy.getDayOfWeek()); // nombre del día
    // System.out.println("El día es: " + hoy.getDayOfMonth());
    // System.out.println("El mes es: " + hoy.getMonth()); // nombre del mes
    // System.out.println("El año es: " + hoy.getYear());
    // System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());

    // System.out.println(Math.pow(2, 5));

    // int max=15;
    // int min=1;
    // char letra='a';
    // double aleatorio=(int)(Math.random()*(max-min+1)+min);
    // System.out.println(letra+aleatorio);

    // int numero1=3;
    // int numero2=5;

    // System.out.println("La suma de "+numero1+" y "+numero2+" es: "+Matematicas.suma(numero1, numero2));
    // System.out.println("La multiplicacion de "+numero1+" y "+numero2+" es: "+Matematicas.multiplicar(numero1, numero2));

    // System.out.println("El resto de dividir 5 entre 2 es: "+(5%2));

    // int variable=2;
    // System.out.println("La variable vale: "+variable);
    // variable++; // variable=variable+1;
    // System.out.println("La variable vale: "+variable);

    // // ================================
    
    // int a=5;
    // int b;
    // b=a++;

    //System.out.println("El valor de a es: "+a);
    //System.out.println("El valor de b es: "+b);  

    //TENER CUIDADO CON ESTO
    //====================================

    //No es lo mismo a++ y ++a, son diferentes
    //Revisar diapositivas en la seccion de Operadores (Cuadro)


    //int valor1=3;
    //int valor2=5;
    //int suma=valor1+valor2; //Lo tipico
    //int valor1+=valor2; //Es lo mismo de arriba pero abreviado.

    //Por lo tanto, suma=valor1+valor2; es lo mismo que valor1+=valor2;
    //HAY MAS OPERACIONES ABREVIADAS, REVISAR DIAPOSITIVAS DE OPERADORES (CUADRO)

    // x  =  a   ==   10   ?   b   *   2   :   a;
    // Si a es igual a 10, entonces x=b*2, sino x=a
    // == IGUAL / ? ENTONCES / : SINO 


    //CONDICIONES IF ELSE

    // int numero=3;
    // int numero2=5;
    // int resultado = 0;

    // if(numero>numero2){
    //     System.out.println("El numero es mayor que el numero2");
    //     //SI SE CUMPLE, HARA ESTO
    // }

    // else {        //System.out.println("El numero " +numero+ " es menor que el numero "+numero2);
    //     //SI NO SE CUMPLE, HARA ESTO
    //     resultado=numero-numero2;
    // }
    
    
        // System.out.println("El resultado es: "+resultado);
        // System.out.println("POR AQUI VOY");

        //PRACTICA DIAS DE LA SEMANA

        // int lunes=1;
        // int martes=2;
        // int miercoles=3;
        // int jueves=4;
        // int viernes=5;
        // int sabado=6;
        // int domingo=7;

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Introduce un numero del 1 al 7 para saber que dia de la semana es:");
        // int dia=sc.nextInt();

        // if (dia == 1) {
        //     System.out.println("El dia es Lunes");
        // }

        // if (dia == 2) {
        //     System.out.println("El dia es Martes");
        // }

        // if (dia == 3) {
        //     System.out.println("El dia es Miercoles");
        // }

        // if (dia == 4) {
        //     System.out.println("El dia es Jueves");
        // }

        // if (dia == 5) {
        //     System.out.println("El dia es Viernes");
        // }

        // if (dia == 6) {
        //     System.out.println("El dia es Sabado");
        // }

        // if (dia == 7) {
        //     System.out.println("El dia es Domingo");
        // }

        // sc.close();

        //CLASE 4 DE BUBCLES:

        //Estructuras: FOR    //SE DONDE EMPIEZO Y DONDE ACABO (MEJOR SINTATICTAMENTE)

        // for(int i=0; i<3; i++) {
        //     System.out.println(i);
        // }

        //Estructura: WHILE   //"MIENTRAS" SI ESO SE CUMPLE HACERLO, SINO, NO. DEPENDE DE LA CONDICION

        // int i=0;
        // while(i<=5){
        //     System.out.println(i);
        //     i++;
        // }

        //Estructura: DO WHILE   //HAZ ALGO MIENTRAS SE CUMPLA UNA CONDICION.  SE HACE UNA VEZ Y LUEGO SE COMPRUEBA SI SE REPITE O NO

        // int i=0;
        // do {
        //     System.out.println(i);          //i++ Es tomar el valor de i y luego incrementarlo
        //     i++;
        // }while(i<=5);
        

        


    }
}