package Relacion_Ejercicios.Ejercicio6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Juegov3 {
    int ganadas1, ganadas2;

    //CREO UN ATRIBUTO PARA LOS EMPATES (OPCIONAL)
    int empates;

    String[] palos={"Oros", "Copas", "Espadas", "Bastos"};
    //String[] palos = new String[48];
    int[] valores = new int[48];
    // 4 PALOS Y 12 VALORES POR CADA PALO: 48 CARTAS EN TOTAL, COMO EN UNA BARAJA REAL
    //CADA POSICION REPRESENTARA UNA CARTA

    //PARA EVITAR QUE SE REPITAN LAS VOY A CONTROLAR CON UN ARRAY DE TIPO BOOLEANO
    boolean[] utilizadas = new boolean[48];
    //ARRAY CON 48 POSICIONES -- FALSE: LA CARTA AUN NO SALE --- TRUE: LA CARTA YA HA SALIDO
    //AL INICIO COMO SE REPARTEN LAS DOS CARTAS, ESTE BOOLEANO DEBERA EMPEZAR EN FALSE
    //Y SEGUN VAYAN SALIENDO LAS CARTAS CAMBIARE SU VALOR A TRUE PARA DECIRLE QUE YA HAN SALIDO
    //Y EVITAR QUE SE REPITAN

    //NECESITO UN METODO PARA SELECCIONAR UNA CARTA (METER LA MANO EN UNA CAJA LLENA DE PAPELES 1-48)
    public Carta sacarCarta() {
        int num;  //VARIABLE PARA DARLE UN VALOR ENTRE 1 Y 48 PARA LUEGO ASOCIARLO

        do {
            num=(int)(Math.random()*48); //BUCLE QUE GENERA UN NUMERO ENTRE 1 Y 48
        }while(utilizadas[num]); //COMPRUEBA SI LA POSICION YA ESTA UTILIZADA
        //SI YA ESTA UTILZIDA (TRUE) VUELVE A GENERAR OTRA

        utilizadas[num]=true; //SI NO ESTA UTILIZADA (FALSE), LA MARCARA AHORA COMO UTILIZADA (TRUE)

        int valor = num % 12 + 1;
        //ESTO TOMA EL NUMERO ALEATORIO Y LO DIVIDE ENTRE 12 (MODULO COMO LO CONOZCO) Y NOS DA EL RESTO
        //A ESE RESTO LE SUMO 1 ¿PORQUE?
        //PORQUE COMO EN UNA BARAJA REAL, TENGO 48 CARTAS, 4 PALOS DE 12 CARTAS CADA PALO
        //QUIERO QUE CADA GRUPO DE PALOS TENGA VALORES DEL 1 AL 12
        //SI NO AGREGO EL +1, LO QUE PASARIA SERIA QUE LOS RESULTADOS POSIBLES SERIAN DEL 0 AL 11
        //NO AL 12 COMO ESTOY BUSCANDO, POR ESO AGREGO EL +1

        //EJEMPLO: 
        // num=0 -- num%12=0/12=0 -- num%12+1= 0+1 = 1 --- EL VALOR SERIA 1
        // num=1 -- num%12=1/12=1 -- num%12+1= 1+1 = 2 --- EL VALOR SERIA 2
        //...
        //Y ASI SE REPITE HASTA LLEGAR AL SIGUIENTE MULTIPLO DE 12

        // num=11 -- num%12=11/12=11 -- num%12+1= 11+1 = 12 --- EL VALOR SERIA 12

        //num=12 -- num%12=12/12=0 -- num%12+1= 0+1 = 1 --- EL VALOR VOLVIO A SER 1

        //ENTONCES SE CONFIRMA QUE CADA VEZ QUE LLEGUE AL SIGUIENTE MULTIPLO DE 12, LOS VALORES VOLVERAN A REPETIRSE

        //CONCLUSION: ESA LINEA DE "int valor = num % 12 + 1;" NOS PERMITE OBTENER UN VALOR ENTRE 1 Y 12
        //SIN IMPORTAR EL NUMERO ALEATORIO QUE GENERE EL MATH.RANDOM()


        String tipopalo = palos[num / 12];
        //DE AQUI, PRIMERO RECORDAR QUE TENGO EL ARRAY
        //String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        //SUS POSICIONES SON: 0-OROS 1-COPAS 2-ESPADAS 3-BASTOS
        // num/12 DIVIDE EL NUMERO ALEATORIO ENTRE 12
        //COMO num ES UN int, LA DIVISION DEVOLVERA UN VALOR ENTERO SIN DECIMALES.

        //EJM: num=0 --- num/12= 0/12 = 0 --- VALOR=0
        // num=1 --- num/12= 1/12 = 0 --- VALOR=0
        // num=2 --- num/12= 2/12 = 0 --- VALOR=0
        //...
        // num12 --- num/12= 12/12 = 1 --- VALOR=1
        // num13 --- num/12= 13/12 = 1 --- VALOR=1
        //...
        // num=24 --- num/12= 24/12 = 2 --- VALOR=2
        // num=25 --- num/12= 25/12 = 2 --- VALOR=2
        //...
        //ENTONCES, SEMEJANTE AL ANTERIOR, ESTO CADA GRUPO DE MULTIPLO DE 12 VA INCREMENTANDO SU VALOR EN 1
        // DEL 1 AL 11 --- EL VALOR SERA: 0
        // DEL 12 AL 23 --- EL VALOR SERA: 1
        // ETC...
        
        //Y ASI CADA GRUPO DE 12 CARTAS OBTIENE UNA POSCION DIFERENTE DEL ARRAY palos
        //DEL 0 AL 11 -> POSICION 0 -> OROS
        //DEL 12 AL 23 -> POSICION 1 -> COPAS
        //DEL 24 AL 35 -> POSICION 2 -> ESPADAS
        //DEL 36 AL 47 -> POSICION 3 -> BASTOS

        //EN CONCLUSION, LA LINEA: String tipopalo = palos[num / 12];
        //IDENTIFICA A QUE GRUPO DE 12 CARTAS PERTENECE EL NUMERO ALEATORIO
        //Y UTILIZA ESE GRUPO PARA DETERMINAR EL PALO

        //EJEMPLO DEL USO DE AMBAS LINEAS:

        //POR EJEMPLO, EL MATH.RANDOM ME GENERA EL NUMERO: 29
        
        //PRIMERA OPERACION: int valor = 29 % 12 + 1;
        // EL VALOR DE ESTO SERIA: 6

        //SEGUNDA OPERACION: String tipopalo = palos[29 / 12];
        // EL VALOR DE ESO ES: 2

        //POR LO TANTO LA CARTA QUE SAQUE ES EL 6 DE ESPADAS
        //ASI ES COMO FUNCIONA

        
        return new Carta(valor, tipopalo);
        //EL RETURN LO QUE HACE ES CREAR EL OBJETO CARTA CON ESOS DOS ATRIBUTOS
        //Y YA TENDRIAMOS NUESTRA CARTA PARA ASIGNARSELA A UNO DE LOS JUGADORES
    }


    public Juegov3() {}

    public Juegov3(int ganadas1, int ganadas2) {
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

    public int getEmpate() {
        return empates;
    }

    public void setEmpate(int empates) {
        this.empates=empates;
    }

    public void cartaAlta() {

        Jugador p1 = new Jugador();
        //Carta c1 = new Carta();

        Jugador p2 = new Jugador();
        //Carta c2 = new Carta();

       
        do {
            p1.setNombre("Abel");
            //c1.setValor((int)(Math.random()*(12-1+1)+1));
            //c1.setPalo("Espadas");
            Carta c1 = sacarCarta();
            p1.setCarta(c1);
            System.out.println("Carta del J1: "+p1.getCarta().getValor()+" de "+p1.getCarta().getPalo());
            

            p2.setNombre("Pepe");
            //c2.setValor((int)(Math.random()*(12-1+1)+1));
            //c2.setPalo("Oros");
            Carta c2 = sacarCarta();
            p2.setCarta(c2);
            System.out.println("Carta del J2: "+p2.getCarta().getValor()+" de "+p2.getCarta().getPalo());
            

            if (p1.getCarta().getValor()>p2.getCarta().getValor()) {
                System.out.println("Victoria del jugador 1");
                System.out.println("===========================");
                ganadas1++;
            }

            else if (p1.getCarta().getValor()<p2.getCarta().getValor()) {
                System.out.println("Victoria del jugador 2");
                System.out.println("===========================");
                ganadas2++;
            }

            else {
                System.out.println("Hubo un empate.");
                System.out.println("===========================");
                empates++;
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
        System.out.println("Cantidad de Empates: "+getEmpate());
}

    public static void main(String[] args) {
        Juegov3 partida = new Juegov3(0, 0);
        partida.setEmpate(0);

        partida.cartaAlta();


        try {
            String ruta="./unidad3/src/Relacion_Ejercicios/Ejercicio6";
            File archivosalida = new File(ruta, "EstadisticasPartida.txt");
            PrintWriter statspartida = new PrintWriter(archivosalida);
            // PrintWriter statspartida = new PrintWriter(new File(ruta,"EstadisticasPartida.txt"));
            statspartida.append("Victorias del jugador 1: "+partida.getGanadas1());
            statspartida.println(" ");
            statspartida.append("Victorias del jugador 2: "+partida.getGanadas2());
            statspartida.println(" ");
            statspartida.append("Cantidad de Empates: "+partida.getEmpate());
            statspartida.close();
            System.out.println("===================================");
            System.out.println("El archivo se ha creado con exito");
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
