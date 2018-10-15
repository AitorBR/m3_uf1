import java.util.Scanner;

public class problemas9 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double x, y, operador;

        System.out.println("Pon un numero: ");
        x = poner.nextFloat();
        System.out.println("Pon otro numero: ");
        y = poner.nextFloat();
        System.out.println("Pon un operador (+ (1), - (2), * (3), / (4): ");
        operador = poner.nextFloat();

        if (operador == 1) {
            System.out.println(x + y);
        } else if (operador == 2) {
            System.out.println(x - y);
        } else if (operador == 3) {
            System.out.println(x * y);
        } else
            System.out.println(x / y);

    }
}
