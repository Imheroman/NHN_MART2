package com.nhnacademy.mart;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CounterTest extends TestCase {

    @Test
    @DisplayName("Counter pay() 비용이 초과됐을 때")
    public void testOverPay() {
        NhnMart nhnMart = new NhnMart();
        nhnMart.prepareMart();

        BuyList buyList = new BuyList();
        buyList.add("계란 5");
        Customer customer = new Customer(buyList);

        customer.bring(nhnMart.provideBasket());
        customer.pickFoods(nhnMart.getFoodStand());

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Counter().pay(customer));
    }
}