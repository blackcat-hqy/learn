package com.learn.diagrammultithreading.future;

public class FutureData implements Data {
    private RealData realData = null;
    private boolean ready = false;

    public synchronized void setRealData(RealData realData){
        if(ready){
            return;
        }
        this.realData = realData;
        ready = true;
        notifyAll();
    }

    @Override
    public synchronized String getContent() {
        try{
            while(!ready){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return realData.getContent();
    }
}
