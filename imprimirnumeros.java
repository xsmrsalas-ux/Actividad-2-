
public class Main {
    public static void main(String[] args) {

        System.out.println("Numeros divisibles entre 3 y 5 del 1 al 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
