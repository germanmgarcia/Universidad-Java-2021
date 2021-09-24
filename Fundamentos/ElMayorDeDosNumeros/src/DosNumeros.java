
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
public class DosNumeros {

    public static void main(String[] args) {
        System.out.println("Proporciona el numero1:");
        Scanner consola = new Scanner(System.in);
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(consola.nextLine());
        int numeroMayor = numero1 > numero2 ? numero1 : numero2;
        System.out.println("El numero mayor es: \n" + numeroMayor);
    }
}
