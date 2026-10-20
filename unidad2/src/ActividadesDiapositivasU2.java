import java.util.InputMismatchException;
import java.util.Scanner;

public class ActividadesDiapositivasU2 {
    //ACTIVIDAD DE GENERAR 2 NUMEROS Y HALLAR EL COCIENTE, MEDIA, POTENCIA Y RAIZ DE CADA UNO --- EMPIEZA AQUI
// public static void main(String[] args) {
//         int min1=1;
//         int max1=100;

//         int aleatorio1=(int)(Math.random()*(max1-min1+1)+min1);
//         System.out.println("El primer numero aleatorio es: "+aleatorio1);


//         int aleatorio2=(int)(Math.random()*(max1-min1+1)+min1);
//         System.out.println("El segundo numero aleatorio es: "+aleatorio2);

//         double media;
//         media=(aleatorio1+aleatorio2)/2.0;

//         int potencia1;
//         potencia1=(int)(Math.pow(aleatorio2, aleatorio1));

//         double raiz1;
//         raiz1=Math.sqrt(aleatorio1);

//         double raiz2;
//         raiz2=Math.sqrt(aleatorio2);

//         //Falta el cociente (hacerlo en casa) y hacer los println de los resultados 
//         int cociente;
//         cociente=aleatorio1/aleatorio2;

//         System.out.println("Los numeros aleatorios son: "+aleatorio1+" y "+aleatorio2);

//         System.out.println("La media es: "+media);
        
//         System.out.println("La potencia es: "+potencia1);
        
//         System.out.println("La raiz cuadrada de "+aleatorio1+" es: "+raiz1);
        
//         System.out.println("La raiz cuadrada de "+aleatorio2+" es: "+raiz2);
        
//         System.out.println("El cociente es: "+cociente);

//         //Tarea hecha 

        


//     }

    //ACTIVIDAD DE GENERAR 2 NUMEROS Y HALLAR EL COCIENTE, MEDIA, POTENCIA Y RAIZ DE CADA UNO --- TERMINA AQUI
    
    // ACTIVIDAD DE LAS CALIFICACIONES CON IF-ELSE Y SWITCH --- EMPIEZA AQUI
// public static void main(String[] args) {
        // int calificacion;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Introduce la calificacion:");
        // calificacion=sc.nextInt();

        // if (calificacion<=4) {
        //     System.out.println("Usted esta suspenso");
        // }
        
        // else if (calificacion==5) {
        //     System.out.println("Usted ha aprobado");
        // }

        // else if (calificacion>=6 && calificacion<=7) {
        //     System.out.println("Usted ha salido bien");
        // }

        // else if (calificacion>=8 && calificacion<=9) {
        //     System.out.println("Usted ha sido notable");
        // }

        // else if (calificacion==10) {
        //     System.out.println("Usted ha salido sobresaliente");
        // }

        // else {
        //     System.out.println("La nota introducida es incorrecta");
        // }

        //ESTE HA SIDO HECHO CON IF ELSE

    //     int calificacion2;
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Introduzca la nota:");

    //     calificacion2=sc.nextInt();

    //     switch(calificacion2) {
    //         case 0:
    //         case 1:
    //         case 2:
    //         case 3:
    //         case 4:
    //             System.out.println("Usted ha sido suspendido");
    //             break;
    //         case 5:
    //             System.out.println("Usted ha aprobado");
    //             break;
    //         case 6:
    //         case 7:
    //             System.out.println("Usted ha salido bien");
    //             break;
    //         case 8:
    //         case 9:
    //             System.out.println("Usted ha sido notable");
    //             break;
    //         case 10:
    //             System.out.println("Usted ha sido sobresaliente");
    //             break;
    //         default:
    //             System.out.println("La nota introducida es incorrecta");
    //     }

    //     //ESTE HA SIDO CON SWITCH Y BREAK

    // }
    // ACTIVIDAD DE LAS CALIFICACIONES CON IF-ELSE Y SWITCH --- TERMINA AQUI
    

