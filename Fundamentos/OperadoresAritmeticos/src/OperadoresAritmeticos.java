/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Germán
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicación = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("resultado divición = " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);

        if (b % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

    }
}
