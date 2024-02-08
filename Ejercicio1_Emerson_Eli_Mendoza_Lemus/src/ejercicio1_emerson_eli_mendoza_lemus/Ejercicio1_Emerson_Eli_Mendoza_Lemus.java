/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_emerson_eli_mendoza_lemus;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;

public class Ejercicio1_Emerson_Eli_Mendoza_Lemus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra,"
                + " si escribe mas palabras sin espacio porfavor : ");
        String letra = scanner.next();
        
        System.out.print("Ingrese el numero de veces "
                + "que quieres que se repita esa palabra : ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(letra);
        }

        
        scanner.close();
    }
}
