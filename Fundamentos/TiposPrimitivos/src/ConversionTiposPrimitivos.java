
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
public class ConversionTiposPrimitivos {

    public static void main(String[] args) {
        //Convertir tipo String a un tipo int
        var edad = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad = " + (edad + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Proprociona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
    }
}
