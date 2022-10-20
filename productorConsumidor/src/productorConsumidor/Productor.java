package productorConsumidor;

public class Productor implements Runnable{
    private Buffer buffer;
    private final String letras="abcdefghijklmnopqrstuvwxyz";

    public Productor(Buffer b){
        this.buffer=b;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            char c = letras.charAt((int)(Math.random()*letras.length()));
            buffer.poner(c);
            System.out.println(i+"Producor: "+c);
        }
    }
}
