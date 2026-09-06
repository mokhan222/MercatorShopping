package org.example;

import java.util.List;

public class Checkout {
    public int calculateTotal(List<String> products) {

        int total = 0;
        for (String item : products) {
            if (item.equalsIgnoreCase("orange")) {
                total += 25;
            }
            ;
            if (item.equalsIgnoreCase("apple")) {
                total += 60;

            }
        }
        return total;
    }
}