package com.nhnacademy.mart;

import java.util.ArrayList;


/**
 * 계산을 담당하는 클래스이다.
 */
public class Counter {

    /*


    1. 여기서 부터 자바독 작성하고, 테스트 파일 만들어서 테스트 하기
    2. Logging 설정하고
    3. 마지막 jar 파일 만들기

    +
    1. 진수 테스트 코드 추가 및 테스트 하기
    2. nhn 파일 테스트 코드 만들고 제출하기



     */

    /**
     * 고객이 가져온 Basket의 정보를 가져와서 결제를 담당하는 메소드이다.
     *
     * @param customer Customer 클래스에서 고객 정보를 그대로 넘겨주어 고객이 가진 Basket의 정보를 확인한다.
     */
    // pay 메서드 구현 (카운터에서 계산 처리 메서드)
    public void pay(Customer customer) {
        Basket customerBasket = customer.getBasket();
        ArrayList<Food> foods = customerBasket.getFoods();
        int totalPrice = 0;

        for (Food food : foods) {
            totalPrice += food.getPrice();
        }

        System.out.println("총 가격은 " + totalPrice + "원 입니다.");

        if ((customer.getMoney() - totalPrice) < 0) {
            throw new IllegalArgumentException("비용이 초과되었습니다. (in Counter.pay())");
        } else {
            customer.setMoney(customer.getMoney() - totalPrice);
            System.out.println("고객님 결제 후 잔액 : " + customer.getMoney());
        }

    }


}
