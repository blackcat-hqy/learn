package com.learn.diagrammultithreading.immutable;

public class Main {
    public static void main(String[] args) {
        testPersonAndPrint();
    }

    public static void testPersonAndPrint(){
        Person person = new Person("Alice","Alaska");
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
    }
}
