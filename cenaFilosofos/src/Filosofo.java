
public class Filosofo implements Runnable{
    private boolean cenar=false;
    private String nombre;
    private static Tenedor t1;
    private static Tenedor t2;
    public Filosofo(String nombre,Tenedor t1, Tenedor t2) {
        this.t1 = t1;
        this.t2 = t2;
        this.nombre = nombre;
    }

    public boolean isCenar() {
        return cenar;
    }

    public void setCenar(boolean cenar) {
        this.cenar = cenar;
    }

    public void run(){
        while(t1.isDisponible() || t2.isDisponible()) {
            t1.coger();
            t2.coger();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.setCenar(true);
        t1.dejar();
        t2.dejar();
        if(this.isCenar()){
            System.out.println("El filosofo "+ this.nombre+ " ya ha cenado");
        }
    }
}
