package com.psp.example;

public class App {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Productor prod=new Productor(buffer);
        Consumidor cons=new Consumidor(buffer);

        new Thread(prod).start();
        new Thread(cons, "1").start();
        new Thread(cons, "2").start();
    }
}
