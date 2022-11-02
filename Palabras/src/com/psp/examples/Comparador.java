package com.psp.examples;

public class Comparador implements Runnable{

    char[] cadena1;
    char[] cadena2;

    public Comparador(char[] cadena1, char[] cadena2) {
        this.cadena1 = cadena1;
        this.cadena2 = cadena2;
    }



    @Override
    public void run() {
        if(this.cadena1.length>this.cadena2.length){
            System.out.print("La palabra más larga es: ");
            for(char i : cadena1){
                System.out.print(i);
            }
        }else if(this.cadena1.length==this.cadena2.length){
            System.out.println("Las palabras introducidas son iguales");
        }else {
            System.out.print("La palabra más larga es: ");
            for (char i : cadena2) {
                System.out.print(i);
            }
        }
        System.out.println(" ");
    }
}
