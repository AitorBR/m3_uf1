import java.util.Scanner;

public class problemas6 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double diaa, mesa, anya, dian, mesn, anyn, x, y;

        System.out.println("Pon el dia actual: ");
        diaa = poner.nextFloat();
        System.out.println("Pon el mes actual: ");
        mesa = poner.nextFloat();
        System.out.println("Pon el año actual: ");
        anya = poner.nextFloat();
        System.out.println("Pon el dia de tu nacimiento: ");
        dian = poner.nextFloat();
        System.out.println("Pon el mes de tu nacimiento: ");
        mesn = poner.nextFloat();
        System.out.println("Pon el año de tu nacimiento: ");
        anyn = poner.nextFloat();

        x = anya - anyn;

        if (mesa <= mesn) {
            if (diaa < dian) {
                x -= 1;
            }
        }
        System.out.println(x);
    }
}