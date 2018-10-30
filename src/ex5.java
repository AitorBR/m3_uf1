import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        int x, y = 0;

        System.out.println("Di un nomero de la tabla entre el 2 y 10: ");
        x = poner.nextInt();

        if (x > 2 && x < 11) {
            while (y < 11) {
                System.out.println(x * y);
                y += 1;
            }
        } else {
            System.out.println("He dicho un numero entre el 2 y 10 esque no sabes leer -_-");
        }
    }
}
