package com.psp.examples;

public class Barril {
    private int cantidad;

    public Barril(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public synchronized void beber(int cantidad) {
        if(this.cantidad<5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.cantidad -= cantidad;
    }
    public synchronized void rellenar(int cantidad){
        this.cantidad+=cantidad;
        notify();
    }
}
