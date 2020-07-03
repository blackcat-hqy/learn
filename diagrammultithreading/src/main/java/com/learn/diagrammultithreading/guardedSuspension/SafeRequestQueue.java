package com.learn.diagrammultithreading.guardedSuspension;

import java.util.LinkedList;
import java.util.Queue;

public class SafeRequestQueue implements RequestQueue {
    private final Queue<Request> queue = new LinkedList<>();
    @Override
    public synchronized Request getRequest() {
        while(null == queue.peek()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return queue.remove();
    }

    @Override
    public synchronized void putRequest(Request request) {
        queue.offer(request);
        notifyAll();
    }
}
