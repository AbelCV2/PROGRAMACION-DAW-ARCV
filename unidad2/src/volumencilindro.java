import java.util.Scanner;
public class volumencilindro {
    
    public static double volumencilindro (double radio, double altura) {
        return (Math.pow(radio, 2)*3.14*altura);
    }

    public static double areacilindro (double radio, double altura) {
        return (2*3.14*radio*(radio+altura));
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Escribe el radio del cilindro: ");
        double radio=scanner.nextDouble();

        System.out.println("Escribe la altura del cilindro: ");
        double altura=scanner.nextDouble();

        System.out.println("El volumen del cilindro es: "+volumencilindro(radio, altura));

        System.out.println("El area del cilindro es: "+areacilindro(radio, altura));
    }
}
