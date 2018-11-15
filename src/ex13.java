import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        double x, y, z, w = 0;

        System.out.println("Di un numero: ");
        x = poner.nextFloat();
        System.out.println("Di un numero: ");
        y = poner.nextFloat();
        z = x;
        while (z <= y) {
            if (x % 5 == 0) {
                w += z;
                z += 1;
            } else {
                z += 1;
            }
        }
        System.out.println(w);
    }
}