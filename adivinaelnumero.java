
import java.util.Scanner;
import java.util.Random;

class adivinaelnumero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random aleatorio = new Random();
            
            int numeroSecreto = aleatorio.nextInt(100) + 1;
            int intento;
            
            System.out.println("¡Adivina el numero!");
            System.out.println("El numero esta entre 1 y 100.");
            
            do {
                System.out.print("Ingresa tu intento: ");
                intento = sc.nextInt();
                
                if (intento < numeroSecreto) {
                    System.out.println("Demasiado bajo. Intenta de nuevo.");
                } else if (intento > numeroSecreto) {
                    System.out.println("Demasiado alto. Intenta de nuevo.");
                } else {
                    System.out.println("¡Felicidades! Adivinaste el numero.");
                }
                
            } while (intento != numeroSecreto);
        }
    }
}
