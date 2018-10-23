import java.util.Scanner;

public class practica1 {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);
        double metros, speed, s, velocidad, multa, x;

        System.out.println("Pon los metros: ");
        metros = poner.nextInt();
        System.out.println("Pon la velocidad en m: ");
        speed = poner.nextInt();
        System.out.println("Pon los segundos: ");
        s = poner.nextInt();
        x = metros / 1000;
        velocidad = (metros / 1000) / ((s / 60) / 60);
        multa = speed * 1.2;


        if (metros <= 0 || speed <= 0 || velocidad <= 0) {
            System.out.println("Error");
        } else if (velocidad < speed) {
            System.out.println("OK");
        } else if (multa > velocidad) {
            System.out.println("Multa");
        } else {
            System.out.println("Puntos");
        }
        System.out.println(x);
    }
}

