import java.util.Scanner;
public class signozoo {
    public static int Rangodia(int dia, int mes) {
        for (mes=1; mes<=12; mes++) {
            for (dia=1; dia<=31; dia++){

                if ((dia>19 && mes==1) || (dia<15 && mes==2)) {
                    return 0;
                }

                else if ((dia>16 && mes==2) || (dia<11 && mes==3)) {
                    return 1;
                }

                else if ((dia>12 && mes==3) || (dia<18 && mes==4)){
                    return 2;
                }
            }
        }
    
    return 10; 
}
    
    public static void main(String[] args) {
        int dia, mes;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el dia:");
        dia=sc.nextInt();

        System.out.println("Ingrese el mes");
        mes=sc.nextInt();

        switch (Rangodia(dia, mes)) {
            case 0:
                System.out.println("Capricornnio");
                break;
        
            case 1:
                System.out.println("Acuario");
                break;
        }



        
        // System.out.println("El signo zoodiacal del dia "+dia+" del mes de "+mes+" es: "+Rangodia(dia, mes));


    }
}
