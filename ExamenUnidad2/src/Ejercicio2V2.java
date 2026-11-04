import java.util.Scanner;

public class Ejercicio2V2 {
    public static void Humano() {
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su valor (1 Piedra  2 Papel  3 Tijera):");
        valor=sc.nextInt();
        
        if (valor==1) {
            System.out.println("Has sacado Piedra");
        }

        else if (valor==2) {
            System.out.println("Has sacado Papel");
        }

        else if (valor==3) {
            System.out.println("Has sacado Tijera");
        }

        else {
            System.out.println("Valor incorrecto");
        }
    }

    public static int JugadaHumano () {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su valor: (1-3)");

        int valor;
        valor=sc.nextInt(); sc.nextLine();

        if (valor==1) {
            return 1;
        }

        if (valor==2) {
            return 2;
        }

        if (valor==3) {
            return 3;
        }

        else {
            return 0;
        }

        
    }

    public static void Ordenador() {
        int valor;

        valor=(int)(Math.random()*(3-1+1)+1);

        if (valor==1) {
            System.out.println("La maquina ha sacado Piedra");
        }

        else if (valor==2) {
            System.out.println("La maquina ha sacado Papel");
        }

        else if (valor==3) {
            System.out.println("La maquina ha sacado Tijera");
        }
    }

    public static int JugadaOrdenador () {
        int valor;
        valor=(int)(Math.random()*(3-1+1)+1);

        if (valor==1) {
            return 1;
        }

        else if (valor==2) {
            return 2;
        }

        else if (valor==3) {
            return 3;
        }

        else {
            return 0;
        }
    }

    public static void Juego() {
        
        
        int contadorperdidas=0;
        
        if (JugadaHumano()==JugadaOrdenador()) {
            System.out.println("Han empatado");
        }

        else if (JugadaHumano()<JugadaOrdenador() || JugadaHumano()==3 && JugadaOrdenador()==1) {
            System.out.println("Has perdido");
            contadorperdidas++;
        }

        else if (JugadaHumano()>JugadaOrdenador() || JugadaOrdenador()==3 && JugadaHumano()==1) {
            System.out.println("Has ganado");
        }
    }
    
    public static void main(String[] args) {
        Humano();
        Ordenador();
    }
}
