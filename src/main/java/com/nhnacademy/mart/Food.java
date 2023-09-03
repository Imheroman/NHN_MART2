package com.nhnacademy.mart;

/**
 * 음식들의 이름과 값을 저장하는 클래스이다.
 */
public class Food {

    private final String name;
    private final int price;

    /**
     * 생성자를 통해 음식들의 이름과 값을 설정한다.
     *
     * @param name  음식의 이름
     * @param price 음식의 값
     */
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
