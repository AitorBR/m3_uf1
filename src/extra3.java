import java.util.Scanner;

public class extra3 {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        int numero, evaluar = 5, repeticiones = 3, cont = 0, divisor;

        System.out.println("pon un numero");
        numero = poner.nextInt();


        divisor = evaluar/2;
        System.out.println("1\n2\n3");
        while (repeticiones < numero) {

            while (divisor >= 2) {
                if (cont == 1) {
                    evaluar++;
                    cont = 0;
                    divisor = evaluar/2;
                } else if (evaluar % divisor == 0) {
                    cont++;
                    divisor--;
                } else {
                    divisor--;
                }
            }
            System.out.println(evaluar);
            repeticiones++;
            evaluar++;
            cont = 0;
            divisor = evaluar/2;
        }

    }
}

