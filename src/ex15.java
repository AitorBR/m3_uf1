import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        String x;

        System.out.println("pon tu nombre");
        x = poner.nextLine();

        System.out.printf("Hola %s", x);
    }
}
