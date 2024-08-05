package com.project.modernJava.lambda.predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class IntPredicateExample {

    public static void main(String[] args) {
        IntPredicate evenNumbersPredicate = (o1) -> o1 % 2 == 0; // without autoboxing
        Predicate<Integer> oddNumberPredicate = (Integer o1) -> o1 % 2 == 1; // autoboxing n-times
        evenNumbersPredicate.test(1);
        evenNumbersPredicate.test(1);
    }

}