    //ACTIVIDAD DE LOS BISIESTOS --- EMPIEZA AQUI
// public static void main(String[] args) {
//         int dia;
//         int mes;
//         int anio;

//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Ingrese el dia:");
//         dia=sc.nextInt();

//         System.out.println("Ingrese el mes:");
//         mes=sc.nextInt();

//         System.out.println("Ingrese el año:");
//         anio=sc.nextInt();

//         if (dia>31 || dia<1) {
//             System.out.println("La fecha introducida es incorrecta");
//         }

//         else if (mes>12 || mes<1) {
//             System.out.println("La fecha introducida es incorrecta");
//         }
        
//         else {
//             if (mes==1) {
//                 if (dia>31) {
//                 System.out.println("La fecha introducida es incorrecta");
//                 }
//                 else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida del: "+dia+" de Enero del año "+anio+" es correcta y es bisiesto");
//                 }
//                 else {
//                 System.out.println("La fecha introducida del: "+dia+" de Enero del año "+anio+" es correcta y no es bisiesto");
//                 }
            
//             }

//             else if (mes==2) {
//                 if (dia>29) {
//                 System.out.println("La fecha introducida no es correcta");
//                 }
            
//                 else if (dia==29 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                     System.out.println("La fecha introducida del: "+dia+" de Febrero del año "+anio+" es correcta y es bisiesto");
//                 }

//                 else if (dia==29 && ((anio%4!=0 && anio%100==0) || anio%400!=0)) {
//                     System.out.println("La fecha introducida es incorrecta (Los dias 29 de Febrero solo existen en los años bisiestos)");
//                 }
                
//                 else if (dia<29 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                     System.out.println("La fecha introducida del: "+dia+" de Febrero del año "+anio+" es correcta y no es bisiesto");
//                 }
//                 else {
//                     System.out.println("La fecha introducida del: "+dia+" de Febrero del año "+anio+" es correcta y no es bisiesto");
//                 }

//             }
// //HECHO HASTA AQUI, TERMINAR EN CASA
//             else if (mes==3) {
//                 if (dia>31) {
//                 System.out.println("La fecha introducida es incorrecta");
//                 }
//                 else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida del: "+dia+" de Marzo del año "+anio+" es correcta y es bisiesto");
//                 }
//                 else {
//                 System.out.println("La fecha introducida del: "+dia+" de Marzo del año "+anio+" es correcta y no es bisiesto");
//                 }
            
//             }

//             else if (mes==4) {
//                 if (dia>30) {
//                 System.out.println("La fecha introducida es incorrecta");
//                 }
//                 else if ( dia<=30 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida del: "+dia+" de Abril del año "+anio+" es correcta y es bisiesto");
//                 }
//                 else {
//                 System.out.println("La fecha introducida del: "+dia+" de Abril del año "+anio+" es correcta y no es bisiesto");
//                 }
            
//             }

//             else if (mes==5) {
//                 if (dia>31) {
//                 System.out.println("La fecha introducida es incorrecta");
//                 }
//                 else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida del: "+dia+" de Mayo del año "+anio+" es correcta y es bisiesto");
//                 }
//                 else {
//                 System.out.println("La fecha introducida del: "+dia+" de Mayo del año "+anio+" es correcta y no es bisiesto");
//                 }
            
//             }

//             else if (mes==6) {
//                 if (dia>30) {
//                 System.out.println("La fecha introducida es incorrecta");
//                 }
//                 else if ( dia<=30 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida del: "+dia+" de Junio del año "+anio+" es correcta y es bisiesto");
//                 }
//                 else {
//                 System.out.println("La fecha introducida del: "+dia+" de Junio del año "+anio+" es correcta y no es bisiesto");
//                 }
            
//             }

//             else if (mes==7) {
//                 if (dia>31) {
//                 System.out.println("La fecha introducida es incorrecta");
//                 }
//                 else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida del: "+dia+" de Julio del año "+anio+" es correcta y es bisiesto");
//                 }
//                 else {
//                 System.out.println("La fecha introducida del: "+dia+" de Julio del año "+anio+" es correcta y no es bisiesto");
//                 }
            
//             }

//             else if (mes==8) {
//                 if (dia>31) {
//                 System.out.println("La fecha introducida es incorrecta");
//                 }
//                 else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida del: "+dia+" de Agosto del año "+anio+" es correcta y es bisiesto");
//                 }
//                 else {
//                 System.out.println("La fecha introducida del: "+dia+" de Agosto del año "+anio+" es correcta y no es bisiesto");
//                 }
            
//             }

//             else if (mes==9) {
//                 if (dia>30) {
//                 System.out.println("La fecha introducida es incorrecta");
//                 }
//                 else if ( dia<=30 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida del: "+dia+" de Septiembre del año "+anio+" es correcta y es bisiesto");
//                 }
//                 else {
//                 System.out.println("La fecha introducida del: "+dia+" de Septiembre del año "+anio+" es correcta y no es bisiesto");
//                 }
            
//             }

//             else if (mes==10) {
//                 if (dia>31) {
//                 System.out.println("La fecha introducida es incorrecta");
//                 }
//                 else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida del: "+dia+" de Octubre del año "+anio+" es correcta y es bisiesto");
//                 }
//                 else {
//                 System.out.println("La fecha introducida del: "+dia+" de Octubre del año "+anio+" es correcta y no es bisiesto");
//                 }
            
//             }

//             else if (mes==11) {
//                 if (dia>30) {
//                 System.out.println("La fecha introducida es incorrecta");
//                 }
//                 else if ( dia<=30 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida del: "+dia+" de Noviembre del año "+anio+" es correcta y es bisiesto");
//                 }
//                 else {
//                 System.out.println("La fecha introducida del: "+dia+" de Noviembre del año "+anio+" es correcta y no es bisiesto");
//                 }
            
//             }

//             else if (mes==12) {
//                 if (dia>31) {
//                 System.out.println("La fecha introducida es incorrecta");
//                 }
//                 else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida del: "+dia+" de Diciembre del año "+anio+" es correcta y es bisiesto");
//                 }
//                 else {
//                 System.out.println("La fecha introducida del: "+dia+" de Diciembre del año "+anio+" es correcta y no es bisiesto");
//                 }
            
//             }

//             else {
//                 System.out.println("La fecha introducida es incorrecta");
//             }


//         } //TERMINADO
//     }
    // ACTIVIDAD DE LOS BISIESTOS--- TERMINA AQUI

