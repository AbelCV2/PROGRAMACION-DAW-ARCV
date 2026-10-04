import java.util.Scanner;
public class tablas {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero para mostrar su tabla de multiplicar:");
        numero = sc.nextInt();

        System.out.println("Tabla de multiplicar del "+numero+":");
        for (int i=1; i<13; i++) { // for (inicio; condicion; incremento) (Empieza por1, mientras sea menor que 13, incrementa en 1) \ i++ es lo mismo que i=i+1 (Si quiero aumentar de 2 en 2 u otro numero seria "i += 2" (el 2 puedo reemplazarlo por cualquier numero)
            System.out.println(numero+" x "+i+ " = "+(numero*i));
        }
    }
}
