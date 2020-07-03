package com.learn.diagrammultithreading.guardedSuspension;

public interface RequestQueue {
    Request getRequest();
    void putRequest(Request request);
}
