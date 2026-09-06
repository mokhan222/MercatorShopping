package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTest {
    @Test
    void shouldReturnZeroWhenBasketIsEmpty() {
        Checkout myCheckout = new Checkout();
        int total = myCheckout.calculateTotal(List.of());
        assertEquals(0, total);
    }

    @Test
    void shouldReturnPriceOfSingleApple() {
        Checkout myCheckout = new Checkout();
        int total = myCheckout.calculateTotal(List.of("apple"));
        assertEquals(60, total);

    }

    @Test
    void shouldReturnOfSingleOrange() {
        Checkout myCheckout = new Checkout();
        int total = myCheckout.calculateTotal(List.of("Orange"));
        assertEquals(25, total);

    }

    @Test
    void shouldReturnSumOfMultipleItems() {
        Checkout myCheckout = new Checkout();
        int total = myCheckout.calculateTotal(List.of("Apple", "Apple", "Orange"));
        assertEquals(85, total);
        /* test needs to be altered for apple discount */

    }

    @Test
    void incorrectPProduct() {
        Checkout myCheckout = new Checkout();
        int total = myCheckout.calculateTotal(List.of("banana", "mango", "hello"));
        assertEquals(0, total);

    }

    @Test
    void nullEntry() {
        Checkout myCheckout = new Checkout();
        int total = myCheckout.calculateTotal(Arrays.asList("   ", "", " ", "", null));
        assertEquals(0, total);

    }

    @Test
    void emptyEntry() {
        Checkout myCheckout = new Checkout();
        int total = myCheckout.calculateTotal(List.of("   ", "", " ", ""));
        assertEquals(0, total);
    }


    @Test
    void shouldApplyBuyOneGetOneFreeOnApple() {
        Checkout myCheckout = new Checkout();
        int total = myCheckout.calculateTotal(List.of("apple", "apple"));
        assertEquals(60, total);


    }

    @Test
    void shouldApplyBuyTwoGetOneFreeOnOrange() {
        Checkout myCheckout = new Checkout();
        int total = myCheckout.calculateTotal(List.of("orange", "orange", "orange"));
        assertEquals(50, total);
    }

}
