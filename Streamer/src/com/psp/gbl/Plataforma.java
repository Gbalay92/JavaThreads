package com.psp.gbl;

public class Plataforma {
        private int numeroVideos;
    public Plataforma(){
    }
    public int getNumeroVideos() {
        return numeroVideos;
    }
    public synchronized void producir(){
        int random=(int)(Math.random()*4+1);
        numeroVideos+=random;
        System.out.println("Se han producido " + random + " videos");
        notify();
    }

    public synchronized int consumir(){
        System.out.println("El adolescente esta estudiando..");
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int i=numeroVideos;
        numeroVideos=0;
        return i;
    }
}
