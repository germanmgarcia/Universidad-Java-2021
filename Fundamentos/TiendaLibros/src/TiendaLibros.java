
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
public class TiendaLibros {
    
    public static void main(String[] args) {
        System.out.println("Proporciona el nombre:");
        Scanner consola = new Scanner(System.in);
        String nombre = consola.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envio = Boolean.parseBoolean(consola.nextLine());
        //Imprimir
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + "$" + precio + ".00");
        System.out.println("Envio Gratuito: " + envio);
    }
}
