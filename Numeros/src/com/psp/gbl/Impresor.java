package com.psp.gbl;

public class Impresor implements Runnable{
    private Contenedor cont;

    public Impresor(Contenedor cont) {
        this.cont = cont;
    }

    @Override
    public void run() {
        cont.imprimir();
    }
}
