package com.learn.diagrammultithreading.readWriteLock;

public class ReadWriteLock {
    private int readingReaders = 0;  // 正在读入的线程
    private int waitingWriters = 0; // 等待写入的线程
    private int writingWriters = 0; // 正在写的线程数
    private boolean preferWriter = true; // 写优先

    public synchronized void readLock() throws InterruptedException {
        while(writingWriters > 0 || (preferWriter&&waitingWriters>0)){
            System.out.println(Thread.currentThread().getName() +" Read Wait");
            wait();
        }
        readingReaders++;
    }

    public synchronized void readUnLock(){
        readingReaders--;
        preferWriter = true;
        notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException {
        waitingWriters++;
        try{
            while (readingReaders>0||writingWriters>0){
                System.out.println(Thread.currentThread().getName() +" Write Wait");
                wait();
            }
        }finally {
            waitingWriters--;
        }
        writingWriters++;
    }

    public synchronized void writeUnlock(){
        writingWriters--;
        preferWriter = false;
        notifyAll();
    }
}
