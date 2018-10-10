import java.util.Scanner;

/**
 * @author Aitor
 */
public class calchipo {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);

        double x, y, z;

        System.out.print("Escribe cateto1: ");
        x = poner.nextFloat();
        System.out.print("Escribe cateto2: ");
        y = poner.nextFloat();

        //z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));

        System.out.printf("%.2f", (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))));

        // y = y * y;
        // x = x * x;
        // y *= y;

    }
}