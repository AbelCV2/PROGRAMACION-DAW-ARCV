package Relacion_Ejercicios.Ejercicio7;

public class Lucha {
    public static void main(String[] args) {
        Heroe heroe1 = new Heroe("Hercules", 250, 50);
        Monstruo monstruo1 = new Monstruo("Cancerbero", 200, 50);

        int turnoH;
        int turnoM;

        turnoH = (int)(Math.random()*(2+1-1)+1);

        if (turnoH==1) {
            
            turnoM=2;

            while(heroe1.getVida()>0 && monstruo1.getVidaM()>0) {
                monstruo1.RecibirDanoM(heroe1.getAtaque());
                monstruo1.ImprimirDanoRecibidoM();

                heroe1.RecibirDanoH(monstruo1.getAtaqueM());
                heroe1.ImprimirDanoRecibidoH();
            }
        }

        else {
            turnoM=1;

            while(heroe1.getVida()>0 || monstruo1.getVidaM()>0) {
                heroe1.RecibirDanoH(50);
                heroe1.ImprimirDanoRecibidoH();

                monstruo1.RecibirDanoM(50);
                monstruo1.ImprimirDanoRecibidoM();

            }
        }

        
    
    }

}
