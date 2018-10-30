import java.util.Scanner;

public class prova4 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);

        int x;

        do {

            System.out.println("Pon un numero menor que 100: ");
            x = poner.nextInt();

        } while (x > 100);
    }
}