    // ACTIVIDADES (BUCLES)

    //ACTIVIDAD NUMEROS ENTRE 50 Y 200 QUE SON MULTIPLOS DE 2 Y 3 --- EMPIEZA AQUI

// public static boolean Div2y3(int numero) {
//         if (numero%3==0 && numero%2==0) {
//             return true;
//         }
//         else {
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         for (int i=50; i<=200; i++) {
//             if (Div2y3(i)==true) {
//                 System.out.println(i+" son multiplos de 2 y 3");
//             }
//         }
//     }

    //ACTIVIDAD NUMEROS ENTRE 50 Y 200 QUE SON MULTIPLOS DE 2 Y 3 --- TERMINA AQUI

    //ACTIVIDAD FACTORIAL DEL NUMERO INTRODUCIDO (N) --- EMPIEZA AQUI
    // public static void main(String[] args) {
    //     int n;
    //     int i;

    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Introduce el numero N:");
        
    //     n=sc.nextInt();

    //     int factorial=1;

    //     for (i=1; i<=n; i++) {
    //         factorial=factorial*i;
    //     }

    //     System.out.println("El factorial es: "+factorial);
    // }
    //ACTIVIDAD FACTORIAL DEL NUMERO INTRODUCIDO (N) --- TERMINA AQUI

    //ACTIVIDAD DE INGRESAR NUMEROS (EDAD) HASTA LEER -1 Y HALLAR LA MAXIMA Y MINIMA EDAD --- EMPIEZA AQUI

//         public static void main(String[] args) {
//         int maximo=0, minimo=0, numero, contador=0;
//         Scanner sc=new Scanner(System.in);

//         do {
//             numero=sc.nextInt(); sc.nextLine();
//             if (contador==0) {
//                 maximo=numero;
//                 minimo=numero;
//                 contador++;
//             }

//             if (numero>maximo) {
//                 maximo=numero;
//             }

//             if ((numero<minimo) && (numero!=-1)){
//                 minimo=numero;
//             }
        
//         }while (numero!=-1);

//         System.out.println("La edad minima es: "+minimo);
//         System.out.println("La edad maxima es: "+maximo);
// }

    //ACTIVIDAD DE INGRESAR NUMEROS (EDAD) HASTA LEER -1 Y HALLAR LA MAXIMA Y MINIMA EDAD --- TERMINA AQUI

    //ACTIVIDAD (CONTINUACION DEL ANTERIOR) CALCULAR LA SUMA, MEDIA, NUMERO DE ALUMNOS Y CUANTOS SON MAYORES DE EDAD --- EMPIEZA AQUI
//     public static void main(String[] args) {
//         int maximo=0, minimo=0, numero, contador=0;

//         int suma=0, mayores=0;
//         double media=0;
//         Scanner sc=new Scanner(System.in);

//         do {
//             numero=sc.nextInt(); sc.nextLine();
//             if (contador==0) {
//                 maximo=numero;
//                 minimo=numero;
                
//             }

//             if (numero>maximo) {
//                 maximo=numero;
//             }

//             if ((numero<minimo) && (numero!=-1)){
//                 minimo=numero;
//             }

//             suma=suma+numero;
//             contador++;
            
            
//             if (numero>=18) {
//                 mayores++;
//             }
        
//         }while (numero!=-1);

//         if (contador>0) {
//             media=suma/contador;
//         }

//         System.out.println("La edad minima es: "+minimo);
//         System.out.println("La edad maxima es: "+maximo);
//         System.out.println("La suma de las edades es: " + suma);
//         System.out.println("La media de las edades es: " + media);
//         System.out.println("El numero de alumnos es: " + contador);
//         System.out.println("Los mayores de edad son: " + mayores);
// }
    //ACTIVIDAD (CONTINUACION DEL ANTERIOR) CALCULAR LA SUMA, MEDIA, NUMERO DE ALUMNOS Y CUANTOS SON MAYORES DE EDAD --- TERMINA AQUI

    //ACTIVIDAD PROGRAMA PARA ADIVINAR UN NUMERO ENTRE 1 Y 100, INDICANDO SI ESTAS CERCA Y DE EL NUMERO DE INTENTOS --- EMPIEZA AQUI

    // public static void main(String[] args) {
    //     int numero, aleatorio, intentos=0;
    //     boolean encontrado=false;
    //     aleatorio=(int)(Math.random() * (100-1+1)+1);
        
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Ingrese un numero entre 1 y 100:");
    //     numero=sc.nextInt(); sc.nextLine();

    //     do {
    //         if (numero<aleatorio) {
    //             intentos++;
    //             System.out.println("Tu numero es menor, prueba con uno mas grande");
    //             numero=sc.nextInt(); sc.nextLine();
    //         }

    //         else if (numero>aleatorio) {
    //             intentos++;
    //             System.out.println("Tu numero es mayor, prueba con uno mas pequeño");
    //             numero=sc.nextInt(); sc.nextLine();
    //         }

    //         else {
    //             encontrado=true;
    //             System.out.println("Felicidades, has adivinado el numero: "+aleatorio+" despues de "+intentos+" intentos");
    //         }
            
    //     }while(!encontrado);


    // }

    //ACTIVIDAD PROGRAMA PARA ADIVINAR UN NUMERO ENTRE 1 Y 100, INDICANDO SI ESTAS CERCA Y DE EL NUMERO DE INTENTOS --- TERMINA AQUI


    //ACTIVIDAD PROGRAMA CALCULADORA (SUMAR, RESTAR, MULTIPLICAR, DIVIDIR O -1) --- EMPIEZA AQUI

    // public static void main(String[] args) {
        
    //     int operacion, ejecucion;
    //     double num1, num2, resultado;
        
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Que operacion desea realizar? (1 para suma, 2 para resta, 3 para multiplicacion, 4 para division)");
    //     operacion = sc.nextInt();

    //     System.out.println("Ahora escriba -1 para ejecutar la calculadora");
    //     ejecucion = sc.nextInt();

    //     if (operacion < 1 || operacion > 4) {
    //         System.out.println("Operacion no valida. Por favor, introduzca un numero entre 1 y 4.");
    //     } 
    //     else if (ejecucion == -1) {
    //         System.out.println("Ejecutando calculadora...");

    //         System.out.println("Introduzca su primer numero:");
    //         num1 = sc.nextInt();

    //         System.out.println("Introduzca su segundo numero:");
    //         num2 = sc.nextInt();

    //         switch (operacion) {
    //             case 1:
    //                 resultado = num1 + num2;
    //                 System.out.println("El resultado de la suma es: " + resultado);
    //                 break;
    //             case 2:
    //                 resultado = num1 - num2;
    //                 System.out.println("El resultado de la resta es: " + resultado);
    //                 break;
    //             case 3:
    //                 resultado = num1 * num2;
    //                 System.out.println("El resultado de la multiplicacion es: " + resultado);
    //                 break;
    //             case 4:
    //                 if (num2 != 0) {
    //                     resultado = num1 / num2;
    //                     System.out.println("El resultado de la division es: " + resultado);
    //                 } else {
    //                     System.out.println("Error: No se puede dividir entre cero.");
    //                 }
    //                 break;
    //         }
    //     }

    //     else {
    //         System.out.println("No ejecuto la calculadora, por favor escriba -1 para ejecutar la calculadora");
    //     }
    
    // }    
    //ACTIVIDAD PROGRAMA CALCULADORA (SUMAR, RESTAR, MULTIPLICAR, DIVIDIR O -1) --- TERMINA AQUI

    //ACTIVIDAD ALGORITMO MCD Y MCM --- EMPIEZA AQUI

    //MCD
    // public static void main(String[] args) {
    //     int a, b, resto;

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Ingrese el primer numero:");
    //     a = sc.nextInt();

    //     System.out.println("Ingrese el segundo numero:");
    //     b = sc.nextInt();

    //     a=Math.abs(a);
    //     b=Math.abs(b);

    //     do {
    //         resto=a%b;
    //         a=b;
    //         b=resto;
    //     }while(b!=0);

    //     System.out.println("El MCD es: "+a);
    // }

    //MCM

    //     public static void main(String[] args) {

    //     int a, b, mayor, mcm;

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Ingrese el primer numero:");
    //     a = sc.nextInt();
    //     System.out.println("Ingrese el segundo numero:");
    //     b = sc.nextInt();

    //     a=Math.abs(a);
    //     b=Math.abs(b);


    // mayor=Math.max(a, b);
    // mcm=mayor;

    // do {
    //     mcm=mcm+mayor;
    // }while(mcm%a!=0 || mcm%b!=0);

    // System.out.println("El MCM es: "+mcm);
    // }

    //ACTIVIDAD ALGORITMO MCD Y MCM --- TERMINA AQUI


    //ACTIVIDAD DE LAS TABLAS DE MULTIPLICAR --- EMPIEZA AQUI
    // public static void main(String[] args) {
    //     int numero;
    //     Scanner sc = new Scanner(System.in);
        
    //     System.out.println("Introduzca un numero para mostrar su tabla de multiplicar:");
    //     numero = sc.nextInt();

    //     System.out.println("Tabla de multiplicar del "+numero+":");
    //     for (int i=1; i<11; i++) { // for (inicio; condicion; incremento) (Empieza por1, mientras sea menor que 13, incrementa en 1) \ i++ es lo mismo que i=i+1 (Si quiero aumentar de 2 en 2 u otro numero seria "i += 2" (el 2 puedo reemplazarlo por cualquier numero)
    //         System.out.println(numero+" x "+i+ " = "+(numero*i));
    //     }
    // }

    //ACTIVIDAD DE LAS TABLAS DE MULTIPLICAR --- TERMINA AQUI


    //FUNCIONES

    //ACTIVIDAD AREA Y VOLUMEN DEL CILINDRO --- EMPIEZA AQUI
    // public static double volumencilindro (double radio, double altura) {
    //     return (Math.pow(radio, 2)*3.14*altura);
    // }

    // public static double areacilindro (double radio, double altura) {
    //     return (2*3.14*radio*(radio+altura));
    // }
    // public static void main(String[] args) {

    //     Scanner scanner=new Scanner(System.in);
        
    //     System.out.println("Escribe el radio del cilindro: ");
    //     double radio=scanner.nextDouble();

    //     System.out.println("Escribe la altura del cilindro: ");
    //     double altura=scanner.nextDouble();

    //     System.out.println("El volumen del cilindro es: "+volumencilindro(radio, altura));

    //     System.out.println("El area del cilindro es: "+areacilindro(radio, altura));
    // }
    //ACTIVIDAD AREA Y VOLUMEN DEL CILINDRO --- TERMINA AQUI

    //ACTIVIDAD FUNCION esPar y esDivisible2y3 --- EMPIEZA AQUI
    // public static boolean esPar(int numero) {
    //     if (numero%2==0) {
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }

