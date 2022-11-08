package productorConsumidor;

public class Productor implements Runnable{
    private Buffer buffer;
    private final String letras="abcdefghijklmnopqrstuvwxyz";

    public Productor(Buffer b){
        this.buffer=b;
    }


    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            char c = letras.charAt((int)(Math.random()*letras.length()));
            buffer.poner(c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(i+"Producor: "+c);
        }
    }
}
