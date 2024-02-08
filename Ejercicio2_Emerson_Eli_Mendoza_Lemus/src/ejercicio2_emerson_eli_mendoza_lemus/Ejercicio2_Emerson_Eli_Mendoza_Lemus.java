/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_emerson_eli_mendoza_lemus;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;

public class Ejercicio2_Emerson_Eli_Mendoza_Lemus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double val1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo valor: ");
        double val2 = scanner.nextDouble();

        // formulas
        double suma = val1 + val2;
        double resta = val1 - val2;
        double multiplicacion = val1 * val2;

        double division = (val2 != 0) ? val1 / val2 : Double.POSITIVE_INFINITY;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        
        if (Double.isFinite(division)) {
            System.out.println("División: " + division);
        } else {
            System.out.println("División por cero invalida.");
        }
        scanner.close();
    }
}
