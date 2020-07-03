package com.learn.diagrammultithreading.balking;

import lombok.RequiredArgsConstructor;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Data {
    private final String filename;
    private String content;
    private boolean changed;

    public Data(String filename, String content) {
        this.filename = filename;
        this.content = content;
        this.changed = true;
    }

    public synchronized void change(String newContent){
        content = newContent;
        changed = true;
    }

    public synchronized void save(){
        if(!changed){
            return;
        }
        doSave();
        changed = false;
    }

    private void doSave(){
        System.out.println(Thread.currentThread().getName() + " calls doSave content = "+content);
       try(Writer writer = new FileWriter(filename)) {
           writer.write(content);
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
