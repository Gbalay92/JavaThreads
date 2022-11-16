package productorConsumidor;

import java.util.concurrent.Semaphore;

public class Consumidor implements Runnable{
    private static Object bloqueo=new Object();
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

            System.out.println(i + Thread.currentThread().getName()+" Consumidor: "+ buffer.recoger());
        }
            semaforo.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
