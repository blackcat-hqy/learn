package com.learn.diagrammultithreading.producerConsumer;

import java.util.Random;

public class MakerThread extends Thread {
    private final Random random = new Random(System.currentTimeMillis());
    private final Table table;
    private static int id = 0;

    public MakerThread(String name, Table table) {
        super(name);
        this.table = table;
    }

    @Override
    public void run(){
        try{
            while(true){
                Thread.sleep(random.nextInt(1000));
                String cake = "[ Cake No." + nextId() + " by " +getName()+" ]";
                table.put(cake);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static synchronized int nextId(){
        return id++;
    }
}
