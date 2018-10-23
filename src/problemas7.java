import java.util.Scanner;

public class problemas7 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double x;

        System.out.println("Pon un numero: ");
        x = poner.nextFloat();

        if ((x % 2 == 0) && (x % 3 == 0)) {
            System.out.println("Se puede dividir entre 2 y 3");

        } else if (x % 2 == 0) {
            System.out.println("Se puede dividir entre 2");
        } else if (x% 3 == 0) {
            System.out.println("Se puede dividir entre 3");
        } else
            System.out.println("No se puede dividir entre ninguno de los 2");
    }
}
