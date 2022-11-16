package com.psp.gbl;


import java.util.concurrent.CopyOnWriteArrayList;

public class Pila {
    private CopyOnWriteArrayList<Examen> examenes;

    public Pila(CopyOnWriteArrayList<Examen> examenes) {
        this.examenes = examenes;
    }

    public CopyOnWriteArrayList<Examen> getExamenes() {
        return examenes;
    }

    public int corregir() {
        int i = (int) (Math.random() * 2 + 1);
        if (i <= examenes.size()) {
            for (int j = 0; j < i; j++) {
                examenes.remove(0);
            }
            return i;
        }
        return 0;

    }


}

