import java.util.Scanner;

public class intentos {
    public static void main(String[] args) {
        Scanner poner = new Scanner(System.in);
        String palabra, guiones = "", letra = "";

        int intentos = 1, bien = 0, empezar, contletra = 0, fin = 0, numletra, contador = 0, contsuma = 0;
        char suma;
        boolean goes = false;

        do {

            System.out.println("Escribe una palabra");
            palabra = poner.nextLine();

            for (int barra = 0; barra < palabra.length(); barra++) {

                guiones += "_";
            }
            System.out.print(guiones);

            do {

                System.out.println("\nPon una letra");
                suma = poner.next().charAt(0);

                while (letra.length() < contsuma) {
                    if (suma == palabra.charAt(contsuma)) {
                        goes = true;
                    }
                    contsuma++;
                }

                if (goes == true) {
                    letra += suma;
                    // letra += poner.nextLine();

                    numletra = letra.length();

                    while (palabra.length() > contador) {
                        bien = 0;

                        while (numletra > contletra) {
                            if (letra.charAt(contletra) == palabra.charAt(contador)) {

                                System.out.print(letra.charAt(contletra));
                                bien++;

                            } else {
                                fin++;
                            }
                            contletra++;
                        }
                        if (fin >= contletra) {
                            System.out.print("_");
                        }

                        fin = 0;
                        contador++;
                        contletra = 0;
                    }

                    contador = 0;



                /*for (int contaletra = 0; numletra > contletra; contaletra++) {

                    System.out.println(letra.length());
                    for (int contador = 0; palabra.length() > contador; contador++) {

                        if (letra.charAt(contletra) == palabra.charAt(contador)) {

                            System.out.print(letra.charAt(contletra));

                        } else {
                            fin++;
                        }
                        if (fin == palabra.length()) {
                            System.out.println("_");
                        }
                    }
                    fin = 0;
                }*/
                /*for (int contador = 0; contador < palabra.length(); contador++) {

                    while (palabra.length() > contletra) {
                        if (letra.charAt(contletra) == palabra.charAt(contador)) {
                            System.out.println(letra.charAt(contletra));


                            //guiones = guiones.substring(contador,letra);
                            //guiones2 += palabra.charAt(contador);
                            //System.out.print(palabra.charAt(contador) + " ");
                            //bien++;
                        }
                        contletra++;
                    }*/

                    //for (int contador2 = 0; contador2 < palabra.length(); contador2++) {


                    //System.out.println(guiones2);


                }
                while (intentos != 0 || bien == palabra.length()) ;

                System.out.println("Quieres jugar otra vez? (Si = 1, No = 0)");
                empezar = poner.nextInt();
            } while (empezar != 0);
        }
    }
}