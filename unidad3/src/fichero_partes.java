import java.util.Scanner;
import java.io.File;

public class fichero_partes {
    public static void main(String[] args) {
        try {
            Scanner leer= new Scanner(new File ("./unidad3/src/FicheroEjemplo.txt"));
            //leer.useDelimiter(";");
            String linea;
            // int suma=0;
            // double contador=0;

            
            //PRIMERA LINEA
            // while (leer.hasNextLine()) {
            //     linea=leer.nextLine();
            //     Scanner sc = new Scanner(linea);
            //     int numero1=sc.nextInt();
            //     int numero2=sc.nextInt();
            //     int numero3=sc.nextInt();
            //     System.out.println("La media es: "+(numero1+numero2+numero3)/3);


            // }


            while (leer.hasNextLine()) {
                linea=leer.nextLine();
                
                System.out.println(linea);
                Scanner sc = new Scanner(linea);
                sc.useDelimiter("[;\\s]+"); //USEDELIMITER(";") --> PARA UNA SOLA CONDICION
                //USEDELIMITE("[;\\S]+") --> PARA VARIAS CONDICIONES (VAN JUNTOS DENTRO DEL CORCHETE)
                int numero1=sc.nextInt();
                int numero2=sc.nextInt();
                int numero3=sc.nextInt(); //NO PONER SC.NEXTLINE PORQUE UN FICHERO ES UN FLUJO DE DATOS
                //NO ENTIENDE DE SALTOS DE LINEA (NO HAY UN ELEMENTO DE SALTO DE LINEA COMO TAL EN EL ARCHIVO)
                System.out.println(numero1+"-"+numero2+"-"+numero3);

                // int numero1=leer.nextInt();
                // contador++;
                // suma+=numero1;
                // System.out.print(numero1+"-");
            }
            // System.out.println("La media es: "+suma/contador);
            leer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
