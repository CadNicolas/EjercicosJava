import java.util.Scanner;
//import java.util.Random;

public class Nombremaymin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase());
        System.out.println("Nombre en minúsculas: " + nombre.toLowerCase());

        scanner.close();
    }
}
