package Relacion_Ejercicios.Ejercicio6;

public class Juego {
    int ganadas1, ganadas2;

    public Juego() {}

    public Juego(int ganadas1, int ganadas2) {
        this.ganadas1=ganadas1;
        this.ganadas2=ganadas2;
    }

    public int getGanadas1() {
        return ganadas1;
    }

    public void setGanadas1(int ganadas1) {
        this.ganadas1 = ganadas1;
    }

    public int getGanadas2() {
        return ganadas2;
    }

    public void setGanadas2(int ganadas2) {
        this.ganadas2 = ganadas2;
    }

    public void cartaAlta() {
        Jugador p1 = new Jugador();
        Carta c1 = new Carta();

        Jugador p2 = new Jugador();
        Carta c2 = new Carta();

       
        do {
            p1.setNombre("Abel");
            c1.setValor((int)(Math.random()*(12-1+1)+1));
            c1.setPalo("Espadas");
            System.out.println("Carta del J1: "+c1.getValor()+" de "+c1.getPalo());
            p1.setCarta(c1);

            p2.setNombre("Pepe");
            c2.setValor((int)(Math.random()*(12-1+1)+1));
            c2.setPalo("Oros");
            System.out.println("Carta del J2: "+c2.getValor()+" de "+c2.getPalo());
            p2.setCarta(c2);

            if (c1.getValor()>c2.getValor()) {
                System.out.println("Victoria del jugador 1");
                System.out.println("===========================");
                ganadas1++;
            }

            else if (c1.getValor()<c2.getValor()) {
                System.out.println("Victoria del jugador 2");
                System.out.println("===========================");
                ganadas2++;
            }

            else {
                System.out.println("Hubo un empate.");
                System.out.println("===========================");
            }

        }while(ganadas1<3 && ganadas2<3);

        if (ganadas1==3) {
            System.out.println(p1.getNombre()+" ha ganado la partida");
            System.out.println("===========================");
        }

        else {
            System.out.println(p2.getNombre()+" ha ganado la partida");
            System.out.println("===========================");
        }

        System.out.println("El juego ha terminado");
        System.out.println("=ESTADISTICAS=");
        System.out.println("Victorias del jugador 1: "+getGanadas1());
        System.out.println("Victorias del jugador 2: "+getGanadas2());
}

    public static void main(String[] args) {
        Juego partida = new Juego(0, 0);

        partida.cartaAlta();
    }
}