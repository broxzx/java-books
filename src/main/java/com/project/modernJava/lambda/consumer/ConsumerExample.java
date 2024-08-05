package com.project.modernJava.lambda.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        List<StringBuilder> strings = List.of(new StringBuilder("Random"), new StringBuilder("List"),
                new StringBuilder("Name"), new StringBuilder("Java"), new StringBuilder("Effective"), new StringBuilder("In"), new StringBuilder("Action"));

        Consumer<StringBuilder> consumer = (o1) -> {
            o1.append(" changed");
        };

        consume(strings, consumer);
        strings
                .forEach(System.out::println);
    }

    private static void consume(List<StringBuilder> strings, Consumer<StringBuilder> consumer) {
        strings
                .forEach(consumer);
    }

}
