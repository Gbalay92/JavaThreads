package com.psp.examples;

import static java.lang.Thread.currentThread;

public class Cliente implements Runnable{
    private Barril barril;
    private String nombre;


    public Cliente(Barril barril, String nombre) {
        this.barril = barril;
        this.nombre = nombre;
    }


    @Override
    public void run() {
        float i=0;
        int copas = (int) (Math.random() * 3 + 1);
        while (i < 24.0 && barril.getCantidad()>0) {
            barril.beber(copas);
            System.out.println("El cliente " + this.nombre + " consume " + copas +" copas");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i+=1;
        }
    }
}
