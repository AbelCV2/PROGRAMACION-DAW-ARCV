package Actividad2;
public class PersonaU3_1 {
    private String cedula;
    private String nombre;
    private String apellido;
    private char genero;

    //Atributos de otras clases
    private FechaU3_1 Fnacimiento;
    private CiudadU3_1 Cnacimiento;
    private CiudadU3_1 Cresidencia;

    //Constructor por defecto
    public PersonaU3_1() {}

    //Constructor con parametros
    public PersonaU3_1 (String cedula, String nombre, String apellido, char genero) {
        // this.cedula="ESP23";
        // this.nombre="Abel";
        //EL .THIS SE USA PARA ASIGNAR PARAMETROS QUE NO ESTEN YA DENTRO DEL () DEL CONSTRUCTOR
        // this.apellido="Castillo";
        // this.genero='M';

        //EJEMPPLO, EN EL () ESTAN CEDULA NOMBRE APELLIDO Y GENERO, PERO NO ESTAN LA FNACMIENTO CNACIMIENTO Y CRESIDENCIA
        //ASI QUE ESO SI PUEDO ASIGNARLO CON EL .THIS
    }

    //Constructor copia
    public PersonaU3_1(PersonaU3_1 otra) {
        this.nombre=otra.getNombre();
        this.cedula=otra.getCedula();
        this.apellido=otra.getApellido();
        this.genero=otra.getGenero();
    }

    
    //GETS Y SETS GENERADOR AUTOMATICAMENTE
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public FechaU3_1 getFnacimiento() {
        return Fnacimiento;
    }

    public void setFnacimiento(FechaU3_1 fnacimiento) {
        Fnacimiento = fnacimiento;
    }

    public CiudadU3_1 getCnacimiento() {
        return Cnacimiento;
    }

    public void setCnacimiento(CiudadU3_1 cnacimiento) {
        Cnacimiento = cnacimiento;
    }

    public CiudadU3_1 getCresidencia() {
        return Cresidencia;
    }

    public void setCresidencia(CiudadU3_1 cresidencia) {
        Cresidencia = cresidencia;
    }


    public void ImprimeNombre() {
        
        if (nombre!=null) {
            System.out.println(getNombre());
        }
    }

    public void ImprimeCNacimiento() {
        if (Cnacimiento!=null) {
            System.out.println(getCnacimiento());
        }
    }

}