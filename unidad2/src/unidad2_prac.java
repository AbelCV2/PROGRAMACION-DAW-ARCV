public class unidad2_prac {
    // public static int funcion(int num, int pos) {
    //     if (num<10) {
    //         return num;
    //     }
    //     else {
    //         return (funcion(num/10, pos-1))+(int)Math.pow(10, pos)*(num%10);
    //     }
    // }   
    public static void main(String[] args) {
        incre(4);
    }
    //     int a=254;
    //     System.out.println(funcion(a, 2));
    // }
    

    public static void incre(int n) {
        if (n>0) {
            incre(n-1);
            System.out.print(n);
        }

        else {
            System.out.println();
        }
    }
}
