import java.time.LocalDateTime;

public class unidad2_ejercicio1 {
    public static int Saludo(int hora) {
        

        if (hora>=6 && hora<=12) {
            return 1;
        }

        else if (hora>=13 && hora<=20) {
            return 2;
        }

        else if (hora<5 && hora>=21){
            return 3;
        }

        else {
            return 0;
        }
     
    }
    public static void main(String[] args) {
        LocalDateTime hoy= LocalDateTime.now();

        System.out.println("La hora es: "+hoy.getHour()+" : "+hoy.getMinute());

        int hora=hoy.getHour();

        if (Saludo(hora)==1) {
            System.out.println("Buenos dias!");
        }

        else if (Saludo(hora)==2) {
            System.out.println("Buenas tardes!");
        }

        else if (Saludo(hora)==3) {
            System.out.println("Buenas noches!");
        }

        else {
            System.out.println("Ingreso una hora incorecta...");
        }

    }
}
