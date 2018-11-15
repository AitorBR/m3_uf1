import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        String x;
        char y;
        int pos, z = 0, cont = 0;

        System.out.println("Escribe una palabra");
        x = poner.nextLine();
        System.out.println("Di la letra que quieres contar");
        y = poner.next().charAt(0);

        x = x.toLowerCase();
        pos = x.length();

        while (pos > z) {

            if (x.charAt(z) == y) {
                cont ++;
            }
            z ++;
        }
        System.out.println(cont);
    }
}