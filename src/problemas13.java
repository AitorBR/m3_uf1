import java.util.Scanner;

public class problemas13 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double x, y, z;

        System.out.println("Pon un numero: ");
        x = poner.nextInt();
        System.out.println("Pon un numero: ");
        y = poner.nextInt();
        System.out.println("Pon un numero: ");
        z = poner.nextInt();

        if (x > y) {
            if (x > z) {
                if (y > z) {
                    System.out.printf("%.0f %.0f %.0f", x, y, z);
                } else
                    System.out.printf("%.0f %.0f %.0f", x, z, y);
            } else
                System.out.printf("%.0f %.0f %.0f", z, x, y);
        } else if (y > z) {
            if (x > z) {
                System.out.printf("%.0f %.0f %.0f", y, x, z);
            } else
                System.out.printf("%.0f %.0f %.0f", y, z, x);
        } else

            System.out.printf("%.0f %.0f %.0f", z, y, x);
    }

}

