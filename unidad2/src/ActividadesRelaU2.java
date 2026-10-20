import java.time.LocalDateTime;
import java.util.Scanner;



public class ActividadesRelaU2 {
    //EJERCICIO 1 --- EMPIEZA AQUI
    
    //     public static int Saludo(int hora) {
        

    //     if (hora>=6 && hora<=12) {
    //         return 1;
    //     }

    //     else if (hora>=13 && hora<=20) {
    //         return 2;
    //     }

    //     else if (hora>5 && hora<=21){
    //         return 3;
    //     }

    //     else {
    //         return 0;
    //     }
     
    // }
    // public static void main(String[] args) {
    //     LocalDateTime hoy= LocalDateTime.now();

    //     System.out.println("La hora es: "+hoy.getHour()+" : "+hoy.getMinute());

    //     int hora=hoy.getHour();

    //     if (Saludo(hora)==1) {
    //         System.out.println("Buenos dias!");
    //     }

    //     else if (Saludo(hora)==2) {
    //         System.out.println("Buenas tardes!");
    //     }

    //     else if (Saludo(hora)==3) {
    //         System.out.println("Buenas noches!");
    //     }

    //     else {
    //         System.out.println("Ingreso una hora incorecta...");
    //     }
    // }

    //EJERCICIO 1 --- TERMINA AQUI

    //EJERCICIO 2 --- EMPIEZA AQUI

    // public static int Pagodehoras(int hora) {
    //     int pago;
    //     if (hora<=40) {
    //         pago=12*hora;
    //         return pago;
    //     }

    //     else {
    //         pago=(40*12)+((hora-40)*16);
    //         return pago;
    //     }
    // }
    
    // public static void main(String[] args) {
    //    int horas, pago;
    //    Scanner sc=new Scanner(System.in); 
    //    System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana:");
    //    horas=sc.nextInt();

    //    System.out.println("El sueldo semanal que le corresponde es de: "+Pagodehoras(horas)+" euros");


    // }

    //ERJERCICIO 2 --- TERMINA AQUI

    //EJERCICIO 3 --- EMPIEZA AQUI

    // public static void main(String[] args) {
        
    //     int dia, mes, signo;

    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Ingrese el numero del dia:");

    //     dia=sc.nextInt(); 

    //     if (dia>31 || dia<=0) {
    //         System.out.println("Numero de dia incorrecto");
    //     }

    //     else {
    //         System.out.println("Ingrese el numero del mes:");
    //         mes=sc.nextInt();

    //         if (mes>12 || mes<=0) {
    //             System.out.println("Numero de mes incorrecto");
    //         }

    //         else if ((dia>=29 && mes==2) || (dia==31 && mes==4) || (dia==31 && mes==6) || (dia==31 && mes==9) || (dia==31 && mes==11)) {
    //             System.out.println("Fechas incorrectas");
    //         }

    //         else 
    //             if ((dia>=22 && dia<=31 && mes==12) || (dia>=1 && dia<=19 && mes==1) ) {
    //                 System.out.println("Capricornio");
    //             }

    //             else if ((dia>=20 && dia<=31 && mes==1) || (dia>=1 && dia<=18 && mes==2)) {
    //                 System.out.println("Acuario");
    //             }

    //             else if ((dia>=19 && dia<=31 && mes==2) || (dia>=1 && dia<=20 && mes==3)) {
    //                 System.out.println("Piscis");
    //             }
                
    //             else if ((dia>=21 && dia<=31 && mes==3) || (dia>=1 && dia<=19 && mes==4)) {
    //                 System.out.println("Aries");
    //             }

    //             else if ((dia>=20 && dia<=31 && mes==4) || (dia>=1 && dia<=20 && mes==5)) {
    //                 System.out.println("Tauro");
    //             }

    //             else if ((dia>=21 && dia<=31 && mes==5) || (dia>=1 && dia<=20 && mes==6)) {
    //                 System.out.println("Geminis");
    //             }

    //             else if ((dia>=21 && dia<=31 && mes==6)||(dia>=1 && dia<=22 && mes==7)) {
    //                 System.out.println("Cancer");
    //             }

    //             else if ((dia>=22 && dia<=31 && mes==7)||(dia>=1 && dia<=22 && mes==8)) {
    //                 System.out.println("Leo");
    //             }

