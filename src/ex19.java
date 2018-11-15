import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        String x;

        int pos, z = 0, conta = 0, conte = 0, conti = 0, conto = 0, contu = 0;

        System.out.println("Escribe una palabra");
        x = poner.nextLine();

        x = x.toLowerCase();
        pos = x.length();

        while (pos > z) {

            switch (x.charAt(z)) {
                case 'a':
                    conta++;
                    break;
                case 'e':
                    conte++;
                    break;
                case 'i':
                    conti++;
                    break;
                case 'o':
                    conto++;
                    break;
                case 'u':
                    contu++;
                    break;
                default:
                    break;
            }
            /*if (x.charAt(z) == 'a') {
                cont ++;
            }
            if (x.charAt(z) == 'e') {
                cont ++;
            }
            if (x.charAt(z) == 'i') {
                cont ++;
            }
            if (x.charAt(z) == 'o') {
                cont ++;
            }
            if (x.charAt(z) == 'u') {
                cont ++;
            }*/
            z++;
        }
        System.out.println("a " + conta);
        System.out.println("e " + conte);
        System.out.println("i " + conti);
        System.out.println("o " + conto);
        System.out.println("u " + contu);

    }
}
