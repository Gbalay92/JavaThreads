package com.psp.example;

public class Boxeador implements Runnable{
    private String nombre;
    private Boxeador oponente;
    private int fuerza;
    private int vida;

    public Boxeador(String nombre, int fuerza, int vida) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.vida = vida;
    }
    public void declararOponente(Boxeador boxeador){
        this.oponente=boxeador;

    }
    public void pegar (){
        this.oponente.vida-=this.fuerza;

    }
    @Override
    public void run() {
        while(this.vida>0 && this.oponente.vida>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            pegar();
            System.out.println(this.nombre+this.oponente.vida);


        }if(this.vida<=0){
            System.out.println(this.nombre + " ha perdido");
        }else{
            System.out.println(this.nombre + " ha ganado");
        }
    }
}
