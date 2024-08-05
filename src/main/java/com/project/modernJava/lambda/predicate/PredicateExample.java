package com.project.modernJava.lambda.predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> strings = List.of("Random", "List", "Name", "Java", "Effective", "In", "Action", "", " ");
        Predicate<String> predicate = string -> string.length() >= 6;
        List<String> sortedStrings = sortString(strings, predicate);

        sortedStrings
                .forEach(System.out::println);
    }

    private static List<String> sortString(List<String> strings, Predicate<String> predicate) {
        return strings
                .stream()
                .filter(predicate)
                .toList();
    }

}
