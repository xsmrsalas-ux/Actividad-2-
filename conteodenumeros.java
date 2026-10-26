
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = sc.next();

        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = Character.toLowerCase(palabra.charAt(i));

            if (letra == 'a') {
                contador++;
            }
        }

        System.out.println("La letra a aparece " + contador + " veces.");

        sc.close();
    }
}

