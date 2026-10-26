
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            double num1, num2, resultado;
            String continuar;
            do {
                System.out.println("\n--- CALCULADORA BASICA ---");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4. Division");
                
                System.out.print("Selecciona una operacion: ");
                opcion = sc.nextInt();
                
                System.out.print("Ingresa el primer numero: ");
                num1 = sc.nextDouble();
                
                System.out.print("Ingresa el segundo numero: ");
                num2 = sc.nextDouble();
                
                switch (opcion) {
                    case 1 -> {
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                    }
                    
                    case 2 -> {
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                    }
                    
                    case 3 -> {
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                    }
                    
                    case 4 -> {
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Error: no se puede dividir entre cero.");
                        }
                    }
                    
                    default -> System.out.println("Opcion no valida.");
                }
                
                System.out.print("¿Deseas realizar otra operacion? (si/no): ");
                continuar = sc.next();
                
            } while (continuar.equalsIgnoreCase("si"));
            System.out.println("Calculadora finalizada. ¡Hasta pronto!");
        }
    }
}
