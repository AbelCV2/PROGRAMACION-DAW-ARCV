
import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int usuario;
        int ordenador;

        int victoriasUsuario = 0;
        int victoriasOrdenador = 0;

        while (victoriasUsuario < 5 && victoriasOrdenador < 5) {

            System.out.println("\n--- PIEDRA, PAPEL O TIJERA ---");
            System.out.println("1. Tijera");
            System.out.println("2. Papel");
            System.out.println("3. Piedra");

            System.out.println("Elige una opcion:");
            usuario = sc.nextInt();

            if (usuario < 1 || usuario > 3) {

                System.out.println("Opcion no valida. Intentalo de nuevo.");

            }

            else {

                // El ordenador genera un numero aleatorio entre 1 y 3

                ordenador = (int) (Math.random() * 3) + 1;

                System.out.println("Tu eleccion: " + usuario);
                System.out.println("Eleccion del ordenador: " + ordenador);

                // COMPROBAR QUIEN HA GANADO

                if (usuario == ordenador) {

                    System.out.println("EMPATE");

                }

                else if ((usuario == 1 && ordenador == 2) || (usuario == 2 && ordenador == 3) || (usuario == 3 && ordenador == 1)) {

                    System.out.println("HAS GANADO");

                    victoriasUsuario++;

                }

                else {

                    System.out.println("HA GANADO EL ORDENADOR");

                    victoriasOrdenador++;

                }

                System.out.println("Victorias del usuario: " + victoriasUsuario);
                System.out.println("Victorias del ordenador: " + victoriasOrdenador);

            }

        }

        // RESULTADO FINAL

        System.out.println("\n--- FIN DE LA PARTIDA ---");

        if (victoriasUsuario == 5) {

            System.out.println("¡FELICIDADES! HAS GANADO LA PARTIDA.");

        }

        else {

            System.out.println("EL ORDENADOR HA GANADO LA PARTIDA.");

        }

        sc.close();

    }

}
