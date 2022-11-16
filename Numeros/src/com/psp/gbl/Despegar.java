package com.psp.gbl;

public class Despegar implements Runnable{
    private Contenedor cont;

    public Despegar(Contenedor cont) {
        this.cont = cont;
    }

    @Override
    public void run() {
        cont.despegue();
    }
}
