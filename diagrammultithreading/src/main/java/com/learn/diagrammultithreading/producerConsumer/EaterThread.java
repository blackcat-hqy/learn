package com.learn.diagrammultithreading.producerConsumer;

import java.util.Random;

public class EaterThread extends Thread {
    private final Random random = new Random(System.currentTimeMillis());
    private final Table table;

    public EaterThread(String name, Table table) {
        super(name);
        this.table = table;
    }

    @Override
    public void run(){
        try{
            while (true){
                String cake = table.take();
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
