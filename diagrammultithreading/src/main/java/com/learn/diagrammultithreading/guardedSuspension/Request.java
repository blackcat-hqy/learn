package com.learn.diagrammultithreading.guardedSuspension;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Request {
    private final String name;
}
