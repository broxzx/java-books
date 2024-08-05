package com.project.modernJava.lambda.predicate;

import com.project.modernJava.lambda.one.LambdaExpressions;
import com.project.modernJava.lambda.one.SortEnum;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> strings = List.of("Random", "List", "Name", "Java", "Effective", "In", "Action", "", " ");
        Predicate<String> predicate = string -> string.length() >= 6;
        List<String> sortedStrings = sortString(strings, predicate);

        sortedStrings
                .forEach(System.out::println);

        List<LambdaExpressions.Apple> apples = List.of(new LambdaExpressions.Apple(SortEnum.RED, 12), new LambdaExpressions.Apple(SortEnum.GREEN, 15), new LambdaExpressions.Apple(SortEnum.MIXED, 9),
                new LambdaExpressions.Apple(SortEnum.RED, 9), new LambdaExpressions.Apple(SortEnum.GREEN, 10), new LambdaExpressions.Apple(SortEnum.MIXED, 5), new LambdaExpressions.Apple(SortEnum.RED, 4));

        Predicate<LambdaExpressions.Apple> redApples = (apple) -> apple.getSort().equals(SortEnum.RED);
        Predicate<LambdaExpressions.Apple> heavyApples = (apple) -> apple.getWeight() >= 4;
        Predicate<LambdaExpressions.Apple> notRedApplePredicate = redApples.negate();
        Predicate<LambdaExpressions.Apple> redAndHeavyApplesPredicate = redApples.and(heavyApples);

    }

    private static List<String> sortString(List<String> strings, Predicate<String> predicate) {
        return strings
                .stream()
                .filter(predicate)
                .toList();
    }

}
