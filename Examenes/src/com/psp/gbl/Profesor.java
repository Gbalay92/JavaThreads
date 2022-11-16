package com.psp.gbl;

public class Profesor implements Runnable {
    private Pila pila;
    private int contador=0;

    private String nombre;

    public Profesor(String nombre, Pila pila) {
        this.pila = pila;
        this.nombre=nombre;
    }


    @Override
    public synchronized void run() {
        while(pila.getExamenes().size() > 0) {

            contador+= pila.corregir();
            System.out.println(this.nombre +" y lleva corregidos " + contador);
        }
    }
}
