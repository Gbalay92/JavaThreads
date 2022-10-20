
public class Filosofo implements Runnable{
    private boolean cenado=false;
    private String nombre;
    private Tenedor t1;
    private Tenedor t2;
    public Filosofo(String nombre,Tenedor t1, Tenedor t2) {
        this.t1 = t1;
        this.t2 = t2;
        this.nombre = nombre;
    }

    public synchronized void cenar() {
        while(this.t1.isDisponible() || this.t2.isDisponible()) {
            if(this.t1.isDisponible() && this.t2.isDisponible()){
                this.t1.coger();
                this.t2.coger();
                try {
                    System.out.println("el filosofo "+ this.nombre+" esta cenando");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
        }


    }



    public synchronized void run(){
            cenar();
            t1.dejar();
            t2.dejar();
            this.cenado=true;
        if(this.isCenado()){
            System.out.println("El filosofo "+ this.nombre+ " ya ha cenado");
        }
    }

    private boolean isCenado() {
        return this.cenado;
    }
}
