/*
Crear un programa que simule el juego de piedra, papel o tijera
contra el usuario. Permitir al usuario elegir entre piedra, papel o
tijera. Determinar el ganador del juego y mostrar el resultado
*/

import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");
        System.out.println("Por favor elige: piedra, papel o tijera: ");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        int eleccionMaquina = random.nextInt(3);
        String eleccionMaquinaTexto = "";
        
        if (eleccionMaquina == 1) {
            eleccionMaquinaTexto = "piedra";
        } else if (eleccionMaquina == 2) {
            eleccionMaquinaTexto = "papel";
        } else if (eleccionMaquina == 3) {
            eleccionMaquinaTexto = "tijera";
        }

        System.out.println("La máquina eligió: " + eleccionMaquinaTexto);
        
        if (eleccionUsuario.equals(eleccionMaquinaTexto)) {
            System.out.println("¡Es un empate!");
        }
        else if (eleccionUsuario.equals("piedra") && eleccionMaquinaTexto.equals("tijera")) {
            System.out.println("¡Ganaste! Piedra vence a Tijera");
        }
        else if (eleccionUsuario.equals("papel") && eleccionMaquinaTexto.equals("piedra")) {
            System.out.println("¡Ganaste! Papel vence a Piedra");
        }
        else if (eleccionUsuario.equals("tijera") && eleccionMaquinaTexto.equals("papel")) {
            System.out.println("¡Ganaste! Tijera vence a Papel");
        }
        else if (eleccionMaquinaTexto.equals("piedra") && eleccionUsuario.equals("tijera")) {
            System.out.println("Perdiste. Piedra vence a Tijera");
        }
        else if (eleccionMaquinaTexto.equals("papel") && eleccionUsuario.equals("piedra")) {
            System.out.println("Perdiste. Papel vence a Piedra");
        }
        else if (eleccionMaquinaTexto.equals("tijera") && eleccionUsuario.equals("papel")) {
            System.out.println("Perdiste. Tijera vence a Papel");
        }
        else {
            System.out.println("Ingresaste un dato erroneo");
        }
    }
}
