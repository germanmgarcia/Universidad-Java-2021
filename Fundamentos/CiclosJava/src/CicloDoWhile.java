/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Germán
 */
public class CicloDoWhile {

    public static void main(String[] args) {
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 0);
    }
}