    //             else if ((dia>=23 && dia<=31 && mes==8)||(dia>=1 && dia<=22 && mes==9)) {
    //                 System.out.println("Virgo");
    //             }

    //             else if ((dia>=23 && dia<=31 && mes==9)||(dia>=1 && dia<=22 && mes==10)) {
    //                 System.out.println("Libra");
    //             }

    //             else if ((dia>=23 && dia<=31 && mes==10)||(dia>=1 && dia<=21 && mes==11)) {
    //                 System.out.println("Escorpio");
    //             }

    //             else if ((dia>=22 && dia<=31 && mes==11)||(dia>=1 && dia<=21 && mes==12)) {
    //                 System.out.println("Sagitario");
    //             }
            
    //     }
    // }

    //EJERCICIO 3 --- TERMINA AQUI

    //EJERCICIO 4 --- EMPIEZA AQUI

    //  public static boolean Media(int nota1, int nota2) {
    //     double notamedia=(nota1+nota2)/2;
    //     if (notamedia>=5) {
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // }


    // public static void main(String[] args) {
    //     int nota1, nota2;
    //     double notamedia;
    //     String recuperacion;

    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Ingrese su primera nota:");
    //     nota1=sc.nextInt();

    //     System.out.println("Ingrese su segunda nota:");
    //     nota2=sc.nextInt();

    //     if (nota1>10 || nota2>10) {
    //         System.out.println("Nota incorrecta");
    //     }

    //     else {
    //         notamedia=(nota1+nota2)/2;

    //     if (Media(nota1, nota2)==true) {
    //         System.out.println("Usted ha aprobado con la nota media de: "+notamedia);
    //     }

    //     else {
    //         System.out.println("Usted requiere recuperacion...");

    //         System.out.println("Cual fue su calificacion en el examen de recuperacion (APTO/NO APTO):");
    //         sc.nextLine();
    //         recuperacion=sc.nextLine();

    //         if (recuperacion.equalsIgnoreCase("apto")) {  //.equals() es para comparar el contenido (distingue entre mayusculas y minusculas) | .equalsIgnoreCase() es para comparar el contenido (no distingue entre mayuculas y minusculas)
    //             System.out.println("Usted ha aprobado con 5");
    //         }

    //         else if (recuperacion.equalsIgnoreCase("no apto")) {
    //             System.out.println("Usted ha sido suspenso");
    //         }
            
    //         else {
    //             System.out.println("Nota incorrecta");
    //         }

    //     }

    
    //     }

    // }

    //EJERCICIO 4 --- TERMINA AQUI

