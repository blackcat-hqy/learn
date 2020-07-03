package com.learn.diagrammultithreading.activeObject;

public class Proxy implements ActiveObject{
    private final Servant servant;
    private final SchedulerThread schedulerThread;

    public Proxy(Servant servant, SchedulerThread schedulerThread) {
        this.servant = servant;
        this.schedulerThread = schedulerThread;
        schedulerThread.start();
    }

    public Result<String> makeString(int count,char fillchar){
        FutureResult<String> future = new FutureResult<>();
        schedulerThread.invoke(new MakeStringRequest(servant,future,count,fillchar));
        return future;
    }
    public void displayString(String string){
        schedulerThread.invoke(new DisplayStringRequest(servant,string));
    }
}
