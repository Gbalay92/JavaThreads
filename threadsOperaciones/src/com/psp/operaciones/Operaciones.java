package com.psp.operaciones;
public class Operaciones extends Thread{
    private Thread hiloReference;
    int operando1;
    int operando2;
    public void suspenderHilo(Thread hiloReference){
        this.hiloReference=hiloReference;
    }

    public Operaciones(int operando1, int operando2, String nombre) {
        super(nombre);
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    public void suma(){
        int suma = this.operando1 + this.operando2;
        System.out.println("El resultado de la suma es: " + suma);
    }
    public void comparar() {
        if (this.operando1 < this.operando2) {
            System.out.println("El " + this.operando1 + " es menor que el " + this.operando2);
        } else if (this.operando1 > this.operando2) {
            System.out.println("El " + this.operando1 + " es mayor que el " + this.operando2);
        } else {
            System.out.println("Los operandos " + this.operando1 + " y " + this.operando2 + " son iguales");
        }
    }
    public void multiplicador(){
            int multi=this.operando1*this.operando2;
            System.out.println("El resultado de la multiplicacion es: " + multi);
            }
    public void writer() {
        for (int i = 0; i < this.operando1; i++) {
            System.out.println("2 ");
        }
    }
    public void run() {
            switch(this.currentThread().getName()){
                case "suma":
                    suma();
                    break;
                case "comparador":
                        try {
                            this.hiloReference.join();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }comparar();
                        break;
                case "multiplicador":
                    try {
                        this.hiloReference.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }multiplicador();
                    break;
                case "escritor":
                    try {
                        this.hiloReference.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }writer();
                    break;
                default:
                    System.out.println(this.currentThread().getName());
                    System.out.println("el hilo no existe");


            }
        }
    }

