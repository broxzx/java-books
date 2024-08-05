package com.project.modernJava.function;

import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        List<Integer> integers = List.of(3245, 2, 3465, 2, 67354, 67, 35, 6, 34256);
        Function<Integer, String> map = (o1) -> String.valueOf(o1);

        List<String> mappedIntegers = functionExample(integers, map);

        mappedIntegers
                .forEach(System.out::println);
    }

    private static List<String> functionExample(List<Integer> integers, Function<Integer, String> function) {
        return integers
                .stream()
                .map(function)
                .toList();
    }

}
