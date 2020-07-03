package com.learn.diagrammultithreading.immutable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public final class Person {
    private final String name;
    private final String address;
}
