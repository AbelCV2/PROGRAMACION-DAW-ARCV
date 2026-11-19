package Relacion_Ejercicios.Ejercicio6;

public class Juegov2 {
    int ganadas1, ganadas2;

    //ARRAY PARA DARLE UN VALOR ALEATORIO ENTRE PALOS A LAS CARTAS DE LOS JUGADORES
    String[] palos={"Oros", "Copas", "Oros", "Bastos"};
    //ESTO TOMA EL ORDEN DE 0 , 1 , 2 , 3
    

    public Juegov2() {}

    public Juegov2(int ganadas1, int ganadas2) {
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
            c1.setValor((int)(Math.random()*(12-1+1)+1)); //PARA DARLE UN VALOR ENTRE 1 Y 12 A LA CARTA
            int aleatorioPalo1 = (int)(Math.random()*4); //ESTA VARIABLE ES PARA DAR UN VALOR ALEATORIO ENTRE EL ORDEN 0123 DEL ARRAY
            c1.setPalo(palos[aleatorioPalo1]); //AQUI SE LE DA EL VALOR DEL ORDEN ALEATORIO Y LO ASOCIA CON EL TIPO DE PALO QUE CORRESPONDE
            System.out.println("Carta del J1: "+c1.getValor()+" de "+c1.getPalo()); //IMPRIME LA CARTA DEL JUGADOR 1
            p1.setCarta(c1); //ASOCIA EL OBJETO DE CARTA COMO ATRIBUTO DE JUGADOR (P1)

            p2.setNombre("Pepe");
            c2.setValor((int)(Math.random()*(12-1+1)+1));
            int aleatorioPalo2 = (int)(Math.random()*4);
            c2.setPalo(palos[aleatorioPalo2]); //EXACTAMENTE LO MISMO, PERO CON JUGADOR 2
            System.out.println("Carta del J2: "+c2.getValor()+" de "+c2.getPalo());
            p2.setCarta(c2);

            //CONDICIONAL PARA IR SUMANDO LAS VICTORIAS DE CADA UNO, EN ESTE CASO JUGADOR 1
            if (c1.getValor()>c2.getValor()) {
                System.out.println("Victoria del jugador 1");
                System.out.println("===========================");
                ganadas1++;
            }

            //LO MISMO PERO PARA JUGADOR 2
            else if (c1.getValor()<c2.getValor()) {
                System.out.println("Victoria del jugador 2");
                System.out.println("===========================");
                ganadas2++;
            }

            else { //EN CASO DE SER IGUALES, HAY UN EMPATE
                System.out.println("Hubo un empate.");
                System.out.println("===========================");
            }

        }while(ganadas1<3 && ganadas2<3); //HASTA QUE ALGUNO DE ELLOS GANE 3 VECES

        
        if (ganadas1==3) {
            System.out.println(p1.getNombre()+" ha ganado la partida");
            System.out.println("===========================");
        }

        else {
            System.out.println(p2.getNombre()+" ha ganado la partida");
            System.out.println("===========================");
        }

        
        //IMPRIMIR LAS ESTADISTICAS DE LA PARTIDA
        System.out.println("El juego ha terminado");
        System.out.println("=ESTADISTICAS=");
        System.out.println("Victorias del jugador 1: "+getGanadas1());
        System.out.println("Victorias del jugador 2: "+getGanadas2());
}

    public static void main(String[] args) {
        Juegov2 partida = new Juegov2(0, 0);

        partida.cartaAlta();

        //UNICO PROBLEMA, SE PUEDEN REPETIR LOS PALOS DE LAS CARTAS... X

        //TALVEZ PUEDA INTENTAR USAR OTRA ARRAY PARA EVITAR QUE SE REPITAN...¿?
    }
}
