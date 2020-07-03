package com.learn.diagrammultithreading.future;

public class RealData implements Data {
    private final String content;
    public RealData(int count,char c){
        System.out.println("        making RealData("+count+","+c+") BEGIN");
        char[] buffer = new char[count];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = c;
            slowly();
        }
        System.out.println("        making RealData("+count+","+c+") END");
        content = new String(buffer);
    }
    @Override
    public String getContent() {
        return content;
    }

    private static void slowly(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
