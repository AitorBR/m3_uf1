import java.util.Scanner;

public class problemas1 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double x;

        System.out.println("Pon un numero: ");
        x = poner.nextFloat();

        if (x < 0) {
            System.out.println("Es inferior a 0");
        } else if (x > 0) {
            System.out.println("Es superior a 0");
        } else {
            System.out.println("Tu numero es 0");
        }


    }
}