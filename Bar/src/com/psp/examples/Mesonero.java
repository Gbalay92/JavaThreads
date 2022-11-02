package com.psp.examples;

public class Mesonero implements Runnable{
    private Barril barril;

    public Mesonero(Barril barril) {
        this.barril = barril;
    }

    @Override
    public void run() {
        float i=0;
        while (i<24.0){
            if(barril.getCantidad()<=0){
                System.out.println("el mesonero ha muerto");
                break;
            }
            if(barril.getCantidad()<=5){
                barril.rellenar(10);
                System.out.println("el mesonero ha rellenado el barril y ahora le quedan " + barril.getCantidad());
            }
            i+=0.1;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }if(barril.getCantidad()>0){
            System.out.println("El mesonero ha sobrevivido");
        }

    }
}
