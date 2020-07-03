package com.learn.diagrammultithreading.guardedSuspension;

public class Main {
    public static void main(String[] args) {
        testSafeRequestQueue();
    }

    public static void testSafeRequestQueue(){
        RequestQueue requestQueue = new SafeRequestQueue();
        new ClientThread("ClientThread",requestQueue).start();
        new ServerThread("ServerThread",requestQueue).start();
    }
}
