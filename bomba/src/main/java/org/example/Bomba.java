package org.example;

public class Bomba implements Runnable {
    private static int identificadorBomba;
    private int tiempo;

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo=tiempo;
    }

    public static int getIdentificadorBomba() {
        return identificadorBomba;
    }

    public static void setIdentificadorBomba(int identificadorBomba) {
        Bomba.identificadorBomba = identificadorBomba;
    }

    public Bomba(int tiempo){
        super();
        this.tiempo = tiempo;
        identificadorBomba++;
    }

    public void cuentaAtras(){
       while(this.getTiempo()>=0){
            System.out.println(this.getTiempo());
            this.setTiempo(this.getTiempo()-1);

            if(this.getTiempo()==0){
                System.out.println("BOOM");
            }
        }
    }
    public void run(){
        this.cuentaAtras();
    }


    public static void main(String[] args) {
        Bomba bomba1 = new Bomba(10);
        Bomba bomba2 = new Bomba(10);
        Bomba bomba3 = new Bomba(10);
        Bomba bomba4 = new Bomba(10);
        Bomba bomba5 = new Bomba(10);

        new Thread(bomba1).start();
        new Thread(bomba2).start();
        new Thread(bomba3).start();
        new Thread(bomba4).start();
        new Thread(bomba5).start();
    }
}