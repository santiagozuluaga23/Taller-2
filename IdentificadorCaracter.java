/*
Crea un programa que pida al usuario un carácter e imprima en consola si es una consonante, vocal o carácter especial.
*/

import java.util.Scanner;

public class IdentificadorCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor ingresa un carácter:");
        char caracter = scanner.next().charAt(0);
        
        caracter = Character.toLowerCase(caracter);

        if ((caracter >= 'a' && caracter <= 'z')) {
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                System.out.println("El carácter ingresado es una vocal.");
            } else {
                System.out.println("El carácter ingresado es una consonante.");
            }
        } else if (caracter >= '0' && caracter <= '9') {
            System.out.println("El carácter ingresado es un número.");
        } else {
            System.out.println("El carácter ingresado es un carácter especial.");
        }
    }
}
