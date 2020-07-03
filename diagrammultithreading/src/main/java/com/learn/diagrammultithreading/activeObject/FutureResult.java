package com.learn.diagrammultithreading.activeObject;

public class FutureResult<T> implements Result<T> {
    private Result<T> result;
    private boolean ready = false;

    public synchronized void setResult(Result<T> result){
        if(ready){
            return;
        }
        this.result = result;
        ready = true;
        notifyAll();
    }
    @Override
    public synchronized T getResultValue() {
        try{
            while(!ready){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result.getResultValue();
    }
}
