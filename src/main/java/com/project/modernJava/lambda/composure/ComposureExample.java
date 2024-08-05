package com.project.modernJava.lambda.composure;

import java.util.Comparator;
import java.util.List;

public class ComposureExample {

    public static void main(String[] args) {
        List<Integer> integers = List.of(3245, 2, 3465, 2, 67354, 67, 35, 6, 34256);

        List<Integer> list = integers.stream()
                .sorted(Comparator.comparingInt(o -> o))
                .toList()
                .reversed();

        System.out.println(list);
    }

}
