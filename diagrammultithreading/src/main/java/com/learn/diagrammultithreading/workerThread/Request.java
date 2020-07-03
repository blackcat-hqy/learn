package com.learn.diagrammultithreading.workerThread;

import lombok.ToString;

import java.util.concurrent.ThreadLocalRandom;

@ToString
public class Request {
    private final String name;
    private final int number;

    public Request(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void execute(){
        System.out.println(Thread.currentThread().getName() + " executes " + toString());
        try {
            Thread.sleep(getRandomInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int getRandomInt(int bound){
        return ThreadLocalRandom.current().nextInt(bound);
    }
}
