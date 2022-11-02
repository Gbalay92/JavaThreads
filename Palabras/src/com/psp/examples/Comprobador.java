package com.psp.examples;

public class Comprobador implements Runnable {
    private String palabra1;
    private String palabra2;

    public Comprobador(String palabra1, String palabra2) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
    }

    @Override
    public void run() {
       int o = 0;
       if(this.palabra1.charAt(0)!='a' && this.palabra1.charAt(0)!='e' && this.palabra1.charAt(0)!='i' && this.palabra1.charAt(0)!='o' && this.palabra1.charAt(0)!='u' ){
           o++;
           System.out.println(this.palabra1 + " empieza por consonante");
       }if(this.palabra2.charAt(0)!='a' && this.palabra2.charAt(0)!='e' && this.palabra2.charAt(0)!='i' && this.palabra2.charAt(0)!='o' && this.palabra2.charAt(0)!='u' ){
            o++;
            System.out.println(this.palabra2 + " empieza por consonante");
        }
        System.out.println(o + " empiezan por consonante");
    }
}
