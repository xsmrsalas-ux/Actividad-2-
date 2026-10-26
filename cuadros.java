
import java.util.Scanner;

public class cuadros {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero;
            int i = 1;

            System.out.print("Ingresa un numero entero positivo: ");
            numero = sc.nextInt();

            if (numero > 0) {
                System.out.println("Cuadrados de los numeros del 1 al " + numero + ":");

                do {
                    System.out.println(i + " al cuadrado = " + (i * i));
                    i++;
                } while (i <= numero);

            } else {
                System.out.println("Error: debes ingresar un numero positivo.");
            }
        }
    }
}
