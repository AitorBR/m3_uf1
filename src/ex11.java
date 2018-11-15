import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        int x = 1, y = 2, z;

        System.out.println("Di un numero: ");
        z = poner.nextInt();

        while (y <= z) {
            x *= y;
            y += 1;
        }
        System.out.println(x);
    }

}

