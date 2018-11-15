import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        double x, y = 1, suf = 0, suff = 0, insuf = 0, exc = 0, not = 0, be = 0;

        while (y <= 5) {
            System.out.println("Di un numero: ");
            x = poner.nextFloat();
            y += 1;
            if (x >= 5) {
                suf += 1;
                if (x >= 9) {
                    exc += 1;
                } else if (x >= 7) {
                    not += 1;
                } else if (x >= 6) {
                    be += 1;
                } else {
                    suff += 1;
                }
            } else {
                insuf += 1;
            }
        }
        System.out.printf("apro %.0f sus %.0f suff %.0f be %.0f not %.0f exc %.0f", suf, insuf, suff, be, not, exc);
    }
}