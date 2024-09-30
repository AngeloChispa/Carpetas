package com.mycompany.app;

import java.util.Scanner;
import org.bouncycastle.util.encoders.Base64;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una opción: \n1. Codificar \n2. Decodificar");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea después de nextInt()

        if (opcion == 1) {
            System.out.print("Introduce el texto a codificar: ");
            String toEncode = scanner.nextLine();
            byte[] data = Base64.encode(toEncode.getBytes());
            String encoded = new String(data);
            System.out.println("Resultado de la codificación: " + encoded);
        } else if (opcion == 2) {
            System.out.print("Introduce el texto a decodificar: ");
            String toDecode = scanner.nextLine();
            byte[] data = Base64.decode(toDecode.getBytes());
            String decoded = new String(data);
            System.out.println("Resultado de la decodificación: " + decoded);
        } else {
            System.out.println("Opción no válida. Finalizando programa...");
        }

        scanner.close();
    }
}