    //EJERCICIO 5 --- EMPIEZA AQUI
// public static int Cursos (int dia) {
//         if (dia==1) {
//             System.out.println("LUNES");
//             System.out.println("Entorno de desarrollo");
//             System.out.println("Lenguajes de marcas");
//             System.out.println("Sistemas informaticos");
//             System.out.println("Programacion");
//             return 1;
//         }

//         else if (dia==2) {
//             System.out.println("MARTES");
//             System.out.println("Entorno de desarrollo");
//             System.out.println("Lenguajes de marcas");
//             System.out.println("Sistemas informaticos");
//             System.out.println("Programacion");
//             return 2;
//         }

//         else if (dia==3) {
//             System.out.println("MIERCOLES");
//             System.out.println("Entorno de desarrollo");
//             System.out.println("Lenguajes de marcas");
//             System.out.println("Sistemas informaticos");
//             System.out.println("Programacion");
//             return 3;
//         }

//         else if (dia==4) {
//             System.out.println("JUEVES");
//             System.out.println("Entorno de desarrollo");
//             System.out.println("Lenguajes de marcas");
//             System.out.println("Sistemas informaticos");
//             System.out.println("Programacion");
//             return 4;
//         }

//         else if (dia==5) {
//             System.out.println("VIERNES");
//             System.out.println("Entorno de desarrollo");
//             System.out.println("Lenguajes de marcas");
//             System.out.println("Sistemas informaticos");
//             System.out.println("Programacion");
//             return 5;
//         }

//         else if (dia==6) {

//             Cursos(1);
//             System.out.println("---------------------------------------------------");
//             Cursos(2);
//             System.out.println("---------------------------------------------------");
//             Cursos(3);
//             System.out.println("---------------------------------------------------");
//             Cursos(4);
//             System.out.println("---------------------------------------------------");
//             Cursos(5);
//             System.out.println("---------------------------------------------------");

//             return 6;

//         }

//         else if (dia==7) {
//             System.out.println("Apagando...");
//             return 7;
//         }

//         else {
//             return 0;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         int dia;
//         System.out.println("Ingrese el dia para darle su horario: (1 Lunes, 2 Martes, 3 Miercoles, 4 Jueves, 5 Viernes, 6 Para mostrar el horario semanal, 7 Para Apagar)");
        
//         dia=sc.nextInt();

//         if (dia==1) {
//             System.out.println(Cursos(dia));
//         }

//         else if (dia==2) {
//             System.out.println(Cursos(dia));
//         }

//         else if (dia==3) {
//             System.out.println(Cursos(dia));
//         }

//         else if (dia==4) {
//             System.out.println(Cursos(dia));
//         }

//         else if (dia==5) {
//             System.out.println(Cursos(dia));
//         }

//         else if (dia==6) {
//             System.out.println(Cursos(dia));
//         }

//         else if (dia==7) {
//             System.out.println(Cursos(dia));
//         }

//         else {
//             System.out.println("Dia incorrecto");
//         }

 
//     }

//EJERCICIO 5 --- TERMINA AQUI

//EJERCICIO 6 --- EMPIEZA AQUI

// public static int SueldoBase(int cargo) {
//         if (cargo==1) {
            
//             return 950;
//         } 
        
//         else if (cargo==2) {
            
//             return 1200;
//         } 
        
//         else if (cargo==3) {
            
//             return 1600;
//         } 
        
//         else {
            
//             return 0;
//         }
//     }

//     public static String Cargos(int cargo) {
//         if (cargo==1) {
            
//             return "Prog. junior";
//         } 
        
//         else if (cargo==2) {
            
//             return "Prog. senior";
//         } 
        
//         else if (cargo==3) {
            
//             return "Jefe de proyecto";
//         } 
        
//         else {
            
//             return "Error";
//         }
//     }

//     public static int GastoViajes(int dias) {
        
//         return dias*30;
    
//     }

//     public static int SueldoBruto(int dias, int cargo) {
        
//         return SueldoBase(cargo) + GastoViajes(dias);
    
//     }

//     public static int Irpf(int bruto, int estado) {
//         if (estado==1) {
            
//             return bruto*25/100;
//         } 
        
//         else if (estado==2) {
            
//             return bruto*20/100;
//         } 
        
//         else {
            
//             return 0;
//         }
//     }

//     public static int RetencionIRPF(int dias, int cargo, int estado) {
//         int bruto = SueldoBruto(dias, cargo);
//         return Irpf(bruto, estado);
//     }

//     public static int SueldoNETO(int dias, int cargo, int estado) {
//         return SueldoBruto(dias, cargo)- RetencionIRPF(dias, cargo, estado);
//     }

//     public static void main(String[] args) {

//         int cargo;
//         int dias;
//         int estado;

//         Scanner sc=new Scanner(System.in);

//         System.out.println("Introduzca el cargo del empleado (1-3):");
//         cargo=sc.nextInt();

//         if (cargo<1 || cargo>3) {
//             System.out.println("Numero incorrecto");
//         } else {

//             System.out.println(
//                 "¿Cuantos dias ha estado de viaje visitando clientes?"
//             );
//             dias=sc.nextInt();

//             if (dias<0) {
//                 System.out.println("Numero incorrecto");
//             } else {

//                 System.out.println(
//                     "Introduzca su estado civil (1 - Soltero, 2 - Casado):"
//                 );
//                 estado=sc.nextInt();

//                 if (estado<1 || estado>2) {
//                     System.out.println("Numero incorrecto");
//                 } else {

//                     int base = SueldoBase(cargo);
//                     int dietas = GastoViajes(dias);
//                     int bruto = SueldoBruto(dias, cargo);
//                     int retencion = RetencionIRPF(dias, cargo, estado);
//                     int neto = SueldoNETO(dias, cargo, estado);

//                     System.out.println("--------------------------------------");   
//                     System.out.println("| Cargo: " + Cargos(cargo) + "                |");
//                     System.out.println("| Sueldo base: " + base+ "                  |");
//                     System.out.println("| Dietas (" + dias + " viajes): " + dietas+ "             |");
//                     System.out.println("--------------------------------------");
//                     System.out.println("| Sueldo bruto: " + bruto+ "                 |");
//                     System.out.println("| Retencion IRPF: " + retencion+ "                |");
//                     System.out.println("--------------------------------------");
//                     System.out.println("| Sueldo neto: " + neto+ "                  |");
//                     System.out.println("--------------------------------------");
//                 }
//             }
//         }

//     }

//EJERCICIO 6 --- TERMINA AQUI

//EJERCICIO 7 --- EMPIEZA AQUI

