package Relacion_Ejercicios.Ejercicio7;

public class Luchav2 {
    public static void main(String[] args) {

        Heroe heroe1 = new Heroe("Hercules", 250, 50);
        Monstruo monstruo1 = new Monstruo("Cancerbero", 200, 50);

        // Turno inicial aleatorio
        boolean turnoHeroe = Math.random() < 0.5;

        // Mientras ambos tengan vida
        while (heroe1.getVida()>0 && monstruo1.getVidaM()>0) {

            if (turnoHeroe) {

                System.out.println("Ataca el heroe: "+heroe1.getNombre());

                monstruo1.RecibirDanoM(heroe1.getAtaque());
                monstruo1.ImprimirDanoRecibidoM();

            } else {

                System.out.println("Ataca el monstruo: "+monstruo1.getNombreM());

                heroe1.RecibirDanoH(monstruo1.getAtaqueM());
                heroe1.ImprimirDanoRecibidoH();

            }

            // Cambiar el turno
            turnoHeroe = !turnoHeroe;
        }

        // Comprobar vencedor
        System.out.println("---FIN DEL COMBATE---");

        if (heroe1.getVida()>0) {
            System.out.println("El ganador es "+heroe1.getNombre());
            System.out.println("Vida restante: "+heroe1.getVida());

        } else {
            System.out.println("El ganador es "+monstruo1.getNombreM());
            System.out.println("Vida restante: "+monstruo1.getVidaM());
        }
    }
}
