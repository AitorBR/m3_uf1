import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        double x, y, z;

        System.out.println("Di un numero: ");
        x = poner.nextFloat();

        if (x == 2) {
            System.out.println("28");
        } else if (x == 8) {
            System.out.println("31");
        } else if (x % 2 == 0 && x < 8) {
            System.out.println("30");
        } else if (x % 2 == 0){
            System.out.println("31");
        } else {
            System.out.println("30");
        }
    }
}
