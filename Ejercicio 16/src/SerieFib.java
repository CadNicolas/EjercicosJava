import java.util.Scanner;

public class SerieFib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número máximo para la serie de Fibonacci: ");
        int maxNumero = scanner.nextInt();

        System.out.println("Serie de Fibonacci hasta " + maxNumero + ":");
        int a = 0, b = 1;
        while (a <= maxNumero) {
            System.out.print(a + " ");
            int suma = a + b;
            a = b;
            b = suma;
        }

        scanner.close();
    }
}
