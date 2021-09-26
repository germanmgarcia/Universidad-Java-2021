
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
public class CalculoEstacionDelAño {

    public static void main(String[] args) {
        System.out.println("Proporciona el número del mes:");
        Scanner consola = new Scanner(System.in);
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estación desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }

        System.out.println("estacion = " + estacion);
    }
}
