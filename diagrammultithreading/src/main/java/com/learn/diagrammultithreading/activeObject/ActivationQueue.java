package com.learn.diagrammultithreading.activeObject;

public class ActivationQueue {
    private static int MAX_METHOD_REQUEST = 100;
    private final MethodRequest[] methodRequestQueue = new MethodRequest[MAX_METHOD_REQUEST];
    private int count = 0;
    private int head = 0;
    private int tail = 0;

    public synchronized void putRequest(MethodRequest methodRequest){
        try{
            while(count>=methodRequestQueue.length){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        methodRequestQueue[tail] = methodRequest;
        tail = (tail+1)%methodRequestQueue.length;
        count++;
        notifyAll();
    }

    public synchronized MethodRequest takeRequest(){
        try{
            while(count<=0){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MethodRequest request = methodRequestQueue[head];
        head = (head+1)%methodRequestQueue.length;
        count--;
        notifyAll();
        return request;
    }
}
