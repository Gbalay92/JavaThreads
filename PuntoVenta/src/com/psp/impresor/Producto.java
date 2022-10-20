package com.psp.impresor;

public class Producto extends Thread {

    private int existencia;
    private String nombreFrod;

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void setNombreFrod(String nombreFrod) {
        this.nombreFrod = nombreFrod;
    }

    public int getExistencia() {
        return existencia;
    }

    public String getNombreFrod() {
        return nombreFrod;
    }

    public Producto(int existencia, String nombreFrod) {
        this.existencia = existencia;
        this.nombreFrod = nombreFrod;
    }
    public void venderProducto(int cantidadVendida){
        this.existencia-=cantidadVendida;
    }
}
