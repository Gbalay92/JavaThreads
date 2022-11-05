import java.util.concurrent.CopyOnWriteArrayList;

public class App {
    private static CopyOnWriteArrayList<Tenedor> tenedores = new CopyOnWriteArrayList();
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            tenedores.add(new Tenedor(true));

        }
        Mesa mesa = new Mesa(tenedores);

        Filosofo gonzalo = new Filosofo("Gonzalo", mesa, mesa.tenedores.get(0),mesa.tenedores.get(1),false);
        Filosofo ramon = new Filosofo("Ramon", mesa,mesa.tenedores.get(1),mesa.tenedores.get(2), false);
        Filosofo alberto = new Filosofo("Alberto", mesa,mesa.tenedores.get(2),mesa.tenedores.get(3),false);
        Filosofo pablo = new Filosofo("Pablo",  mesa,mesa.tenedores.get(3), mesa.tenedores.get(4),false);
        Filosofo david = new Filosofo("David", mesa,mesa.tenedores.get(4),mesa.tenedores.get(0),false);

        gonzalo.start();
        ramon.start();
        alberto.start();
        pablo.start();
        david.start();



    }
}
