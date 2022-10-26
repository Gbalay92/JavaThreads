package com.psp.example;

public class Consumidor implements Runnable{
    Buffer buffer;
    public Consumidor(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while(buffer.getObjectsSize()>0) {
            int consumible = buffer.recoger();
            System.out.println("consumidor" + Thread.currentThread().getName() + ": " + consumible);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
