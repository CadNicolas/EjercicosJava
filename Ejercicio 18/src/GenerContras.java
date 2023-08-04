//import java.util.Scanner;
import java.util.Random;

public class GenerContras {
    public static void main(String[] args) {
        String contraseña = generarContraseña(8);
        System.out.println("Contraseña generada: " + contraseña);
    }

    public static String generarContraseña(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contraseña = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            contraseña.append(caracteres.charAt(indice));
        }

        return contraseña.toString();
    }
}
