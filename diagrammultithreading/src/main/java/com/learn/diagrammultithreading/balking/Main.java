package com.learn.diagrammultithreading.balking;

public class Main {
    public static void main(String[] args) {
        testSaverAndChanger();
    }

    public static void testSaverAndChanger(){
        Data data = new Data("./data.txt","(empty)");
        new ChangerThread("ChangerThread",data).start();
        new SaverThread("SaverThread",data).start();
    }
}
