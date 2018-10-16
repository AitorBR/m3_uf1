import java.util.Scanner;

public class problemaextra {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double x, y, z, bi;

        System.out.println("Pon un numero: ");
        x = poner.nextFloat();


        y = x / 100;
        z = y / 4;
        x -= z;
        bi = x % 4;
        if (bi == 0) {
            System.out.println("El año es visiesto");
        } else
            System.out.println("El año no es visiesto");
        System.out.println(x/4);
    }
}