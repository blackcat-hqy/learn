package com.learn.diagrammultithreading.guardedSuspension;

public class UnsafeRequestQueue implements RequestQueue {
    @Override
    public Request getRequest() {
        return null;
    }

    @Override
    public void putRequest(Request request) {

    }
}
