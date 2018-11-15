import java.util.Scanner;

public class extra {

    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        double x, y = 0, precio, cantidad, preciotot = 0;

        do {
            System.out.println("Quieres introducir un cliente? (Si = 1, No = 2)");
            x = poner.nextFloat();
            if (x == 1) {
                do {

                    System.out.println("cuanto cuesta el producto?");
                    precio = poner.nextFloat();

                    System.out.println("Cuantos productos hay?");
                    cantidad = poner.nextFloat();

                    preciotot += (precio * cantidad);

                    System.out.println("Hay mas productos? (Si = 1, No = 0)");
                    y = poner.nextFloat();

                } while (y == 1);

                if (preciotot < 300) {
                    System.out.println(preciotot);
                } else if (preciotot < 800) {
                    System.out.println(preciotot * 0.85);
                } else {
                    System.out.println(preciotot * 0.8);
                }
            }
            preciotot = 0;
            System.out.println("Quieres hacer otra consulta? (Si = 1, No = 0)");
            x = poner.nextFloat();

        } while (x == 1);

    }
}









