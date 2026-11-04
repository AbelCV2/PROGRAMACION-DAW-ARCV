import java.util.Scanner;

public class Ejercicio2 {
    
    //Humano
    public static int Humano(int jugada) {
        System.out.println("Que va a sacar? (1:Piedra 2:Papel 3:Tijera)");
        int jugadaH;
        Scanner sc=new Scanner(System.in);
        jugadaH=sc.nextInt();

        //JUGADAS 1-3 
        if (jugadaH<=3) {
        
            if (jugadaH==1){
                System.out.println("Usted saco *Piedra*");
                return jugada=1;
            }

            if (jugadaH==2){
                System.out.println("Usted saco *Papel*");
                return jugada=2;
            }

            if (jugadaH==3){
                System.out.println("Usted saco *Tijera*");
                return jugada=3;
            }
        }

        else {
            System.out.println("Numero Incorrecto");
            return 0;
        }
    }

    //Ordenador 
    public static int Ordenador(int jugada) {
        int jugadaM;

        jugadaM=(int)(Math.random()*(3-1+1)+1);
        System.out.println(jugadaM);

        if (jugadaM==1) {
            System.out.println("La maquina saco *Piedra*");
            return jugada=1;
        }

        if (jugadaM==2) {
            System.out.println("La maquina saco *Papel*");
            return jugada=2;
        }

        if (jugadaM==3) {
            System.out.println("La maquina saco *Tijera*");
            return jugada=3;
        }

        else {
            return 0;
        }


    }

    public static void Juego(){

        //CASOS
            //1 Piedra  2 Papel   3 Tijera
        int contadorM=0;
        //EMPATES
        if(Ordenador(2)==Humano(2) || Ordenador(1)==Humano(1) || Ordenador(3)==Humano(3)){
            System.out.println("Ha habido un empate");
        }

        //Maquina Gana

        else if (Ordenador()<Humano()){
            System.out.println("Tu ganas");
        }

        else if (Ordenador()>Humano()){
            System.out.println("El ordenador gana");
            contadorM++;
        }

        if (contadorM==5) {
            System.out.println("El ordenador ha ganado 5 veces");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int jugadaH;

        System.out.println("Introduzca su jugada:");
        jugadaH=sc.nextInt();

        jugadaH=Humano();

        Juego();
    }
}
