package com.learn.diagrammultithreading.immutable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrintPersonThread extends Thread {
    private final Person person;

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName()+" prints "+person);
        }
    }
}
