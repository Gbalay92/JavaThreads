
public class Tenedor{
    private boolean disponible= true;
    private Mesa mesa;

    public Tenedor(boolean disponible){
        this.disponible=disponible;

    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public boolean getDisponible() {
        return this.disponible;
    }



}

