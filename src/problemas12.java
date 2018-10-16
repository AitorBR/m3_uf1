import java.util.Scanner;

public class problemas12 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        int dia, hora, min, x, rdia, rhora, rmin;

        System.out.println("Pon un numero: ");
        x = poner.nextInt();


        dia = x / 86400;
        rdia = x % 86400;
        hora = rdia / 3600;
        rhora = rdia % 3600;
        min = rhora / 60;
        rmin = rhora % 60;

        System.out.printf("Los dias son %d las horas son %d los min son %d los segundos son %d", dia, hora, min, rmin);
    }

}