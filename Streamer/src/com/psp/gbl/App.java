package com.psp.gbl;

public class App {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();
        Adolescente adolescente=new Adolescente(plataforma);
        Streamer streamer = new Streamer(plataforma);


        new Thread(streamer).start();
        new Thread(adolescente).start();


    }
}
