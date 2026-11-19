//ACTIVIDAD COLORES NEGATIVOS IMG

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;                   
import java.io.IOException;
import javax.imageio.ImageIO;

public class ActividadDiap1 {
    public static void main(String[] args) {
        
        try {
            //Ruta de entrada y salida

            String rutaentrada = "./unidad3/src/imagen_diap1.png";
            String rutasalida = "./unidad3/src/imagen_diap1_res.png";

            //Leer la imagen
            BufferedImage imagenEntrada = ImageIO.read(new File(rutaentrada));

            //Si no lo puede leer que de un mensaje y termine el programa

            if (imagenEntrada == null) {
                System.out.println("No se pudo leer la imagen");
            }

            BufferedImage imagenNegativo = new BufferedImage(imagenEntrada.getWidth(), imagenEntrada.getHeight(), BufferedImage.TYPE_INT_RGB);
            //Ahora debo usar el TYPE_INT_RGB para conservar los tres componentes de cada color

            //Ahora a leer cada linea y cada pixel de linea

            for (int y=0; y < imagenEntrada.getHeight(); y++) {
                for (int x=0; x < imagenEntrada.getWidth(); x++) {
                    
                    Color color = new Color(imagenEntrada.getRGB(x, y)); //Sacamos el color de cada pixel

                    //Ahora debo crear lo colores negativos

                    int rojoneg = (int) (255 - color.getRed());

                    int verdeneg = (int) (255 - color.getGreen());

                    int azulneg = (int) (255 - color.getBlue());

                    //Ahora creamos los nuevos colores
                    int coloresNeg = new Color(rojoneg, verdeneg, azulneg).getRGB();
                    imagenNegativo.setRGB(x, y, coloresNeg);
                }
            }

            boolean resultado = ImageIO.write(imagenNegativo, "png", new File(rutasalida));

            if (resultado) {
                System.out.println("El archivo se guardo correctamente");
            }

            else {
                System.out.println("El archivo no se pudo guardar");
            }


        }catch (IOException e) {
            System.out.println("Ha ocurrido un error "+e.getMessage());
        }
    }
}