    //     }
    // public static boolean esDivisiblepor2y3(int numero) {
    //     if (numero%3==0 && numero%2==0) {
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // }

    // public static void main(String[] args) {
    //     for (int i=1; i<=20; i++) {
    //         if (esPar(i)==true && esDivisiblepor2y3(i)==true) {
    //             System.out.println(i+" es par y divislbe por 2 y 3");
    //         }
    //     }
    // }
    //ACTIVIDAD FUNCION esPar y esDivisible2y3 --- TERMINA AQUI

    //RECURSIVIDAD 

    //ACTIVIDAD CANTIDAD DE DIGITOS DE UN NUMERO POSITIVO --- EMPIEZA AQUI
    //     public static int cantDigitos(int num, int contador) {
    //     if (num<10) {
    //         return 1;
    //     }

    //     else {
    //         do {
    //             int ultimodig;
    //             ultimodig=num%10;
    //             contador++;
    //             num=Math.divideExact(num, 10);

    //         }while(num!=0);
    //         return contador;
    //     }
    // }

    // public static void main(String[] args) {             //ESTA ES DE LA FORMA ITERATIVA CON DO WHILE
    //     int num;
    //     int contador=0;
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Ingrese su numero:");

    //     num=sc.nextInt();

    //     if (num<10) {
    //         System.out.println("Su numero tiene un solo digito");
    //     }

