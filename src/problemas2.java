import java.util.Scanner;

public class problemas2 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double x, y;

        System.out.println("Pon un numero: ");
        x = poner.nextFloat();
        y = poner.nextFloat();

        if (x < y) {
            System.out.printf("%f s inferior a %f", x, y);
        } else if (x > y) {
            System.out.println("Es superior a 0");
        } else {
            System.out.println("Tu numero es 0");
        }




}
