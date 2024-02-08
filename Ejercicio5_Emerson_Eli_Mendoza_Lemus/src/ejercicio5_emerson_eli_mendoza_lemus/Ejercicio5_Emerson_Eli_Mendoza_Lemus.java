/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5_emerson_eli_mendoza_lemus;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;

public class Ejercicio5_Emerson_Eli_Mendoza_Lemus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double area = calcularAreaCirculo(radio);
        double volumen = calcularVolumenEsfera(radio);

        System.out.println("Area de la circunferencia es: " + area);
        System.out.println("Volumen de la esfera es: " + volumen);

        scanner.close();
    }

    private static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    private static double calcularVolumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}
