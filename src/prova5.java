import java.util.Scanner;

public class prova5 {

    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        int x, y = 0, z;

        System.out.println("Di un numero de la tabla: ");
        x = poner.nextInt();

        while (y < 11) {
            z = x * y;
            System.out.printf("%d por %d es igual a %d \n", x, y, z);
            y += 1;

        }

        do {
            z = x * y;
            System.out.printf("%d por %d es igual a %d \n", x, y, z);
            y += 1;

        } while (y < 11);

        for (y = 0; y < 11; y += 1) {
            z = x * y;
            System.out.printf("%d por %d es igual a %d \n", x, y, z);

        }

    }
    }

