import java.util.Scanner;

public class funciones {
final static double pi=3.14;
public static double areacilindro (double radio, double altura) {
    return (2*pi*(altura+radio));
}

public static double volumencilindro (double radio, double altura) {
    return (Math.pow(radio, 2)*pi*altura);
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el radio del cilindro: ");
        double radio=scanner.nextDouble();

        System.out.println("Escribe la altura del cilindro: ");
        double altura=scanner.nextDouble();

        System.out.println("El area del cilindro es: "+areacilindro(radio, altura));
        System.out.println("El volumen del cilindro es: "+volumencilindro(radio, altura));

    }
}
