import java.util.concurrent.CopyOnWriteArrayList;

public class Mesa {
    CopyOnWriteArrayList<Tenedor> tenedores;


    public Mesa(CopyOnWriteArrayList<Tenedor> tenedores) {
        this.tenedores = tenedores;
    }
    public synchronized void coger(Tenedor tenedor1, Tenedor tenedor2){
        if(!tenedor1.getDisponible() || !tenedor2.getDisponible()){
            try {
                wait();
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
