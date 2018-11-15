import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        String x;
        int pos, z = 0, cont = 0;

        System.out.println("hola");
        x = poner.nextLine();

        pos = x.length();

        while (pos > z) {

            if (x.charAt(z) == 'a') {
                cont += 1;
            }
            z += 1;
        }
        System.out.println(cont);
    }
}