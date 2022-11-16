package com.psp.gbl;

public class Adolescente implements Runnable{
    private Plataforma plataforma;
    private int consumo=0;

    public Adolescente(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void run() {
        while (consumo < 15) {
            int videos=plataforma.consumir();
            if(videos>(15-consumo)){

            }else{
                consumo +=videos;
                System.out.println("el adolescente lleva consumidos " + consumo);
        }
        }
        System.out.println("ya he visto suficiente a este tipo");
    }
}
