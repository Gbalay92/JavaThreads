
public class App {
    private static final Tenedor t1=new Tenedor();
    private static final Tenedor t2=new Tenedor();
    private static final Tenedor t3=new Tenedor();
    private static final Tenedor t4=new Tenedor();
    private static final Tenedor t5=new Tenedor();
    public static void main(String[] args) {


        Filosofo filosofo1 =new Filosofo("Gonzalo", t1,t2);
        Filosofo filosofo2 =new Filosofo("Alberto", t2,t3);
        Filosofo filosofo3 =new Filosofo("Ramon", t3,t4);
        Filosofo filosofo4 =new Filosofo("Pablo", t4,t5);
        Filosofo filosofo5 =new Filosofo("David", t5,t1);

        new Thread(filosofo1).start();
        new Thread(filosofo2).start();
        new Thread(filosofo3).start();
        new Thread(filosofo4).start();
        new Thread(filosofo5).start();

    }
}
