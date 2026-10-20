import java.util.Scanner;

public class maximos_minimos_edad {
    public static void main(String[] args) {
        int maximo=0, minimo=0, numero, contador=0;

        int suma=0, mayores=0;
        double media=0;
        Scanner sc=new Scanner(System.in);

        do {
            numero=sc.nextInt(); sc.nextLine();
            if (contador==0) {
                maximo=numero;
                minimo=numero;
                
            }

            if (numero>maximo) {
                maximo=numero;
            }

            if ((numero<minimo) && (numero!=-1)){
                minimo=numero;
            }

            suma=suma+numero;
            contador++;
            
            
            if (numero>=18) {
                mayores++;
            }
        
        }while (numero!=-1);

        if (contador>0) {
            media=suma/contador;
        }

        System.out.println("La edad minima es: "+minimo);
        System.out.println("La edad maxima es: "+maximo);
        System.out.println("La suma de las edades es: " + suma);
        System.out.println("La media de las edades es: " + media);
        System.out.println("El numero de alumnos es: " + contador);
        System.out.println("Los mayores de edad son: " + mayores);
}

}
