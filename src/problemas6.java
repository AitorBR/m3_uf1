import java.util.Scanner;

public class problemas6 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double diaa, mesa, anya, dian, mesn, anyn, x;

        System.out.println("Pon el dia , mes, año actual: ");
        diaa = poner.nextFloat();
        mesa = poner.nextFloat();
        anya = poner.nextFloat();
        System.out.println("Pon el dia , mes, año de tu nacimiento: ");
        dian = poner.nextFloat();
        mesn = poner.nextFloat();
        anyn = poner.nextFloat();

        x = anya - anyn;

        if (mesa > mesn) {

            if (diaa < dian) {
                x = x - 1;
            }
        } else if (mesa < mesn){
            x = x - 1;
        }
        System.out.println(x);
    }
}