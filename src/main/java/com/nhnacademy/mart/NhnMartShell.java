package com.nhnacademy.mart;

import java.util.Scanner;

public class NhnMartShell {

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();
        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.");

        BuyList buyList = inputBuyListFromShell();
        
        Customer hero = new Customer(buyList);

        // 장바구니를 챙긴다.
        hero.bring(mart.provideBasket());

        // 식품을 담는다.
        hero.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        hero.payTox(mart.getCounter());
    }

    private static BuyList inputBuyListFromShell() {
        // TODO Scanner 입력을 받아 buyList 만들기
        Scanner sc = new Scanner(System.in);

        BuyList buyList = new BuyList();
        buyList.add(sc.nextLine());

        return buyList;
    }
}
