
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        long factorial = 1;

        System.out.print("Ingresa un numero entero no negativo: ");
        numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un numero negativo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        entrada.close();
    }
}
