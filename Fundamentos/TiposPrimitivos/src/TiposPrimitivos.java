/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Germán
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        /*
            Tipos primitivos enteros: byte, short,int, long
         */

        byte numeroByte = (byte) 129;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo bye: " + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor mínimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = (int) 2147836488L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor mínimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        long numeroLog = 9223372036854775807L;
        System.out.println("numeroLog = " + numeroLog);
        System.out.println("Valor mínimo log: " + Long.MIN_VALUE);
        System.out.println("Valor maximo log: " + Long.MAX_VALUE);
    }
}
