/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Germán
 */
public class OperadorTernario {
    
    public static void main(String[] args) {
        var resultado = (1 > 2) ? "verdad" : "falso";
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        resultado = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado = " + resultado);
    }
}
