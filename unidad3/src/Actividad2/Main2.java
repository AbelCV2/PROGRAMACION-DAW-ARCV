package Actividad2;

public class Main2 {
    public static void main(String[] args) {
        PersonaU3_1 p1= new PersonaU3_1(); //Constructor por defecto
        PersonaU3_1 p2= new PersonaU3_1("240349ESP", "Juan", "Perez", '1');
        PersonaU3_1 p3=new PersonaU3_1(p2);

        //Para el p1 --> Asigno parametros

        p1.setGenero('2');
        p1.setNombre("Rosa");
        p1.setApellido("Nuñez");
        p1.setCedula("3494293ESP");


        // Cambiar datos de p3 (Copia)

        p3.setNombre("Oliver");
        p3.setApellido("Rodriguez");
        p3.setCedula("ESP434234Q");
        p3.setGenero('1');


        //Prueba del constructor por defecto
        PersonaU3_1 p4 = new PersonaU3_1();

        System.out.println(p4.getNombre());  //IMPRIME NULL PORQUE NO ASIGNE PARAMETROS DESPUES 

        //PARA DEFINIR PARAMETROS DEBO USAR EL .SET

        p4.setNombre("Rori");

        p4.ImprimeNombre();

        p1.ImprimeNombre();
        p2.ImprimeNombre();
        p3.ImprimeNombre();


        p1.ImprimeCNacimiento();
        //NO IMPRIMIO NADA


        CiudadU3_1 ciudad1 = new CiudadU3_1(04600, "Huercal-Overa", 1);
        p1.setCnacimiento(ciudad1);

        p1.ImprimeCNacimiento();

        //NO IMPRIME LA INFORMACION


        System.out.println(ciudad1.getNombre());
        

        //AHORA SI IMPRIME EL NOMBRE, PERO DIRECTAMENTE CON EL SYSTEM.OUT.PRINTLN, NO CON UNA FUNCION


        

    }
}
