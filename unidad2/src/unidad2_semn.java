public class unidad2_semn {
    public static long calcularFactorial (int n) {
        if (n==1) {
            return 1;
        }

        else {
            return n*calcularFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(calcularFactorial(9));
    }
}
