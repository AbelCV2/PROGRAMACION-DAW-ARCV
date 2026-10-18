public class Persona {
    //Conjunto de atributos
    String nombre;
    int edad;
    double estatura;

    //Constructor (Por defecto)
    public Persona (String nombre, int edad, double estatura) {
        this.nombre=nombre;
        this.edad=edad;
        this.estatura=estatura;
    }
    
    public Persona () {
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

    public Persona(Persona otra) {
        this.nombre=otra.getNombre();
        this.edad=otra.getEdad();
        this.estatura=otra.getEstatura();
    }
    //Main

    public static void main(String[] args) {
        //Crear persona
        // String nombre;
        Persona p= new Persona();
        
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Dame tu nombre:");

        // nombre=sc.nextLine();
        
        //Darle nombreXX
        // p.pedirNombre(null);
        p.setNombre("Abel");
        //p.saludar();
        p.setAltura(1.70);
        p.setEdad(21);

        Persona p2=new Persona("Rodrigo", 21, 1.70);
        //p2.saludar();

        Persona pepa=new Persona("Pepa", 18, 1.87);
        Persona miguel=new Persona("Miguel", 27, 1.79);
        Persona paco=new Persona("Paco", 51, 1.68);
        Persona otra=new Persona(pepa);
        // Persona otra=pepa; 

        pepa.saludar();
        otra.setNombre("Luis");
        otra.saludar();
        // otra.nombre("Aea");  // <--- NO HACER ESTO X
        pepa.saludar();

        //Luego de modificar el "otra" se cambio el nombre de pepa tambien, *recordar el dibujo de la memoria RAM*
        
        //NO ACCEDER A LOS ATRIBUTOS DIRECTAMENTE, (USAR EL "PRIVATE") HAY QUE USAR UN METODO QUE ACCEDE AL ATRIBUTO (get.Atributo)
        //CUANDO HACER CLASES USAR EL "PRIVATE" PARA LOS ATRIBUTOS **SIEMPRE**
    }

}
