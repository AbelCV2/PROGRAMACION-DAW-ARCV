package Actividad1;
import Actividad1.CuentaCorriente.CuentaCorriente;
import Actividad1.Persona.Persona1;

public class App {
    //Atributos de perro
    // String nombre, raza, tamaño;
    // int edad;
    // static String color;


    // public static void main(String[] args) {  //NO PODEMOS EJECUTAR ATRIBUTOS, SOLO PODEMOS LLAMAR OBJETOS Y METODOS
    //     // color="Rojo";
    //     // System.out.println(color);
    // } 

    public static void main(String[] args) {
        Persona1 p1= new Persona1();
        Persona1 p2 = new Persona1();

        CuentaCorriente c1= new CuentaCorriente(null, 0);
        CuentaCorriente c2= new CuentaCorriente(null, 0);

        c1.setNumeroC("ES239342378234235");
        c1.setSaldo(1411.65);

        System.out.println("DATOS DE LA PRIMERA PERSONA:");
        System.out.println("===========================");
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("DNI: "+p1.getDNI());
        System.out.println("Dirección: "+p1.getDireccion());
        System.out.println("Estado Civil: "+p1.getEstado());
        System.out.println("Fecha de nacimiento: "+p1.getFecha());
        System.out.println("Género: "+p1.getGenero());
        System.out.println("Numero de cuenta: "+c1.getNumeroC());
        System.out.println("Saldo: "+c1.getSaldo());
        System.out.println("===========================");

        //PERSONA 2

        //COMO EL CONSTRUCTOR YA TENIA DATOS PUESTOS, UTILIZO EL SET CON LOS ATRIBUTOS DE LA PERSONA PARA CAMBIARSELOS

        p2.setNombre("Carlos");
        p2.setDireccion("Albox");
        p2.setDni("Z92438724Q");
        p2.setEstado("Casado");
        p2.setFecha(1995);
        p2.setGenero("Masculino");

        c2.setNumeroC("ES90434823492343");
        c2.setSaldo(1677.09);

        //ESPACIO (DECORACION)
        System.out.println("");
        System.out.println("");

        System.out.println("DATOS DE LA SEGUNDA PERSONA:");
        System.out.println("===========================");
        System.out.println("Nombre: "+p2.getNombre());
        System.out.println("DNI: "+p2.getDNI());
        System.out.println("Dirección: "+p2.getDireccion());
        System.out.println("Estado Civil: "+p2.getEstado());
        System.out.println("Fecha de nacimiento: "+p2.getFecha());
        System.out.println("Género: "+p2.getGenero());
        System.out.println("Numero de cuenta: "+c2.getNumeroC());
        System.out.println("Saldo: "+c2.getSaldo());
        System.out.println("===========================");


    }
}
