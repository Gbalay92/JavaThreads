package com.psp.examples;

public class App {
    public static void main(String[] args) {
        Barril barril = new Barril(16);
        Mesonero mesonero = new Mesonero(barril);
        Cliente ramon = new Cliente(barril, "Ramon");
        Cliente gonzalo = new Cliente(barril, "Gonzalo");
        Cliente pablo = new Cliente(barril, "Pablo");
        Cliente alberto = new Cliente(barril, "Alberto");
        Cliente david = new Cliente(barril, "David");


        new Thread(mesonero).start();
        new Thread(ramon).start();
        new Thread(gonzalo).start();
        new Thread(pablo).start();
        new Thread(alberto).start();
        new Thread(david).start();
    }
}
