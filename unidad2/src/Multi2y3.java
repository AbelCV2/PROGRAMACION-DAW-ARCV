public class Multi2y3 {
public static boolean Div2y3(int numero) {
        if (numero%3==0 && numero%2==0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i=50; i<=200; i++) {
            if (Div2y3(i)==true) {
                System.out.println(i+" es divislbe por 2 y 3");
            }
        }
    }
}
