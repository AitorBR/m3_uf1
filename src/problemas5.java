import java.util.Scanner;

public class problemas5 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double x;

        System.out.println("Pon un numero: ");
        x = poner.nextFloat();
        System.out.println(x / ((double)(100-5)/100));

        //y = ((double)(100-5)/100);
        //System.out.println(y);

    }
}