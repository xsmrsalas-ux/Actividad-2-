
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero;
            int i = 1;
            
            System.out.print("Ingresa un numero entero positivo: ");
            numero = sc.nextInt();
            
            if (numero > 0) {
                System.out.println("Numeros impares desde 1 hasta " + numero + ":");
                
                do {
                    System.out.println(i);
                    i = i + 2;
                } while (i <= numero);
                
            } else {
                System.out.println("Error: debes ingresar un numero positivo.");
            }
        }
    }
}
