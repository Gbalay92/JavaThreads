
public class Filosofo extends Thread{
    private boolean cenado=false;
    private Mesa mesa;
    private String nombre;
    private Tenedor tenedor1;
    private Tenedor tenedor2;

    public Filosofo(String nombre, Mesa mesa, Tenedor tenedor1,Tenedor tenedor2, boolean cenado) {
        super(nombre);
        this.nombre = nombre;
        this.cenado = cenado;
        this.mesa = mesa;
        this.tenedor1=tenedor1;
        this.tenedor2=tenedor2;

    }

    public void cenar(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.cenado=true;
        if(this.cenado){
            System.out.println(this.nombre + " ha cenado");
        }

    }



    @Override
    public void run() {
        mesa.coger(this.tenedor1, this.tenedor2);
        cenar();
        mesa.devolver(this.tenedor1,this.tenedor2);

    }


}
