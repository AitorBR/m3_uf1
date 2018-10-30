import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        double horas, euros, eue, fin1;

        System.out.println("Di una hora: ");
        horas = poner.nextFloat();

        System.out.println("Di euro hora: ");
        euros = poner.nextFloat();

        if (horas > 40) {
            fin1 = 40 * euros;
            eue = (horas - 40) * (euros * 1.5);
            System.out.println(fin1 + eue);
        } else {
            System.out.println(horas * euros);
        }
    }
}