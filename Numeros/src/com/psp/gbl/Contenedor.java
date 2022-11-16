package com.psp.gbl;

import java.util.ArrayList;

public class Contenedor {
    private ArrayList<Integer> numeros= new ArrayList<Integer>();
    public Contenedor(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }
    public ArrayList<Integer> getNumeros() {
        return numeros;
    }
    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }
    public void sumar(){
        int j=0;
        for(int i: numeros){
            j+=i;
            }
        if(j%2==0){
            System.out.println("La suma es: " + j + " y es numero par");
        }else{
            System.out.println("La suma es: " + j + " y es numero impar");
        }
    }
    public void imprimir(){
        int j=0;
        for(int i: numeros){if(i>j){
            j=i;}
        }
        for (int i = 0; i < j; i++) {System.out.print(j + " ");}
        System.out.println(" ");
    }
    public void despegue() {
        int j = 0;
        for (int i : numeros) {
            j += i;
        }
       while(j>0) {
           System.out.println(j);
           j--;
        }
        System.out.println("DESPEGUE");
    }
}
