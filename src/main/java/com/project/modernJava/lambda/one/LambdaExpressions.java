package com.project.modernJava.lambda.one;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {
        comparatorExample();
        runnableExample(() -> System.out.println("Hell world!"));

    }

    private static void comparatorExample() {
        Comparator<Apple> comparator = (o1, o2) -> o1.getWeight() - o2.getWeight();
        //or
        Comparator<Apple> comparator2 = Comparator.comparingInt(Apple::getWeight);

        List<Apple> apples = List.of(new Apple(SortEnum.RED, 12), new Apple(SortEnum.GREEN, 15), new Apple(SortEnum.MIXED, 9),
                new Apple(SortEnum.RED, 9), new Apple(SortEnum.GREEN, 10), new Apple(SortEnum.MIXED, 5), new Apple(SortEnum.RED, 4));

        apples
                .stream()
                .filter(apple -> apple.getSort().equals(SortEnum.RED) && apple.getWeight() >= 8)
                .sorted(Comparator.comparingInt(Apple::getWeight))
                .forEach(System.out::println);
    }

    private static void runnableExample(Runnable runnable) {
        runnable.run();
    }


    @Data
    @AllArgsConstructor
    public static class Apple {
        private SortEnum sort;
        private int weight;
    }
}
