package com.psp.gbl;

import java.util.concurrent.CopyOnWriteArrayList;

public class App {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Examen>examenes = new CopyOnWriteArrayList<Examen>();
        for (int i = 0; i < 50; i++) {
            Examen examen= new Examen();
            examenes.add(examen);
        }
        Pila pila = new Pila(examenes);

        Profesor rico= new Profesor("Rico", pila);
        Profesor yisus= new Profesor("Yisus", pila);
        Profesor brais= new Profesor("Brais", pila);

        new Thread(rico).start();
        new Thread(yisus).start();
        new Thread(brais).start();
    }
}
