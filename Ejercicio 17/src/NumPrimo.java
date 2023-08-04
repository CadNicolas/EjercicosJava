import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int fin = scanner.nextInt();

        System.out.println("Números primos en el rango [" + inicio + ", " + fin + "]:");
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
    
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}







 