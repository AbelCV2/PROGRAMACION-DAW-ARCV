import java.util.Scanner;

public class maximos_minimos_edad {
    public static void main(String[] args) {
        int maximo=0, minimo=0, numero, contador=0;
        Scanner sc=new Scanner(System.in);

        do {
            numero=sc.nextInt(); sc.nextLine();
            if (contador==0) {
                maximo=numero;
                minimo=numero;
                contador++;
            }

            if (numero>maximo) {
                maximo=numero;
            }

            if ((numero<minimo) && (numero!=-1)){
                minimo=numero;
            }
        
        }while (numero!=-1);

        System.out.println("La edad minima es: "+minimo);
        System.out.println("La edad maxima es: "+maximo);
}

}
