package com.project.chapter2.builder;

import lombok.Data;
import lombok.ToString;

@ToString
public class NutritionFacts {

    private final int servingSize;

    private final int servings;

    private final int calories;

    private final int fat;

    private final int sodium;

    private final int carbohydrate;

    private final int protein;

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.getServingSize();
        this.servings = builder.getServings();
        this.calories = builder.getCalories();
        this.fat = builder.getFat();
        this.sodium = builder.getSodium();
        this.carbohydrate = builder.getCarbohydrate();
        this.protein = builder.getProtein();
    }


    @Data
    public static class Builder {

        private int servingSize;

        private int servings;

        private int calories = 0;

        private int fat = 0;

        private int sodium = 0;

        private int carbohydrate = 0;

        private int protein = 0;


        public Builder servingSize(int servingSize) {
            this.servingSize = servingSize;
            return this;
        }

        public Builder servings(int servings) {
            this.servings = servings;
            return this;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public Builder protein(int protein) {
            this.protein = protein;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

        public Builder() {
        }
    }

}
