import java.util.Scanner;

public class problemas4 {

    public static void main(String[] args) {


        Scanner poner = new Scanner(System.in);
        double x;

        System.out.println("Pon un numero: ");
        x = poner.nextFloat();

        if (x % 2 == 0) {

            System.out.println("Tu numero es par");
        } else
            System.out.println("tu numero es impar");

    }


}
