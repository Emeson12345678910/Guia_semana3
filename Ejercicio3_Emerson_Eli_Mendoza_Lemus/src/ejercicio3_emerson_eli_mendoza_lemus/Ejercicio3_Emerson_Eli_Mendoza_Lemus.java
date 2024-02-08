/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_emerson_eli_mendoza_lemus;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;

public class Ejercicio3_Emerson_Eli_Mendoza_Lemus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        double mayor = obtenerMayor(num1, num2, num3);

        System.out.println("El mayor de los tres números es: " + mayor);

        scanner.close();
    }

    private static double obtenerMayor(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }
}
