import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        int x, y = 0;

        do {
            System.out.println("Di una hora: ");
            x = poner.nextInt();
            if (x %2 == 0){
                y += 1;
            }
        } while (x != 0);
        System.out.println(y);
    }
}
