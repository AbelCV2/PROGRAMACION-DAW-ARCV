public class Ejercicio4 {
    public static void ImprimeTablero(boolean valor) {
        if (valor==false) {
            System.out.println("Valor FALSE");
            System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.println("| ");
            System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.println("| ");
            System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.print("| X "); System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.println("| ");
            System.out.print("| "); System.out.print("| "); System.out.print("| "); System.out.print("| O "); System.out.print("| X "); System.out.print("| "); System.out.print("| "); System.out.println("| ");
            System.out.print("| "); System.out.print("| "); System.out.print("| X "); System.out.print("| O "); System.out.print("| O "); System.out.print("| "); System.out.print("| "); System.out.println("| ");
            System.out.print("| "); System.out.print("| X "); System.out.print("| O "); System.out.print("| X "); System.out.print("| O "); System.out.print("| X "); System.out.print("| "); System.out.println("| ");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        else if (valor==true) {
            System.out.println("Valor TRUE");
            System.out.print("| X "); System.out.print("| O "); System.out.print("| X "); System.out.println("|");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.print("| "); System.out.print("| O "); System.out.print("| "); System.out.println("|");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.print("| "); System.out.print("| X "); System.out.print("| "); System.out.println("|");
            System.out.println("--------------------------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
       ImprimeTablero(true);
        ImprimeTablero(false);
       
    }
}
