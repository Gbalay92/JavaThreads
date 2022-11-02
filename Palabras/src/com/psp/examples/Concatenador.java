package com.psp.examples;

public class Concatenador implements Runnable {
    char[] cadena1;
    char[] cadena2;

    public Concatenador(char[] cadena1, char[] cadena2) {
        this.cadena1 = cadena1;
        this.cadena2 = cadena2;
    }

    @Override
    public void run() {
        System.out.print("La palabra resultante de sumar las 3 primeras letras de cada palabra es: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(String.valueOf(this.cadena1[i]));
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(String.valueOf(this.cadena2[i]));
        }
        System.out.println(" ");
    }
}
