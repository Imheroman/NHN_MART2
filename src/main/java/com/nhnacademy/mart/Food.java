package com.nhnacademy.mart;

public class Food {

    private final String name;
    private final int price;

    public Food(String name, int price) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Food name이 공백입니다. (in Food.Food())");
        } else {
            this.name = name;
        }

        if (price < 0) {
            throw new IllegalArgumentException("가격은 양의 정수가 작성되어야 합니다 (in Food.Food()).");
        } else {
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
