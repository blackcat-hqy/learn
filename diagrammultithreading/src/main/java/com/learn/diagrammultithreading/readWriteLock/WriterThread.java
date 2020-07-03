package com.learn.diagrammultithreading.readWriteLock;

import java.util.Random;

public class WriterThread extends Thread{
    private final Random random = new Random(System.currentTimeMillis());
    private final Data data;
    private final String filler;
    private int index = 0;

    public WriterThread(Data data,String filler){
        this.data = data;
        this.filler = filler;
    }

    @Override
    public void run(){
        try {
            while(true){
                char c = nextChar();
                data.write(c);
                Thread.sleep(random.nextInt(3000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private char nextChar(){
        char c = filler.charAt(index);
        index = (index+1)%filler.length();
        return c;
    }
}
