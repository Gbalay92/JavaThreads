package productorConsumidor;

public class Buffer {
    private char contenido;
    private boolean disponible = false;

    public synchronized char recoger()  {
        while(disponible==false) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("error en la espera del hilo");
            }
        }
        disponible=false;
        notify();
        return contenido;

    }
    public synchronized void poner(char c){
       while(disponible){
           try {
               wait();
           } catch (InterruptedException e) {
               System.err.println("error en la espera del hilo");
           }
       }contenido=c;
       disponible=true;
       notify();
    }
}
