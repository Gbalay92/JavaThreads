package productorConsumidor;

public class App {
    public static void main(String[] args) {
        Buffer b=new Buffer();
        Productor prod=new Productor(b);
        Consumidor cos=new Consumidor(b);

        new Thread(prod).start();
        new Thread(cos).start();
    }

}
