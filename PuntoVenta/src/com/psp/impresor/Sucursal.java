package com.psp.impresor;

public class Sucursal implements Runnable{
    Producto prod;
    public Sucursal(Producto prod){
        super();
        this.prod = prod;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            venderProducto(2);
            if(prod.getExistencia()<0){
                System.out.println("Existen inconsistencias en la venta");
            }
        }
    }

    public synchronized void venderProducto(int cantidadVendida){
        if(prod.getExistencia()>=cantidadVendida){
            System.out.println("La existencia del producto "+ prod.getNombreFrod()+" es: "+ prod.getExistencia());
            System.out.println("El cajero que realiza la venta es: " + Thread.currentThread().getName());
            prod.venderProducto(cantidadVendida);
            System.out.println("Venta realizada. Nueva existencia total: " + prod.getExistencia());
        }
    }
}
