
import java.util.Scanner;

public class contadordigitos {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa un numero entero: ");
            int numero = sc.nextInt();

            numero = Math.abs(numero);
            int contador = 0;

            if (numero == 0) {
                contador = 1;
            } else {
                while (numero > 0) {
                    numero = numero / 10;
                    contador++;
                }
            }

            System.out.println("El numero tiene " + contador + " digitos.");
        }
    }
}