    //     else {
    //     System.out.println("Su numero tiene "+cantDigitos(num, contador)+" digitos");
    //     }
        
    // }


    // ===================================================================================

    //     public static int cantDigitos(int num) {

    //     if (num<10) {
    //         return 1;
    //     } else {
    //         return 1+cantDigitos(num/10);
    //     }
    // }

    // public static void main(String[] args) {           //ESTA ES USANDO RECURSIVIDAD

    //     int num;
    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Ingrese su numero:");
    //     num=sc.nextInt();

    //     System.out.println("Su numero tiene "+cantDigitos(num)+" digitos");

    // }
    
    //ACTIVIDAD CANTIDAD DE DIGITOS DE UN NUMERO POSITIVO --- TERMINA AQUI

    //ACTIVIDAD SUMA DE NUMEROS NATURALES --- EMPIEZA AQUI

    //     public static int Sum(int n) {
    //     if (n==1) {
    //         return 1;
    //     }

    //     else {
    //         return n+Sum(n-1);
    //     }
    // }

    // public static void main(String[] args) {
    //     System.out.println(Sum(10));        // ----> CAMBIAR EL VALOR DE N PARA HALLAR LA SUMA QUE QUIERA
    // }

    //ACTIVIDAD SUMA DE NUMEROS NATURALES --- TERMINA AQUI


