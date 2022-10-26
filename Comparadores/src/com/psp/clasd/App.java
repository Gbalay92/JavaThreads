package com.psp.clasd;


import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;


public class App {
    static List<Integer> enteros=new CopyOnWriteArrayList<Integer>();
    public static void main(String[] args) {
        System.out.println("Introduzca 5 numeros enteros: ");
        for (int i = 1; i < 6; i++) {
            boolean f=false;
            while(f==false) {
                System.out.print("entero " + i + ": ");
                int entero = leerInt();
                if(entero>0) {
                    enteros.add(entero);
                    f=true;
                }else{
                    System.out.println("numeros negativos no validos, vuelva a introducir un numero entero: ");
                }
            }
        }
        Enteros suma=new Enteros(enteros, "suma");
        Enteros pares=new Enteros(enteros, "pares");
        Enteros comparador=new Enteros(enteros, "comparador");

        suma.start();
        comparador.start();
        pares.start();


    }

    private static int leerInt() {
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
}
