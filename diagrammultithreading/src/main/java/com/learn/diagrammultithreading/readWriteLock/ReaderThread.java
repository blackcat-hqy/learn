package com.learn.diagrammultithreading.readWriteLock;

import java.util.Random;

public class ReaderThread extends Thread {
    private final Random random = new Random();
    private final Data data;
    public ReaderThread(Data data){
        this.data = data;
    }

    @Override
    public void run(){
        try{
            while (true){
                char[] readVal = data.read();
                System.out.println(Thread.currentThread().getName()+" reads "+String.valueOf(readVal));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
