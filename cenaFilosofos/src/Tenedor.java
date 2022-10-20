public class Tenedor {
    private static boolean disponible=true;

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void coger() {

            this.setDisponible(false);



    }
    public void dejar() {
            this.setDisponible(true);

        }

}
