package com.project.modernJava.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt(1000);
        int randomNumber = supplier.get();

        System.out.println("Random number: " + randomNumber);

        Supplier<List<String>> stringListSupplier = () -> {
            List<String> strings = new ArrayList<>();
            strings.add("Hello");
            strings.add("World");
            strings.add("!");

            return strings;
        };

        List<String> strings = stringListSupplier.get();
        Predicate<String> stringIsNotEmptyPredicate = s1 -> !s1.isEmpty();

        strings.stream()
                .filter(stringIsNotEmptyPredicate)
                .forEach(System.out::println);
    }

}
