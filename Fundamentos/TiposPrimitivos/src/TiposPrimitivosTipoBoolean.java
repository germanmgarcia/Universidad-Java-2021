/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Germán
 */
public class TiposPrimitivosTipoBoolean {

    public static void main(String[] args) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        if (varBoolean == true) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }

        var edad = 10;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres manor de edad");
        }
    }
}
