package com.learn.diagrammultithreading.singleThreadedExecution;

import lombok.ToString;

@ToString
public class UnSafeGate implements Gate{
    private int counter = 0;
    private String name = "Nobady";
    private String address = "Nowhere";

    @Override
    public void pass(String name,String address){
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    public void check(){
        if(name.charAt(0) != address.charAt(0)){
            System.out.println("**** BROKEN **** " + toString());
        }
    }
}
