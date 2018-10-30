/*
import java.util.Scanner;

public class prova3 {

    public static void main(String[] args) {
        //Scanner poner = new Scanner(System.in);

        double x = 10, y;

        //System.out.println("Pon un numero: ");
        //x = poner.nextInt();

        while (x <= 100) {
            y = (((x + 32) / 5) * 9);
            System.out.printf("%.2f ----- %.2f \n", x, y);

            x += 10;
        }

    }
}*/

public class prova3 {

    public static void main(String[] args) {

        double x = 10, y;


        while (x <= 100) {
            y = (((x - 32) / 9) * 5);
            System.out.printf("%.2f ----- %.2f \n", x, y);

            x += 10;
        }

    }
}









