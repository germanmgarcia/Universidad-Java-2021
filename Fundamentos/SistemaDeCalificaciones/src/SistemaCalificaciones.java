
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Germán
 */
public class SistemaCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        int numero = Integer.parseInt(scanner.nextLine());
        //Si esta entre 9 y 10 imprimir: A
        if (numero >= 9 && numero <= 10) {
            System.out.println("A");
        } //Si esta entre  8 y menor a 9 imprimir: B
        else if (numero >= 8 && numero < 9) {
            System.out.println("B");
        } //Si esta entre 7 y menor a 8 imprimir: C
        else if (numero >= 7 && numero < 8) {
            System.out.println("C");
        } //Si esta entre 6 y menor a 7 imprimir: D
        else if (numero >= 6 && numero < 7) {
            System.out.println("D");
        } //Si esta entre 0 y menor a 6 imprimir: F
        else if (numero >= 0 && numero < 6) {
            System.out.println("F");
        } //Si no esta en el rago, imprimir: Valor desconocido
        else {
            System.out.println("Valor desconocido");
        }
    }
}
