package com.psp.impresor;

public class PuntoVenta {
    public static void main(String[] args) {
        Producto producto = new Producto(20, "jabon");
        Sucursal sucursal=new Sucursal(producto);
        Thread uno=new Thread(sucursal, "Pablo");
        Thread dos=new Thread(sucursal, "Ramon");
        Thread tres=new Thread(sucursal, "Gonzalo");
        Thread cuatro=new Thread(sucursal, "Alberto");

        uno.start();
        dos.start();
        tres.start();
        cuatro.start();
    }
}
