package com.psp.clasd;


import java.util.List;

public class Enteros extends Thread {
    private List<Integer> enteros;


    public Enteros(List enteros, String nombre) {
        super(nombre);
        this.enteros = enteros;
    }

    public void suma() {
        int suma = 0;
        for (int entero : enteros) {
            suma += entero;
        }
        System.out.print("la suma de los enteros es: " + suma);
        if (suma % 5 == 0) {
            System.out.println(" y es divisible entre 5");
        } else {
            System.out.println(" y no es divisible entre 5");
        }
    }

    public void pares() {
        for (int entero : enteros) {
            if (entero % 2 == 0) {
                System.out.println("el numero " + entero + " es par");
            } else {
                System.out.println("el numero " + entero + " es impar");
            }

        }
    }

    public void mayorMenor() {
        int numeroMayor = enteros.get(0);
        int numeroMenor = enteros.get(0);
        for (int i = 1; i < enteros.size(); i++) {
            int numero = enteros.get(i);
            if (numero > numeroMayor) {
                numeroMayor = numero;
            }
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }
        System.out.println("El numero mayor es: "+numeroMayor+" y el numero menor es: "+ numeroMenor);
    }

    public void run() {
        //System.out.println(this.currentThread().getName());
        switch (this.currentThread().getName()) {
            case "suma":
                suma();
                break;
            case "comparador":
                mayorMenor();
                break;
            case "pares":
                pares();
                break;
        }
    }
}
