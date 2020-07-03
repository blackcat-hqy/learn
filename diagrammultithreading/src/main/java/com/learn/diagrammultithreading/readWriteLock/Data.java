package com.learn.diagrammultithreading.readWriteLock;

import java.util.Arrays;

public class Data {
    private final char[] buffer;
    private final ReadWriteLock lock = new ReadWriteLock();
    public Data(int size){
        buffer = new char[size];
        for (int i = 0; i < size; i++) {
            buffer[i] = '*';
        }
    }

    public char[] read() throws InterruptedException {
        lock.readLock();
        try {
            return doRead();
        } finally {
            lock.readUnLock();
        }
    }

    public void write(char c) throws InterruptedException {
        lock.writeLock();
        try{
            doWrite(c);
        }finally {
            lock.writeUnlock();
        }
    }
    private char[] doRead(){
        System.out.println(Thread.currentThread().getName() + " doRead");
        char[] newBuffer = Arrays.copyOf(buffer,buffer.length);
        slowly();
        return newBuffer;
    }

    private void doWrite(char c){
        System.out.println(Thread.currentThread().getName() + " doWrite "+c);
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = c;
            slowly();
        }
    }

    private void slowly(){
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
