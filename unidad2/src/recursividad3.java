public class recursividad3 {
    public static String convertirABinario(int num) {
        if (num==0) {
            return "";
        }

        else {
            return convertirABinario(num/2)+(num%2);
        }
    }

    public static void main(String[] args) {
        System.out.println(convertirABinario(135));
    }
}
