import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        double x, y = 1, z = 0, suf = 0, insuf = 0, ap = 0, sp = 0, w = 0, q = 0;

        while (y <= 5) {
            System.out.println("Di un numero: ");
            x = poner.nextFloat();
            z += x;
            y += 1;
            if (x >= 5) {
                suf += 1;
                ap += x;
                w += 1;
            } else {
                insuf += 1;
                sp += x;
                q += 1;
            }
        }
        ap /= w;
        sp /= q;
        System.out.printf("apro %.0f sus %.0f medsus %.0f medap %.0f", suf, insuf, sp, ap);
    }
}


