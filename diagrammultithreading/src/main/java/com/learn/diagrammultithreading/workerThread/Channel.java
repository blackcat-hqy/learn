package com.learn.diagrammultithreading.workerThread;

public class Channel {
    private static final int MAX_REQUEST = 100;
    private final Request[] requestQueue;
    private int head = 0;
    private int tail = 0;
    private int count = 0;

    private final WorkerThread[] threadPool;

    public Channel(int threadsNum){
        requestQueue = new Request[MAX_REQUEST];
        threadPool = new WorkerThread[threadsNum];
        for (int i = 0; i < threadsNum; i++) {
            threadPool[i] = new WorkerThread("Worker-"+i,this);
        }
    }

    public void startWorkers(){
        for (int i = 0; i < threadPool.length; i++) {
            threadPool[i].start();
        }
    }

    public synchronized void putRequest(Request request){
        try{
            while(count>=requestQueue.length){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        requestQueue[tail] = request;
        tail = (tail+1)%requestQueue.length;
        count++;
        notifyAll();
    }

    public synchronized Request takeRequest(){
        try{
            while(count<=0){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Request request = requestQueue[head];
        head = (head+1)%requestQueue.length;
        count--;
        notifyAll();
        return request;
    }

}
