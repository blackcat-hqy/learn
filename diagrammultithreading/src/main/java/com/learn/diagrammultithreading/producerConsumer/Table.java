package com.learn.diagrammultithreading.producerConsumer;

public class Table {
    private final String[] buffer;
    private int tail = 0;
    private int head = 0;
    private int count = 0;

    public Table(int capacity){
        buffer = new String[capacity];
    }

    public synchronized void put(String cake) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" puts "+cake);
        while(count>=buffer.length){
            wait();
        }
        buffer[tail] = cake;
        tail = (tail+1)%buffer.length;
        count++;
        notifyAll();
    }

    public synchronized String take() throws InterruptedException {
        while(count<=0){
            wait();
        }
        String cake = buffer[head];
        head = (head+1)%buffer.length;
        count--;
        notifyAll();
        System.out.println(Thread.currentThread().getName()+" takes "+cake);
        return cake;
    }
}
