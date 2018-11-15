import java.util.Scanner;

public class exgrupo {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        String palabra, guiones = "", guiones2 = "", letra;

        int intentos = 1, bien = 0, empezar, contletra = 0;
        ;

        do {

            System.out.println("Escribe una palabra");
            palabra = poner.nextLine();

            for (int barra = 0; barra < palabra.length(); barra++) {

                guiones += "_";
            }
            System.out.print(guiones);

            do {

                System.out.println("\nPon una letra");
                letra = poner.nextLine();

                for (int contador = 0; palabra.length() > contador; contador++) {

                    while (palabra.length() > contletra) {
                        if (letra.charAt(contletra) == palabra.charAt(contador)) {
                            System.out.println(letra.charAt(contletra));


                            //guiones = guiones.substring(contador,letra);
                            //guiones2 += palabra.charAt(contador);
                            //System.out.print(palabra.charAt(contador) + " ");
                            //bien++;
                        }
                        contletra++;
                    }

                    //for (int contador2 = 0; contador2 < palabra.length(); contador2++) {


                    //System.out.println(guiones2);
                }
            } while (intentos != 0 || bien == palabra.length());

            System.out.println("Quieres jugar otra vez? (Si = 1, No = 0)");
            empezar = poner.nextInt();
        } while (empezar != 0);
    }
}

