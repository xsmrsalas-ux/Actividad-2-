
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String palabra;
            int contador = 0;

            System.out.print("Ingresa una palabra: ");
            palabra = entrada.nextLine();

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
                    contador++;
                }
            }

            System.out.println("La letra 'a' aparece " + contador + " veces.");
        }
    }
}
