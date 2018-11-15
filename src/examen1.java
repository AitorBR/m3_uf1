import java.util.Scanner;

public class examen1 {

    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);


        // EJERCICIO 1

        int x, x1, w, w2, mulx = 2, mulw = 2, fin;

        System.out.println("Pon un numero: ");
        x = poner.nextInt();

        System.out.println("Pon otro num: ");
        w = poner.nextInt();

        x1 = x;
        w2 = w;

        do {
            if (x1 > w2) {
                w2 = w * mulw;
                mulw++;
            } else {
                x1 = x * mulx;
                mulx++;
            }

        } while (x1 != w2);
        fin = x1;
        System.out.println(fin);


        // EJERCICIO 2

        int num1 = 1, num2 = 1, sig = 0;

        System.out.println("1");

        while (sig <= 1800) {

            sig = num1 + num2;
            num1 = num2;
            System.out.println(num2);
            num2 = sig;


        }


        // EJERCICIO 3

        int y, z, q;

        System.out.println("pon un numero: ");
        z = poner.nextInt();

        y = z /2;
        q = y;

        while (y >= 2) {
            y--;
            if (z % y == 0) {
                System.out.println(y);
                q += y;
            }
        }
        System.out.println(q);
    }
}