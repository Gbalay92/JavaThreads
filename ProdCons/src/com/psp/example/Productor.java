package com.psp.example;

public class Productor implements Runnable{
    Buffer buffer;

    public Productor(Buffer b){
        this.buffer = b;
    }
    public void run(){
        for (int i = 1; i < 21; i++) {
            int obj=(int)(Math.random()*100);
            buffer.generar(obj);
            System.out.println(i+"Productor: "+obj);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}
