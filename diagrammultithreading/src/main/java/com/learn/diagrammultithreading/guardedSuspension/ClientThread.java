package com.learn.diagrammultithreading.guardedSuspension;

import java.util.Random;

public class ClientThread extends Thread{
    private final Random random = new Random(System.currentTimeMillis());
    private final RequestQueue requestQueue;
    public ClientThread(String name,RequestQueue requestQueue){
        super(name);
        this.requestQueue = requestQueue;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            Request request = new Request("No."+i);
            System.out.println(Thread.currentThread().getName() + " requests "+request);
            requestQueue.putRequest(request);
            try{
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
