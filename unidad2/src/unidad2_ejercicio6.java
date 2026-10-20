import java.util.Scanner;

public class unidad2_ejercicio6 {
    
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

    public static String Cargos (int cargo) {
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

    public static int Irpf (int estado, int bruto) {
        if (estado==1) {
            return (bruto * 25/100);
        }

        else if (estado==2) {
            return (bruto * 20/100);
        }

        else {
            return 0;
        }
    }

    public static int GastoViajes (int dias) {
        int gastos=dias*30;
        return gastos;
    }


    public static int SueldoBruto (int dias, int cargo) {
        return SueldoBase(cargo)+GastoViajes(dias);
    }

    public static int RetencionIRPF (int dias, int cargo, int estado) {
        return SueldoBase(cargo)+GastoViajes(dias)-Irpf(estado, estado);
    }

    public static void SueldoNETO (int dias, int cargo, int estado) {
        int sueldoneto;
        sueldoneto=(SueldoBruto(dias, cargo) - RetencionIRPF(dias, cargo, estado));
        System.out.println(sueldoneto);
    }
    public static void main(String[] args) {
        int cargo;
        int dias;
        int estado;
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca el cargo de empleado (1-3):");

        cargo=sc.nextInt();

        if (cargo>3) {
            System.out.println("Numero incorrecto");
        }

        else {
            System.out.println("¿cuantos dias ha estado de viaje visitando clientes?:");

            dias=sc.nextInt();

            if (dias<0) {
                System.out.println("Numero incorrecto");
            }

            else {
                System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado):");

                estado=sc.nextInt();

                if (estado>2) {
                    System.out.println("Numero incorrecto");
                }

                else {
                    System.out.println("Sueldo base: "+SueldoBase(cargo));
                    System.out.println("Dieta ("+dias+" viajes): "+GastoViajes(dias));
                    // System.out.println("Sueldo bruto: "+(SueldoBase(cargo)+GastoViajes(dias)));
                    // System.out.println("Retencion IRPF:"+(SueldoBase(cargo)+GastoViajes(dias)-Irpf(estado)));
                    // System.out.println("Sueldo neto: "+(SueldoBase(cargo)+GastoViajes(dias)-(SueldoBase(cargo)+GastoViajes(dias)-Irpf(estado))));
                }
            }
        }
    }
}
