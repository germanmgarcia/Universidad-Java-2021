/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Germán
 */
public class SentenciaDeControlIfElse {

    public static void main(String[] args) {
        var condicion = true;

        if (condicion == true) {
            System.out.println("Condición verdadera");
        } else {
            System.out.println("Condición falso");
        }

        var numero = 5;
        var numeroTexto = "Número desconocido";

        if (numero == 1) {
            numeroTexto = "Número uno";
        } else if (numero == 2) {
            numeroTexto = "Número dos";
        } else if (numero == 3) {
            numeroTexto = "Número tres";
        } else if (numero == 4) {
            numeroTexto = "Número cuatro";
        } else {
            numeroTexto = "Número no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
