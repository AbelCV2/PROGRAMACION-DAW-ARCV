import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practica_Binario {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        {

            FileInputStream in = new FileInputStream("./unidad3/src/entrada.txt");
            FileOutputStream out = new FileOutputStream("./unidad3/src/salida.txt");

            int n=0;
            int c;
            System.out.print("\nCopiando ...");
            while ( (c = in.read() ) != -1) {
                out.write(c);
                n++;
            }

            in.close();
            out.close();
            System.out.print("\nSe han copiado "+n+" Bytes\n");
        }   
    }
}
