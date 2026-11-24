import java.time.DayOfWeek;
import java.time.LocalDate;

public class Actividad2 {
    public static void main(String[] args) {
        // String [][] horario = {
        //     {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"},
        //     {"Entornos de desarrollo", "Sistemas informaticos", "Programacion", "Lenguajes de marca", "Sistemas informaticos"},
        //     {"Lenguajes de marca", "Digitalizacion", "Programacion", "Lenguajes de marca", "Sistemas informaticos"},
        //     {"Base de datos", "Ippe", "Ippe", "Base de datos", "Base de datos"},
        //     {"Recreo", "Recreo", "Recreo", "Recreo", "Recreo"},
        //     {"Sistemas informaticos", "Sostenibilidad", "Base de datos", "Base de datos", "Entornos de desarrollo"},
        //     {"Sistemas informaticos", "Programacion", "Base de datos", "Programacion", "Entornos de desarrollo"},
        //     {"Programacion", "Programacion", "Programacion", "Programacion", "Ippe"} 
        // };



        String[] lunes = {"Entornos de desarrollo", "Lenguajes de marca", "Base de datos", "Sistemas informaticos", "Sistemas informaticos"};

        String[] martes = {"Sistemas informaticos", "Digitalizacion", "IPPE", "Sostenibilidad", "Programacion", "Programacion"};

        String[] miercoles = {"Programacion", "Programacion", "IPPE", "Base de datos", "Base de datos", "Programacion"};

        String[] jueves = {"Lenguajes de marca", "Lenguajes de marca", "Base de datos", "Base de datos", "Programacion", "Programacion"};

        String[] viernes = {"Sistemas informaticos", "Sistemas informaticos", "Base de datos", "Entornos de desarrollo", "Entornos de desarrollo", "IPPE"};


        

        //System.out.println(LocalDate.now().getDayOfWeek());

        DayOfWeek dia=LocalDate.now().getDayOfWeek(); // ¿?

        
        if (dia.getValue()==1) {
            System.out.println("=LUNES=");
            for(int i=0; i<lunes.length; i++) {
                System.out.print(lunes[i]+" | ");
            }
        }

        else if (dia.getValue()==2) {
            System.out.println("=MARTES=");
            for(int i=0; i<martes.length; i++) {
                System.out.print(martes[i]+" | ");
            }
        }

        else if (dia.getValue()==3) {
            System.out.println("=MIERCOLES=");
            for(int i=0; i<miercoles.length; i++) {
                System.out.print(miercoles[i]+" | ");
            }
        }

        else if (dia.getValue()==4) {
            System.out.println("=JUEVES=");
            for(int i=0; i<jueves.length; i++) {
                System.out.print(jueves[i]+" | ");
            }
        }

        else if (dia.getValue()==5) {
            System.out.println("=VIERNES=");
            for(int i=0; i<viernes.length; i++) {
                System.out.print(viernes[i]+" | ");
            }
        }

        else {
            System.out.println("NO HAY CLASES");
        }
        
        // LUNES
    
        
            
        //     System.out.println("=LUNES=");
        //     for(int i=0; i<lunes.length; i++) {
        //         System.out.print(lunes[i]+" | ");
        //     }
        // }
        
        // String[] dia = horario[0];

        // System.out.println(dia[0]); //DIA LUNES

        // for (int i=0 ; i<horario[0].length; i++) {

        // }

        
    }
}