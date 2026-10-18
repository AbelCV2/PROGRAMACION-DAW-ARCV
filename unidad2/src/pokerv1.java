public class pokerv1 {
    public static void main(String[] args) {
        int cartas, carta1, carta2;

        int bot1, bot2, bot3;

        int cartabot1a, cartabot1b, cartabot2a, cartabot2b, cartabot3a, cartabot3b;

        carta1= (int) Math.random()*((13-1+1)+1);
        carta2= (int) Math.random()*((13-1+1)+1);
        cartabot1a=(int) Math.random()*((13-1+1)+1);
        cartabot1b=(int) Math.random()*((13-1+1)+1);
        cartabot2a=(int) Math.random()*((13-1+1)+1);
        cartabot2b=(int) Math.random()*((13-1+1)+1);
        cartabot3a=(int) Math.random()*((13-1+1)+1);
        cartabot3b=(int) Math.random()*((13-1+1)+1);

        System.out.println("Tus cartas son: "+carta1+" y "+carta2);
        System.out.println("Las cartas del Bot 1: * *");
        System.out.println("Las cartas del Bot 2: * *");
        System.out.println("Las cartas del Bot 3: * *");

        // if (cartabot1a>carta1) {
        //     System.out.println("El Bot 1 Apuesta:"+ (int)Math.random()*(100-50+1)+50);
        // }

        // else if (cartabot1b>carta2) {
        //     System.out.println("El Bot 1 Apuesta:"+ (int)Math.random()*(100-50+1)+50);
        // }

        // else if (cartabot2a>carta2) {
        //     System.out.println("El Bot 2 Apuestta:"+ (int)Math.random()*(100-50+1)+50);
        // }

        do {
            System.out.println("El Bot 1 Apuesta:"+(int)Math.random()*(100-50+1)+50);
            System.out.println("El Bot 2 Apuesta:"+(int)Math.random()*(100-50+1)+50);
            System.out.println("El Bot 3 Apuesta:"+(int)Math.random()*(100-50+1)+50);
        }while(cartabot1a>carta1 || cartabot1a>carta2 || cartabot2a>carta1 || cartabot2a>carta2 || cartabot3a>carta1);
    }
    
}
