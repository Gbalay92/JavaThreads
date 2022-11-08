package productorConsumidor;

public class App {
    public static void main(String[] args) {
        Buffer b=new Buffer();
        Productor prod=new Productor(b);
        Consumidor cons=new Consumidor(b);

        new Thread(prod).start();
        for (int i = 0; i < 5; i++) {
            new Thread(cons).start();
        }
    }

}
