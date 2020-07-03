package com.learn.diagrammultithreading.workerThread;

import java.util.concurrent.ThreadLocalRandom;

public class ClientThread extends Thread{
    private final Channel channel;

    public ClientThread(String name,Channel channel) {
        super(name);
        this.channel = channel;
    }

    @Override
    public void run(){
        try{
            for (int i = 0; true; i++) {
                Request request = new Request(getName(),i);
                channel.putRequest(request);
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
