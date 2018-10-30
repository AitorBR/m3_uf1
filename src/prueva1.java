import java.util.Scanner;

public class prueva1 {

    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);

        double x, y = 0;

        System.out.println("Pon un numero: ");
        x = poner.nextFloat();

        while (x > 0) {
            y += x;
            System.out.println("Pon un numero: ");
            x = poner.nextFloat();
        }

        System.out.println(y);


    }


}
