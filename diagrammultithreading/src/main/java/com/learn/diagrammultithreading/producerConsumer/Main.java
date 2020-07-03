package com.learn.diagrammultithreading.producerConsumer;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(3);
        new EaterThread("EaterThread-0",table).start();
        new EaterThread("EaterThread-1",table).start();
        new EaterThread("EaterThread-2",table).start();
        new MakerThread("MakerThread-0",table).start();
        new MakerThread("MakerThread-1",table).start();
        new MakerThread("MakerThread-2",table).start();
    }
}
