/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Germán
 */
public class TiposPrimitivosFlotantes {

    public static void main(String[] args) {
        //Tipos primitivos de tipo flotante: float y double

        float numeroFloat = (float) 3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor mínimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor mínimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);

    }
}
