
import java.util.Scanner;

class mediadenumeros {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double numero;
            double suma = 0;
            int contador = 0;

            System.out.println("Ingresa numeros positivos.");
            System.out.println("Ingresa un numero negativo para terminar.");

            while (true) {
                System.out.print("Ingresa un numero: ");
                numero = sc.nextDouble();

                if (numero < 0) {
                    break;
                }

                if (numero > 0) {
                    suma = suma + numero;
                    contador++;
                }
            }

            if (contador > 0) {
                double media = suma / contador;
                System.out.println("La media de los numeros positivos es: " + media);
            } else {
                System.out.println("No se ingresaron numeros positivos.");
            }
        }
    }
}
