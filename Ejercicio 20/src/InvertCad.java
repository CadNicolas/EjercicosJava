import java.util.Scanner;

public class InvertCad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);

        scanner.close();
    }

    public static String invertirCadena(String cadena) {
        StringBuilder stringBuilder = new StringBuilder(cadena);
        return stringBuilder.reverse().toString();
    }
}
