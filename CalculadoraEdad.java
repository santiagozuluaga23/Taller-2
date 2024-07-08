/*
Crea un programa que solicite la fecha de nacimiento al usuario (año, mes y día). Calcule la edad e imprima su edad y si es mayor de edad o no.

*/

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor ingresa tu año de nacimiento: ");
        int año = scanner.nextInt();
        
        System.out.print("Por favor ingresa tu mes de nacimiento: ");
        int mes = scanner.nextInt();
        
        System.out.print("Por favor ingresa tu día de nacimiento: ");
        int dia = scanner.nextInt();
        
        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
        
        LocalDate fechaActual = LocalDate.now();
        
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int edad = periodo.getYears();

        System.out.println("Tienes " + edad + " años");
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }
    }
}
