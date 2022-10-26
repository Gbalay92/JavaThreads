package com.psp.example;

public class App {
    public static void main(String[] args) {
        int fuerza1=(int)(Math.random()*4+1);
        int fuerza2=(int)(Math.random()*4+1);
        int vida1=(int)(Math.random()*50+50);
        int vida2=(int)(Math.random()*50+50);

        Boxeador gonzalo = new Boxeador("Gonzalo", fuerza1, vida1);
        Boxeador ramon = new Boxeador("Ramon", fuerza2, vida2);

        gonzalo.declararOponente(ramon);
        ramon.declararOponente(gonzalo);
        new Thread(gonzalo).start();
        new Thread(ramon).start();
    }
}
