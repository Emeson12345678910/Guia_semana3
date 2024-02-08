/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4_emerson_eli_mendoza_lemus;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;

public class Ejercicio4_Emerson_Eli_Mendoza_Lemus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud (L) del rectángulo: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese la anchura (w) del rectángulo: ");
        double ladoB = scanner.nextDouble();

        double perimetro = calcularPerimetro(ladoA, ladoB);
        double area = calcularArea(ladoA, ladoB);

        System.out.println("El perímetro  es: " + perimetro);
        System.out.println("El área del  es: " + area);

        scanner.close();
    }

    private static double calcularPerimetro(double ladoA, double ladoB) {
        return 2 * (ladoA + ladoB);
    }

    private static double calcularArea(double ladoA, double ladoB) {
        return ladoA * ladoB;
    }
}
