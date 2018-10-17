import java.util.Scanner;

public class problemas8 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double a, b, c, y;

        System.out.println("Pon el valor a: ");
        a = poner.nextFloat();
        System.out.println("Pon el valor b: ");
        b = poner.nextFloat();
        System.out.println("Pon el valor c: ");
        c = poner.nextFloat();

        y = (b * b) - (4 * a * c);
        if (y < 0) {
            System.out.println("No tiene solucion");
        } else {
            System.out.println((double) (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
            System.out.println((double) (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
        }

        /*x, z, w*/
        //x = (int) ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
        //z = (-b + Math.sqrt((b * b) - (4 * a * c)));
        //w = Math.sqrt(y);

       /* System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);*/
    }
}