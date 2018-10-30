import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int x = 1, y = 2;

        while (y <= 100) {
            x += y;
            y += 1;
        }
        System.out.println(x);
    }
}
