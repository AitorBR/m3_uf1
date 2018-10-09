

import java.util.Scanner;

/**
 * @author Aitor
 */
public class calccirc {

    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        double x;
        // double pi=Math.PI, longitud;
        double pi;
        double resultado;
        pi = Math.PI;

        System.out.print("Escribe el radio: ");
        x = poner.nextDouble();
        resultado = 2 * pi * x;
        System.out.printf("El resultado es %.2f\n", resultado);

    }
}
