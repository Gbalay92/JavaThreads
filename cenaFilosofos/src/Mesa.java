import java.util.concurrent.CopyOnWriteArrayList;

public class Mesa {


    public Mesa() {
    }
    public synchronized void coger(Tenedor tenedor1, Tenedor tenedor2){
        if(!tenedor1.getDisponible() || !tenedor2.getDisponible()){
            try {
                System.out.println(Thread.currentThread().getName() + " esta esperando.. ");
                wait();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        tenedor1.setDisponible(false);
        tenedor2.setDisponible(false);




    }
    public synchronized void devolver(Tenedor tenedor1, Tenedor tenedor2) {
        tenedor1.setDisponible(true);
        tenedor2.setDisponible(true);
        notify();

    }

}