    //ACTIVIDAD CALCULAR A^B USANDO RECURSIVIDAD --- EMPIEZA AQUI
    //     public static int Pot (int a, int b){
        
    //     Math.pow(a, b);

    //     if (b==0) {
    //         return 1;
    //     }

    //     else {
    //         return a*Pot(a, b-1);
    //     }
    // }

    // public static void main(String[] args) {
    //     int a, b;
        
    //     try {
    //         Scanner sc=new Scanner(System.in);
    //         System.out.println("Ingrese el primero numero (base):");
    //         a=sc.nextInt();
    //         System.out.println("Ingrese el segundo numero (potencia):");
    //         b=sc.nextInt();
    //         System.out.println(Pot(a,b));
    //     }catch(InputMismatchException e) {                                    //AQUI IMPLEMENTO EL EJEMPLO DEL TRY CATCH EN CLASE, POR ESO ESTA AQUI ^^
    //         System.out.println("TIENES QUE INGRESAR NUMEROS, NO LETRAS");
    //     }
    // }
    //ACTIVIDAD CALCULAR A^B USANDO RECURSIVIDAD --- TERMINA AQUI


    //ACTIVIDAD EXPLICAR LA PILA DE RECURSIVIDAD --- EMPIEZA AQUI
    // private static String convertirABinario(int num) {
    //     if (num == 0) {
    //         return "";
    //     } 
    //     else {
    //         return convertirABinario(num / 2) + (num % 2);
    //     }
    // }

