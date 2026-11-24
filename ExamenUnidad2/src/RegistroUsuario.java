// Clase que usa la excepción
public class RegistroUsuario {
    public void registrarUsuario(String nombre, int edad) throws EdadNoValida {
        if (edad < 18) {
            throw new EdadNoValida("La edad mínima para registrarse es 18.");
        }
        System.out.println("Usuario " + nombre + " registrado con éxito.");
    }
    public static void main(String[] args) {
         RegistroUsuario registro = new RegistroUsuario();
        try {
            registro.registrarUsuario("Ana", 16); // lanza excepción
            } catch (EdadNoValida e) {
        System.out.println("Error: " + e.getMessage());
        }
    }
}

