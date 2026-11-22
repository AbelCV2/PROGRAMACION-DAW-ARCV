
package Relacion_Ejercicios.Ejercicio3;

public class Prueba {

    public static void main(String[] args) {

        // CREAR LOS OBJETOS DE CADA CLASE CON EL CONSTRUCTOR POR DEFECTO, LUEGO AÑADIRLES LOS ATRIBUTOS CON EL GET Y SET
        
        Fabrica fabrica = new Fabrica();
        fabrica.setCuit("123456789");
        fabrica.setNombre("Samsung");
        fabrica.setPais("Corea del Sur");
        fabrica.setGerente("Carlos");
        fabrica.setCantEmp(500);


        Producto producto = new Producto();
        producto.setCodigo(1);
        producto.setDescripcion("Telefono movil");
        producto.setColor("Negro");
        producto.setCosto(350.50);
        producto.setFabrica(fabrica);


        Sucursal sucursal = new Sucursal();
        sucursal.setNumero(101);
        sucursal.setDomicilio("Calle Mayor 15");
        sucursal.setCiudad("Almeria");


        Domicilio domicilio = new Domicilio();
        domicilio.setCiudad("Almeria");
        domicilio.setNumero(25);
        domicilio.setCalle("Calle Sol");

        
        Empleado empleado = new Empleado();
        empleado.setLegajo("E001");
        empleado.setDni("12345678A");
        empleado.setNombre("Pedro");
        empleado.setTelefonos(2);
        empleado.setDomicilio(domicilio);


        Cliente cliente = new Cliente();
        cliente.setCodigo("C001");
        cliente.setNombre("Juan");
        cliente.setCiudad("Almeria");
        cliente.setDni("87654321B");
        cliente.setFechaNac("15/05/2000");
        cliente.setSucursal(sucursal);


        Tarjeta tarjeta = new Tarjeta();
        tarjeta.setNumero(12345);
        tarjeta.setNombre("Juan");
        tarjeta.setCodigo("ABC123");
        tarjeta.setFechaVenc("12/2028");
        tarjeta.setCliente(cliente);

       
        Trabaja trabaja = new Trabaja();
        trabaja.setSucursal(sucursal);
        trabaja.setEmpleado(empleado);
        trabaja.setHorario("08:00 - 15:00");
        trabaja.setDia("Lunes");

        
        Vende vende = new Vende();
        vende.setSucursal(sucursal);
        vende.setProducto(producto);
        vende.setPrecioVenta(399.99);

        // AHORA A IMPRIMIR LOS DATOS
        
        System.out.println("CLIENTE");
        cliente.ImprimirCodigo();
        cliente.ImprimirNombre();
        cliente.ImprimirCiudad();
        cliente.ImprimirDni();
        cliente.ImprimirFechaNac();

        System.out.println("=========================================");

        System.out.println("TARJETA");
        tarjeta.ImprimirNumero();
        tarjeta.ImprimirNombre();
        tarjeta.ImprimirCodigo();
        tarjeta.ImprimirFechaVenc();

        System.out.println("=========================================");

        System.out.println("SUCURSAL");
        sucursal.ImprimirNumero();
        sucursal.ImprimirCiudad();
        sucursal.ImprimirDomicilio();

        System.out.println("=========================================");

        System.out.println("EMPLEADO");
        System.out.println("Legajo: " + empleado.getLegajo());
        System.out.println("DNI: " + empleado.getDni());
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Telefonos: " + empleado.getTelefonos());

        System.out.println("=========================================");

        System.out.println("DOMICILIO");
        System.out.println("Calle: " + domicilio.getCalle());
        System.out.println("Numero: " + domicilio.getNumero());
        System.out.println("Ciudad: " + domicilio.getCiudad());

        System.out.println("=========================================");

        System.out.println("FABRICA");
        System.out.println("CUIT: " + fabrica.getCuit());
        System.out.println("Nombre: " + fabrica.getNombre());
        System.out.println("Pais: " + fabrica.getPais());
        System.out.println("Gerente: " + fabrica.getGerente());
        System.out.println("Cantidad empleados: " + fabrica.getCantEmp());

        System.out.println("=========================================");

        System.out.println("PRODUCTO");
        producto.ImprimirCodigo();
        producto.ImprimirDescripcion();
        producto.ImprimirColor();
        producto.ImprimirCosto();
        producto.ImprimirFabrica();

        System.out.println("=========================================");

        System.out.println("TRABAJA (RELACION)");
        System.out.println("Empleado: " + trabaja.getEmpleado().getNombre());
        System.out.println("Sucursal: " + trabaja.getSucursal().getNumero());
        System.out.println("Horario: " + trabaja.getHorario());
        System.out.println("Dia: " + trabaja.getDia());

        System.out.println("=========================================");

        System.out.println("VENDE (RELACION)");
        System.out.println("Sucursal: " + vende.getSucursal().getNumero());
        System.out.println("Producto: " + vende.getProducto().getDescripcion());
        System.out.println("Precio de venta: " + vende.getPrecioVenta());

        System.out.println("=========================================");

    }
}