    // public static void main(String[] args) {
    //     int num;
    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Ingrese su numero:");
    //     num=sc.nextInt();

    //     System.out.println(convertirABinario(num));
    // }
    
    // convertirABinario lee el numero "num"

    // Como no conoce su valor, pasa al siguiente, donde se llama a si misma para continuar pero con el num/2 (entero) + el resto de (num/2) = num%2 

    // Por ejemplo, el numero 13 --> Hace la primera llamada convertirABinario(13):

    // Calcula 13/2=6 y espera el resultado de convertirABinario(6) ---> Hace la segunda llamada convertirABinario(6)

    // Calcula 6/2=3 y espera el resultado de convertirABinario(3) ---> Hace la tercer llamada convertirABinario(3)

    // Calcula 3/2=1 y espera el resultado de convertirABinario(1) ---> Hace la cuarta llamada convertirABinario(1)

    // Calcula 1/2=0 y espera el resultado de convertirABinario(0) ---> Hace la quinta llamada convertirABinario(0)

    // Aqui ya se cuple que num==0, asi que nos devuelve una cadena vacia ("")

    // Luego empieza a devolver valores:

    // Regresa a convertirABinario(1):
    // Como 1%2=1, entonces nos da ---> "" + 1 = "1"
    // El resultado seria 1

    // Regresa a convertirABinario(3):
    // Como 3%2=1, entonces nos da ---> "" + 1 = "11"
    // El resultado seria 11

    //Regresa a convertirABinario(6):
    // Como 6%2=0, entonces nos da ---> "" + 0 = "110"
    // El resultado seria 110

    // Regresa a convertirABinario(13):
    // Como 13%2=1, entonces nos da ---> "" + 1 = "1101"

    //Nos devuelve al final "1101" que se puede ver si lo mandamos a imprimir con el System.out.println en el main
    
    //ACTIVIDAD EXPLICAR LA PILA DE RECURSIVIDAD --- TERMINA AQUI
}