    // public static void main(String[] args) {
    //     int num, contador=0;

    //     Scanner sc=new Scanner(System.in);

    //     do {
            
    //         System.out.println("Introduzca un numero aleatorio (Ingrese 0 para detener):");
    //         num=sc.nextInt(); sc.nextLine();

    //         if (num==7 || num==-7) {
    //             contador=contador+1;
    //         }
    //     }while(num!=0);

    //     System.out.println("Terminando...");
    //     System.out.println("El numero 7 y -7 se han repetido: "+contador+" veces");

        
    // }

    //EJERCICIO 7 --- TERMINA AQUI

    //EJERCICIO 8 --- EMPIEZA AQUI

    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Introduce N: ");
    //     int n = sc.nextInt();

    //     int num1 = 0;
    //     int num2 = 1;

    //     for (int i = 0; i < n; i++) {
    //         System.out.print(num1 + " ");

    //         int num3 = num1 + num2;
    //         num1 = num2;
    //         num2 = num3;
    //     }
        
    // }

    //EJERCICIO 8 --- TERMINA AQUI

    //EJERCICIO 9 --- EMPIEZA AQUI

//         public static double Raizcuadrada (int n) {
//         return Math.sqrt(n);
//     }
//     public static void Primos (int n) {
        
//         boolean primo=true;
        
//         if (n<=1) {
//             primo=false;
//         }
        
//         else {
//             int i=0;
//             for (i=2; i<=Raizcuadrada(n); i++) {
//                 if (n%i==0) {
//                     primo=false;
//                     break;
//                 }
                
                
//                 else {
//                     primo=true;
//                 }
//             }
    

//     if (primo==true) {
//         System.out.println("Es primo");
//     }

//     else {
//         System.out.println("No es primo");
//     }
// }
//  }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         for (int i=2; i<=100; i++) {
//            System.out.print(i+" ");
//            Primos(i); 
//         }

        
// }

// EJERCICIO 9 --- TERMINA AQUI

// EJERCICIO 10 --- EMPIEZA AQUI

// public static int Impares (int num, int contador) {
//         if (num<10) {
//             return 1;
//         }

//         else {
//             do {
//                 int ultimodig;
//                 ultimodig=num%10;

//                 if (ultimodig%2==0) {
//                     num=Math.divideExact(num, 10);
//                 }

//                 else {
//                     contador++;
//                     num=Math.divideExact(num, 10);
//                 }
//             }while(num!=0);
//             return contador;
//         }

//     }
//     public static int Pares (int num, int contador) {
//         if (num<10) {
//             return 1;
//         }

//         else {
//             do {
//                 //EJEM 418
//                 int ultimodig;
//                 ultimodig=num%10; //8

//                 if (ultimodig%2==0) { //8 ES PAR?
//                 contador++; //SI, ASI QUE CONTADOR+1
//                 num=Math.divideExact(num, 10); //NUM=418/10=41,8 SIN EL DECIMAL OSEA 41
                
//                 }

//                 else {
//                     num=Math.divideExact(num, 10);
//                 }

            
//         }while(num!=0);
//         return contador;
//         }
//     }
//     public static void main(String[] args) {
//         int num;
//         int contador=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Ingrese su numero:");

//         num=sc.nextInt();

//         if (num<10 && num%2==0) {
//             System.out.println("Su numero tiene un solo digito par");
//         }

//         else if (num<10 && num%2!=0) {
//             System.out.println("Su numero tiene un solo digito impar");
//         }

//         else {
//         System.out.println("Su numero tiene "+Pares(num, contador)+" digitos pares y "+Impares(num, contador)+" digitos impares");
//         }
        
//     }

// EJERCICIO 10 --- TERMINA AQUI
}