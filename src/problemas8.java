import java.util.Scanner;

public class problemas8 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double a, b, c, x, y, z;

        System.out.println("Pon el valor a: ");
        a = poner.nextFloat();
        System.out.println("Pon el valor a: ");
        b = poner.nextFloat();
        System.out.println("Pon el valor a: ");
        c = poner.nextFloat();

        x = (int) ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
        y = (b * b) - (4 * a * c);
        z = (-b + Math.sqrt((b * b) - (4 * a * c)));


        System.out.println((double) (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}