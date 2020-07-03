package com.learn.diagrammultithreading.activeObject;

import java.util.concurrent.Future;

public interface ActiveObject {
    Result<String> makeString(int count, char fillchar);
    void displayString(String string);
}
