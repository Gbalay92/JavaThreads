package com.psp.gbl;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static ArrayList<Integer> numeros=new ArrayList<Integer>();
    public static void main(String[] args) {
        int cantidad = 0;
        while (cantidad<=0 || cantidad>5){cantidad=pedirCantidad();}
        pedirNumeros(cantidad);

        Contenedor cont= new Contenedor(numeros);
        Sumar sum= new Sumar(cont);
        Impresor imp=new Impresor(cont);
        Despegar despegar=new Despegar(cont);

        Thread uno = new Thread(sum);
        Thread dos = new Thread(imp);
        Thread tres = new Thread(despegar);
        try {
            uno.start();
            uno.join();
            dos.start();
            dos.join();
            tres.start();
            tres.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    private static int pedirCantidad() {
        System.out.print("Elija cuantos numeros quiere meter insertar(entre 1 y 5): ");
        return leerEntero();
    }
    private static int leerEntero() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static void pedirNumeros(int cantidad) {
        int i=0;
        int n = 0;
        while(i<cantidad){
               System.out.print("introduzca numero " + i +": ");
               n=leerEntero();
               if(n>=0 && n<=9){
                    numeros.add(n);
                    i++;}

        }

        }



}
