package com.learn.diagrammultithreading.activeObject;

public class ActiveObjectFactory {
    public static ActiveObject createActiveObject(){
        Servant servant = new Servant();
        ActivationQueue queue = new ActivationQueue();
        SchedulerThread schedulerThread = new SchedulerThread(queue);
        Proxy proxy = new Proxy(servant,schedulerThread);
        return proxy;
    }
}
