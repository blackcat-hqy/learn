package com.learn.diagrammultithreading.activeObject;

public class MakerClientThread extends Thread{
    private final ActiveObject activeObject;
    private final char fillchar;

    public MakerClientThread(String name, ActiveObject activeObject) {
        super(name);
        this.activeObject = activeObject;
        fillchar = name.charAt(0);
    }
    
    @Override
    public void run(){
        try{
            for (int i = 0; true; i++) {
                Result<String> future = activeObject.makeString(i,fillchar);
                Thread.sleep(10);
                String resultValue = future.getResultValue();
                System.out.println(getName() + " value = " + resultValue);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
