import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        int x;

        System.out.println("Di un numero: ");
        x = poner.nextInt();

        if (x < 9001) {
            System.out.println(x *= 1.2);
        } else if (x < 15001) {
            System.out.println(x *= 1.1);
        } else if (x < 20001) {
            System.out.println(x *= 1.05);
        } else {
            System.out.println(x);
        }
    }
}
