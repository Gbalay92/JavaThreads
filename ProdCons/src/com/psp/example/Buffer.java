package com.psp.example;

import java.util.concurrent.CopyOnWriteArrayList;

public class Buffer {
    private CopyOnWriteArrayList<Integer> objects = new CopyOnWriteArrayList<Integer>();


    public int getObjectsSize(){
        return objects.size();
    }
    public void generar(int obj){
        objects.add(obj);
    }

    public synchronized int recoger(){
        int obj= objects.get(0);
        objects.remove(0);
        return obj;
    }



}
