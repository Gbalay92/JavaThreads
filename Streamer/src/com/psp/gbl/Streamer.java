package com.psp.gbl;

public class Streamer implements Runnable {

    private Plataforma plataforma;

    public Streamer(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void run() {
        while (plataforma.getNumeroVideos() < 15) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            plataforma.producir();
        }
    }
}
