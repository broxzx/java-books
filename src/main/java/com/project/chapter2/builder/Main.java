package com.project.chapter2.builder;

public class Main {

    public static void main(String[] args) {
        NutritionFacts builtNutritionFacts = new NutritionFacts.Builder()
                .servingSize(10)
                .servings(10)
                .fat(10)
                .calories(10)
                .carbohydrate(10)
                .protein(10)
                .build();

        System.out.println(builtNutritionFacts);
    }

}
