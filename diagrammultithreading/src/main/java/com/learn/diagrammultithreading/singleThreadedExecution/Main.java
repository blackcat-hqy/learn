package com.learn.diagrammultithreading.singleThreadedExecution;

public class Main {
    public static void main(String[] args) {
        testUnsafeGateAndPrint();
        // testSafeGateAndPrint();
    }

    public static void testUnsafeGateAndPrint(){
        Gate gate = new UnSafeGate();
        new UserThread(gate,"Alice","Alasika").start();
        new UserThread(gate,"Bobby","Brazil").start();
        new UserThread(gate,"Chris","Cannada").start();
    }

    public static void testSafeGateAndPrint(){
        Gate gate = new SafeGate();
        new UserThread(gate,"Alice","Alasika").start();
        new UserThread(gate,"Bobby","Brazil").start();
        new UserThread(gate,"Chris","Cannada").start();
    }
}
