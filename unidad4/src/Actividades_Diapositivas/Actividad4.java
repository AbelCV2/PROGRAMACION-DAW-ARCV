import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        
        int[] notas = {0,0,0,0,0,0,0,0,0,0};

        int random;

        for(int i=0 ; i<notas.length ; i++) {
            random=(int)(Math.random()*10);
            notas[i]=random;
        }
        
        
        System.out.println("===MENU===");

        System.out.println("1) Solicitar notas");
        System.out.println("2) Mostrar notas almacenadas");
        System.out.println("3) Calcular nota media de la clase");
        System.out.println("4) Cantidad de aprobados y suspensos");
        System.out.println("5) Mostrar nota mas alta y mas baja");

        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println();
        System.out.println("Introduzca su comando");
        numero=sc.nextInt();
        System.out.println();

        if (numero==1) {
            int alumno;

            System.out.println("Introduzca el orden del alumno en la lista: ");
            
            Scanner alm = new Scanner(System.in);
            
            alumno=alm.nextInt();

            alumno=alumno-1;

            System.out.println();

            System.out.println("La nota del alumno "+alumno+" es: "+notas[alumno]);

        }

        else if (numero==2) {
            System.out.println("Notas de los alumnos:");

            for(int i=0 ; i<notas.length ; i++) {
                System.out.print(notas[i]+" | ");
            }
        }

        else if (numero==3) {
            double media=0;
            double suma=0;

            for(int i=0 ; i<notas.length ; i++) {
                suma=suma+notas[i];
            }

            media=suma/10;

            System.out.println("La media es: "+media);
            
            // int nota1 = notas[0];
            // int nota2 = notas[1];
            // int nota3 = notas[2];
            // int nota4 = notas[3];
            // int nota5 = notas[4];
            // int nota6 = notas[5];
            // int nota7 = notas[6];
            // int nota8 = notas[7];
            // int nota9 = notas[8];
            // int nota10 = notas[9];

            // media = (nota1+nota2+nota3+nota4+nota5+nota6+nota7+nota8+nota9+nota10)/10;

            // System.out.println("La media de las notas es: "+media);
            //for(int i=0 ; i<notas.length ; i++) {
                //media = (notas[i])/10;
            
            //}

            //System.out.println("La media de las notas es: "+media);
        }

        else if (numero==4) {
            int aprobados=0;
            int suspensos=0;
            
            for(int i=0 ; i<notas.length ; i++) {
                // int aprobados=0;
                // int suspensos=0;
                
                if (notas[i]>5) {
                    aprobados++;
                }

                else {
                    suspensos++;
                }

                // System.out.println("La cantidad de alumnos aprobados son: "+aprobados);
                // System.out.println("La cantidad de alumnos suspensos son: "+suspensos);
            }

            System.out.println("Aprobados: "+aprobados);
            System.out.println("Suspensos: "+suspensos);

            // if (notas[i]>=5) {
            //     aprobados++;
            // }

            // else if (notas[i]<=4) {
            //     suspensos++;
            // }

            // System.out.println("Aprobados: "+aprobados);
            // System.out.println("Suspensos: "+suspensos);
            
        }

        else if (numero==5) {
            int notaAlta=0;
            int notaBaja=0;
            
            for(int i=0 ; i<notas.length ; i++) {

                if (notas[i]>notaAlta) {
                    notaAlta=notas[i];
                }

                if (notas[i]<notaBaja) {
                    notaBaja=notas[i];
                }
            }

            System.out.println("La nota mas alta fue: "+notaAlta);

            System.out.println("La nota mas baja fue: "+notaBaja);
        }
    }
}
