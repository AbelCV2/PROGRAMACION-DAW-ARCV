// import java.time.LocalDate;
// import java.time.Period;
// import java.time.format.DateTimeFormatter;

// public class Persona2 {
    // String nombre;
    // LocalDate fechaNacimiento;
    // double estatura;
    // final String DNI;
    // static int hijos;
    // Persona2 pareja;

    // public Persona2(String DNI, String fecha) {
    //     DateTimeFormatter fmt= DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //     this.fechaNacimiento=LocalDate.parse(fecha,fmt);
    //     this.DNI=DNI;
    //     this.hijos=2;
    //     this.pareja=null;
    // }

    // public void obtenerEdad() {
    //     Period periodo=Period.between(fechaNacimiento, LocalDate.now());
    //     System.out.println("Tienes "+periodo.getYears()+" años");
    // }

    // public void asignaPareja(Persona2 p) {
    //     this.pareja=p;
    // }

    // public static void main(String[] args) {
    //     Persona2 p = new Persona2(12345678A, "15/08/1985");
    //     p.obtenerEdad();
    //     System.out.println("Tienes "+p.hijos+" hijos");

    //     Persona p2 = new Persona2(23456789B, "16/04/1987");
    //     p.hijos=3;
    //     System.out.println("Tienes "+p2.hijos+" hijos");
    // }
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Persona2 {
 String nombre;
 LocalDate fechaNacimiento;
 double estatura;
 String DNI;
 static int hijos;
 Persona2 pareja;
 
 //Constructor por defecto
 public Persona2() {}  //EL CONSTRUCTOR POR DEFECTO SALE EN ROJO PORQUE NO SE INICIALIZO EL DNI, EL DNI ESTA CON FINAL STRING, QUE ES UNA CONSTANTE (QUE NO CAMBIA) QUE DEBE TENER UN VALOR
 
 //Constructor por parametros
 public Persona2(String DNI,String fecha){
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    this.fechaNacimiento=LocalDate.parse(fecha,fmt);
    this.DNI=DNI;
    this.hijos=2;
    this.pareja=null;
}

//Constructor copia
 public Persona2(Persona2 objeto) {
    this.nombre=objeto.getNombre();
    this.fechaNacimiento=objeto.getFechaNacimiento();
    this.estatura=objeto.getEstatura();
    this.DNI=objeto.getDNI();
    this.hijos=objeto.getHijos();
    this.pareja=objeto.getPareja();
 }

 //Metodos
public String getNombre() {
    return nombre;
}

public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
}

public double getEstatura() {
    return estatura;
}


 public void asignaPareja(Persona2 pareja) {
    this.pareja=pareja;
 }
//Práctica: Completa los métodos get y set de forma automática
     public void obtenerEdad(){
        Period periodo=Period.between(fechaNacimiento, LocalDate.now());
        System.out.println("Tienes "+periodo.getYears()+" años");
     }

// public void asignaPareja(Persona2 p){
//  this.pareja=p; //Hará referencia a la ya existente
//  }
 public static void main(String[] args) {
    Persona2 p=new Persona2("12345678A","15/08/1985");
    p.obtenerEdad();
    System.out.println("Tienes "+p.hijos+" hijos");
    Persona2 p2=new Persona2("12345678B","01/07/1987");
    p.hijos=3;
    System.out.println("Tienes "+p2.hijos+" hijos");
 }
}
