package com.learn.diagrammultithreading.guardedSuspension;

import java.util.Random;

public class ServerThread extends Thread{
    private final Random random = new Random(System.currentTimeMillis());
    private final RequestQueue requestQueue;

    public ServerThread(String name, RequestQueue requestQueue) {
        super(name);
        this.requestQueue = requestQueue;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            Request request = requestQueue.getRequest();
            System.out.println(Thread.currentThread().getName() + " handles "+ request);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
