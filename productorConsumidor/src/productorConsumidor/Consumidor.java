package productorConsumidor;

public class Consumidor implements Runnable{
    private Buffer buffer;
    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        char valor;
        for (int i = 0; i < 10; i++) {
            valor= buffer.recoger();
            System.out.println(i+"Consumidor: "+valor);
        }

    }
}
