import java.util.Scanner;

public class problemas3 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double x;

        System.out.println("Pon un numero: ");
        x = poner.nextFloat();

        if (x < 0) {
            System.out.println("Es negativo");
        } else if (x > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Tu numero es 0");
        }


    }
}