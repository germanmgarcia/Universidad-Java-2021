
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
public class Rectangulo {

    public static void main(String[] args) {
        System.out.println("Proporciona el alto:");
        Scanner consola = new Scanner(System.in);
        int alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(consola.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
