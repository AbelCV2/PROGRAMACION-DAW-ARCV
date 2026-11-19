import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;                    //Esto es lo que necesitamos para trabajar
import java.io.IOException;
import javax.imageio.ImageIO;

public class LecturaImagen_Colores {
    public static void main(String[] args) {
        try {
        
        //Le doy una ruta de entrada (para decirle donde esta mi imagen)
        String rutaentrada = "./unidad3/src/imagen_sin_procesar.jpg";

        //Le doy una ruta de salida (donde se va a guardar la imagen despues de modificarla)
        String rutasalida = "./unidad3/src/imagen_procesada.jpg";

        //Ahora leer la imagen original
        BufferedImage imagenColor = ImageIO.read(new File(rutaentrada));

        //new File(rutaentrada) --> Representa el archivo que queremos abrir
        //ImageIO.read --> Lee el contenido del archivo
        //BufferedImage --> Almacena la imagen en memoria para poder trabajarla

        if (imagenColor == null) {
            System.out.println("No se pudo cargar la imagen");
            return;
        } //Este IF comprueba si se pudo leer la imagen correctamente, sino dara el mensaje y termina

        //Ahora creamos la imagen en escala de grises
        BufferedImage imagenGris = new BufferedImage(imagenColor.getWidth(), imagenColor.getHeight(), BufferedImage.TYPE_BYTE_GRAY);

        // .getWidth() --> Da la anchura de la imagen
        // .getHeight() --> Da la altura de la imagen
        // BufferedImage.TYPE_BYTE_GRAY --> Establece que la nueva img utilice un formato de escala de grises


        //Ahora, ¿como se modifica cada pixel?

        //Hay dos bucles FOR anidados, ¿para que? --> Para recorrer todos los pixeles de la img

        //Como las imgs estan conformadas por pequeños puntos (pixeles), cada uno tiene una 
        //Posicion determinada

        // X representa la posicion horizontal
        // Y la vertical



        for (int y=0; y < imagenColor.getHeight(); y++) {  //Este primer for recorre las filas
            for (int x=0; x < imagenColor.getWidth(); x++) {
                //Este segundo for recorre los pixeles de cada linea

                Color color = new Color(imagenColor.getRGB(x, y));
                //Esto obtiene el color de cada pixel que estamos recorriendo

                int gris = (int) (color.getRed() * 0.3 + color.getGreen() * 0.59 + color.getBlue() * 0.11);
                //Esta operacion calcula un unico valor que representa la luminosidad del pixel

                //¿Por qué no hacemos la media de los tres colores?
                //Por que el ojo humano no percibe todos los colores con la misma sensibilidad

                //+++Verde , ++Rojo , +Azul

                //Por eso se utilizan porcentajes

                //Color --- Peso en el calculo
                //Rojo --- 30%
                //Verde --- 59%
                //Azul --- 11%

                //Usando los valores del ejemplo anterior

                // (200 x 0.3) + (100 x 0.59) + (50 x 0.11)
                // 60 + 59 + 5.5 = 124.5

                //Pero como pusimos (int) nos dara como resultado 124

                //Ahora tenemos un unico valor que representa el gris que debemos utilizar

                int nuevoColor = new Color(gris, gris, gris).getRGB();
                imagenGris.setRGB(x, y, nuevoColor);

                //Esto hace dos cosas:

                //Lo primero, crea un nuevo color utilizando el mismo valor en rojo verde y azul
                // (124, 124, 124)

                //Lo segundo, coloca ese nuevo color en la posicion (x,y) de la imagen en escala de grises

                //"Cuando los tres componentes RGB tienen el mismo valor se obtiene un tono de gris"
                //Este proceso se repite para todos los pixeles hasta convertir toda la imagen
            }
        }

        //Ahora guardamos la nueva imagen
        
        boolean resultado = ImageIO.write(imagenGris, "png", new File(rutasalida));

        //imagenGris --> Imagen que queremos guardar
        //"png" --> Formato que queremos
        //new File(rutasalida) --> Donde se guardara


        //Ahora se comprueba

        if (resultado) {
            System.out.println("Conversion completada");
        }

        else {
            System.out.println("No fue posible guardar la imagen");
        }
        }catch (IOException e) {
            System.out.println("Error al leer o escribir la imagen: "+e.getMessage());
        }
    }
}
