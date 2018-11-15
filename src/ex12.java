
public class ex12 {
    public static void main(String[] args) {

        int x = 0, y = 1, z = 1;

        while (y <= 20) {
            if (z % 5 == 0 || z % 7 == 0) {
                x += z;
                y += 1;
                z += 1;
            } else {
                z += 1;
            }
        }
        System.out.println(x);
    }
}













/*import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        int x, y = 1, z = 1;

        System.out.println("Di un numero: ");
        x = poner.nextInt();

        while (y <= 20) {
            if (z % x == 0) {
                System.out.printf("%d, ",  z);
                y += 1;
                z += 1;
            } else {
                z += 1;
            }

        }

    }
}*/
