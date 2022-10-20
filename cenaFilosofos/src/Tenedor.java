public class Tenedor {
    private static boolean disponible=true;

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public synchronized void coger() {
            if(this.disponible==false){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            this.disponible = false;

    }
    public synchronized void dejar() {

            this.setDisponible(true);
            notifyAll();

        }

}
