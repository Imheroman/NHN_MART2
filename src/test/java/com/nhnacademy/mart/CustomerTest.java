package com.nhnacademy.mart;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerTest extends TestCase {

    @Test
    @DisplayName("Customer() 쇼핑 목록이 비었을 때")
    public void testPrecondition() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Customer(new BuyList()));
    }

    @Test
    @DisplayName("Customer.pickFoods() 마트에 없는 상품일 때")
    public void testPickFoods() {
        NhnMart nhnMart = new NhnMart();
        nhnMart.prepareMart();

        BuyList buyList = new BuyList();
        buyList.add("양파 30");
        Customer customer = new Customer(buyList);


        Assertions.assertThrows(IllegalArgumentException.class, () -> customer.pickFoods(nhnMart.getFoodStand()));
    }
}