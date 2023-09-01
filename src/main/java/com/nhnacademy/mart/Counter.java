package com.nhnacademy.mart;

import java.util.ArrayList;

public class Counter {


    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)
    public void pay(Customer customer) {
        Basket customerBasket = customer.getBasket();
        ArrayList<Food> foods = customerBasket.getFoods();
        int totalPrice = 0;

        for (Food food : foods) {
            totalPrice += food.getPrice();
        }

        System.out.println("총 가격은 " + totalPrice + "원 입니다.");

        if ((customer.getMoney() - totalPrice) < 0) {
            throw new IllegalArgumentException("비용이 초과되었습니다.");
        } else {
            customer.setMoney(customer.getMoney() - totalPrice);
            System.out.println("고객님 결제 후 잔액 : " + customer.getMoney());
        }

    }


}
