/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Germán
 */
public class Concatenacion {

    public static void main(String[] args) {
        var usuario = "Germán";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); //Se realiza la suma de numeros
        System.out.println(i + j + usuario); //Evaluación de izq a derec, realiza suma
        System.out.println(usuario + i + j); //Contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j)); //Uso de parentesis modifican la prioridad en la evaluación
    }
}
