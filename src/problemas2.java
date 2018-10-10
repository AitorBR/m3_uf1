import java.util.Scanner;

public class problemas2 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double x, y;

        System.out.println("Pon dos numeros: ");
        x = poner.nextFloat();
        y = poner.nextFloat();

        if (x < y) {
            System.out.printf("%.0f es inferior a %.0f", x, y);
        } else if (x > y) {
            System.out.printf("%.0f es superior a %.0f", x, y);
        } else {
            System.out.println("Tus numeros son iguales");
        }


    }
}