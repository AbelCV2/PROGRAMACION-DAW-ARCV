public class Matriz {
    public static void main(String[] args) {
        String[][] comidas = {
            {"Avena", "Cereal", "Huevo", "Yogur", "Fruta", "Pan tostado con aguacate", "Hotcakes"},
            {"Pollo", "Sándwich", "Verduras", "Atún", "Bistec", "Champiñones", "Espagueti"},
            {"Frijoles", "Quesadillas", "Estofado", "Picadillo", "Lasaña", "Ensalada", "Pizza"}
        };
        
        String[] b = comidas[1]; // ESTE TOMA EL VECTOR DE LA FILA 1 Y LO USA COMO OTRA MATRIZ LLAMADA B
        System.out.println(comidas[1][2]); //ESTE VA DIRECTAMENTE SIGUIENDO LAS COORDENADAS I J
        System.out.println(b[2]); // DENTRO DE ESA MATRIZ B QUE ESTA HECHA DE LA PRIMERA FILA DE LA MATRIZ COMIDAS
        // AHORA VA A SU POSICION 2 QUE ES VERDURAS

        //POR ESO AMBOS IMPRIMEN VERDURAS...

        

    }
}
