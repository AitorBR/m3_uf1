import java.util.Scanner;

public class prueva2 {

    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);

        double x, y;

        System.out.println("Pon un numero: ");
        x = poner.nextFloat();
        y = x;
        while (x > 0) {

            while (y > 0) {

                System.out.print("*");
                y -= 1;
            }
            System.out.println();
            System.out.println("Pon un numero: ");
            x = poner.nextFloat();
            y = x;

        }


    }


}
