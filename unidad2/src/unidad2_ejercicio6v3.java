
import java.util.Scanner;

public class unidad2_ejercicio6v3 {

    public static int SueldoBase(int cargo) {
        if (cargo==1) {
            
            return 950;
        } 
        
        else if (cargo==2) {
            
            return 1200;
        } 
        
        else if (cargo==3) {
            
            return 1600;
        } 
        
        else {
            
            return 0;
        }
    }

    public static String Cargos(int cargo) {
        if (cargo==1) {
            
            return "Prog. junior";
        } 
        
        else if (cargo==2) {
            
            return "Prog. senior";
        } 
        
        else if (cargo==3) {
            
            return "Jefe de proyecto";
        } 
        
        else {
            
            return "Error";
        }
    }

    public static int GastoViajes(int dias) {
        
        return dias*30;
    
    }

    public static int SueldoBruto(int dias, int cargo) {
        
        return SueldoBase(cargo) + GastoViajes(dias);
    
    }

    public static int Irpf(int bruto, int estado) {
        if (estado==1) {
            
            return bruto*25/100;
        } 
        
        else if (estado==2) {
            
            return bruto*20/100;
        } 
        
        else {
            
            return 0;
        }
    }

    public static int RetencionIRPF(int dias, int cargo, int estado) {
        int bruto = SueldoBruto(dias, cargo);
        return Irpf(bruto, estado);
    }

    public static int SueldoNETO(int dias, int cargo, int estado) {
        return SueldoBruto(dias, cargo)- RetencionIRPF(dias, cargo, estado);
    }

    public static void main(String[] args) {

        int cargo;
        int dias;
        int estado;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca el cargo del empleado (1-3):");
        cargo=sc.nextInt();

        if (cargo<1 || cargo>3) {
            System.out.println("Numero incorrecto");
        } else {

            System.out.println(
                "¿Cuantos dias ha estado de viaje visitando clientes?"
            );
            dias=sc.nextInt();

            if (dias<0) {
                System.out.println("Numero incorrecto");
            } else {

                System.out.println(
                    "Introduzca su estado civil (1 - Soltero, 2 - Casado):"
                );
                estado=sc.nextInt();

                if (estado<1 || estado>2) {
                    System.out.println("Numero incorrecto");
                } else {

                    int base = SueldoBase(cargo);
                    int dietas = GastoViajes(dias);
                    int bruto = SueldoBruto(dias, cargo);
                    int retencion = RetencionIRPF(dias, cargo, estado);
                    int neto = SueldoNETO(dias, cargo, estado);

                    System.out.println("--------------------------------------");   
                    System.out.println("| Cargo: " + Cargos(cargo) + "                |");
                    System.out.println("| Sueldo base: " + base+ "                  |");
                    System.out.println("| Dietas (" + dias + " viajes): " + dietas+ "             |");
                    System.out.println("--------------------------------------");
                    System.out.println("| Sueldo bruto: " + bruto+ "                 |");
                    System.out.println("| Retencion IRPF: " + retencion+ "                |");
                    System.out.println("--------------------------------------");
                    System.out.println("| Sueldo neto: " + neto+ "                  |");
                    System.out.println("--------------------------------------");
                }
            }
        }

    }
}
