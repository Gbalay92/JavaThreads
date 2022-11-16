package com.psp.gbl;

public class Sumar implements Runnable{
    private Contenedor cont;
    public Sumar(Contenedor cont) {
        this.cont = cont;
    }


    @Override
    public void run() {
        cont.sumar();
    }
}
