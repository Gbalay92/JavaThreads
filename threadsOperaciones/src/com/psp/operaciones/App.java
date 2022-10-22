package com.psp.operaciones;

public class App {
    public static void main(String[] args) {
        int operando1=2;
        int operando2=2;
        Operaciones hilo1=new Operaciones(2, 2, "suma");
        Operaciones hilo2=new Operaciones(2, 2, "comparador");
        Operaciones hilo3=new Operaciones(2, 2,"escritor");
        Operaciones hilo4=new Operaciones(2, 2, "multiplicador");

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        hilo2.suspenderHilo(hilo1);
        hilo3.suspenderHilo(hilo2);
        hilo4.suspenderHilo(hilo3);

    }
}
