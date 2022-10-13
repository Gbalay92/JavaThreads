package org.example;

import java.util.concurrent.Exchanger;

class TareaA implements Runnable{
    private final Exchanger<String> exchanger;
    public TareaA(Exchanger<String> exchanger) {
        super();
        this.exchanger = exchanger;
    }

    public void run(){
        String mensaje= null;
        try {
            mensaje = exchanger.exchange("mensaje enviado por tarea A");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("mensaje recibido por tarea a: " + mensaje);

    }
}
    class TareaB implements Runnable {
    private final Exchanger<String> exchanger;
    public TareaB(Exchanger<String> exchanger) {
        super();
        this.exchanger = exchanger;
    }

    public void run() {
        String mensaje= null;
        try {
            mensaje = exchanger.exchange("mensaje enviado por tarea B");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("mensaje recibido por tarea b: " + mensaje);

    }
}
    class TareaC implements Runnable {
    private final Exchanger<String> exchanger;
    public TareaC(Exchanger<String> exchanger) {
        super();
        this.exchanger = exchanger;
    }

    public void run()  {
        String mensaje= null;
        try {
            mensaje = exchanger.exchange("mensaje enviado por tarea C");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("mensaje recibido por tarea C: " + mensaje);

    }
}
public class Intercambiador {
    public static void main(String[] args) throws Exception {
        Exchanger<String>exchanger=new Exchanger<String>();
        new Thread(new TareaA(exchanger)).start();
        new Thread(new TareaB(exchanger)).start();
        new Thread(new TareaC(exchanger)).start();
        new Thread(new TareaB(exchanger)).start();
    }
}