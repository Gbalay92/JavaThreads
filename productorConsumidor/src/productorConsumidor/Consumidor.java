package productorConsumidor;

import java.util.concurrent.Semaphore;

public class Consumidor implements Runnable{
    Semaphore semaforo = new Semaphore(2);
    private Buffer buffer;
    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            semaforo.acquire();

        char valor;

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            valor= buffer.recoger();
            System.out.println(Thread.currentThread().getName()+" Consumidor: "+valor);
        }
            semaforo.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
