package com.psp.examples;

import java.util.Scanner;

public class App {
    private static String palabra1;
    private static String palabra2;
    public static void main(String[] args) {
        pedirPalabras();
        char[] cadena1 = palabra1.toCharArray();
        char[] cadena2 = palabra2.toCharArray();

        new Thread(new Comparador(cadena1, cadena2)).start();
        new Thread(new Comprobador(palabra1, palabra2)).start();
        new Thread(new Concatenador(cadena1, cadena2)).start();

    }

    private static void pedirPalabras() {
        System.out.println("Introduzca palabra 1: ");
        palabra1 = new Scanner(System.in).next();
        System.out.println("Introduzca palabra 2: ");
        palabra2 = new Scanner(System.in).next();

    }
}
