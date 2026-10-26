
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String entrada;
            
            System.out.println("Ingresa una letra (presiona espacio para terminar):");
            
            while (true) {
                entrada = sc.nextLine();
                
                if (entrada.equals(" ")) {
                    System.out.println("Programa terminado.");
                    break;
                }
                
                if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
                    char letra = Character.toLowerCase(entrada.charAt(0));
                    
                    if (letra == 'a' || letra == 'e' || letra == 'i'
                            || letra == 'o' || letra == 'u') {
                        System.out.println("Es una vocal.");
                    } else {
                        System.out.println("Es una consonante.");
                    }
                } else {
                    System.out.println("Ingresa solamente una letra.");
                }
                
                System.out.println("Ingresa otra letra (espacio para terminar):");
            }
        }
    }
}
