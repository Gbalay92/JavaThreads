import java.util.concurrent.CopyOnWriteArrayList;

public class App {
    private static CopyOnWriteArrayList<Tenedor> tenedores = new CopyOnWriteArrayList();
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            tenedores.add(new Tenedor(true));

        }
        Mesa mesa = new Mesa();

        Filosofo gonzalo = new Filosofo("Gonzalo", mesa ,tenedores.get(0),tenedores.get(1));
        Filosofo ramon = new Filosofo("Ramon", mesa ,tenedores.get(1),tenedores.get(2));
        Filosofo alberto = new Filosofo("Alberto", mesa ,tenedores.get(2),tenedores.get(3));
        Filosofo pablo = new Filosofo("Pablo",  mesa ,tenedores.get(3),tenedores.get(4));
        Filosofo david = new Filosofo("David", mesa ,tenedores.get(4),tenedores.get(0));

        gonzalo.start();
        ramon.start();
        alberto.start();
        pablo.start();
        david.start();



    }
}
