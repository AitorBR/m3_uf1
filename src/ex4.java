import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        int x, y, z;

        System.out.println("Di una hora: ");
        x = poner.nextInt();

        System.out.println("Di un min: ");
        y = poner.nextInt();

        System.out.println("Di un s: ");
        z = poner.nextInt();

        z += 1;

        if (z >= 60) {
            z -= 60;
            y += 1;
            if (y >= 60){
                y -= 60;
                x += 1;
            }
        }

        System.out.printf("%d %d %d", x, y, z);

    }

}
