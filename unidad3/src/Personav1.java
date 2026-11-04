public class Personav1 {
    //Conjunto de atributos
    String nombre;
    int edad;
    double estatura;

    //Constructor (Por defecto)
    public Personav1 (String nombre, int edad, double estatura) {
        this.nombre=nombre;
        this.edad=edad;
        this.estatura=estatura;
    }
    
    public Personav1 () {
        // this.edad=1;  //Si no le pongo parametros, la edad iniciara siempre con 1 por el this.
        //this.nombre="Abel"; //Antes no estaba asignado y me imprimia "null" para gestionarlo debemos hacer un debug (depurar)
    }

    public int getEdad() {
        return edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    //Metodos (Accion)
    // public int pedirNombre(int nombre) {
    //     Scanner sc=new Scanner (System.in);
    //     System.out.println("Dame tu nombre:");
    //     nombre=sc.nextInt();
    //     setNombre(nombre);
    //     return nombre;
    // }
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setAltura(double estatura){
        this.estatura=estatura;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void saludar() {
        System.out.println("Hola a todos, soy "+nombre+" tengo "+edad+" años y mido "+estatura);
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getEstatura(){
        return this.estatura;
    }

    public int edad(){
        return this.edad;
    }

    public Personav1(Personav1 otra) {
        this.nombre=otra.getNombre();
        this.edad=otra.getEdad();
        this.estatura=otra.getEstatura();
    }
    //Main

    public static void main(String[] args) {
        //Crear persona
        // String nombre;
        Personav1 p= new Personav1();
        
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Dame tu nombre:");

        // nombre=sc.nextLine();
        
        //Darle nombreXX
        // p.pedirNombre(null);
        p.setNombre("Abel");
        //p.saludar();
        p.setAltura(1.70);
        p.setEdad(21);

        Personav1 p2=new Personav1("Rodrigo", 21, 1.70);
        //p2.saludar();

        Personav1 pepa=new Personav1("Pepa", 18, 1.87);
        Personav1 miguel=new Personav1("Miguel", 27, 1.79);
        Personav1 paco=new Personav1("Paco", 51, 1.68);
        // Personav1 otra=new Personav1(pepa);
        // Persona otra=pepa; 

        pepa.saludar();
        // otra.setNombre("Luis");
        // otra.saludar();
        // otra.nombre("Aea");  // <--- NO HACER ESTO X
        pepa.saludar();

        //Luego de modificar el "otra" se cambio el nombre de pepa tambien, *recordar el dibujo de la memoria RAM*
        
        //NO ACCEDER A LOS ATRIBUTOS DIRECTAMENTE, (USAR EL "PRIVATE") HAY QUE USAR UN METODO QUE ACCEDE AL ATRIBUTO (get.Atributo)
        //CUANDO HACER CLASES USAR EL "PRIVATE" PARA LOS ATRIBUTOS **SIEMPRE**
    }

}
