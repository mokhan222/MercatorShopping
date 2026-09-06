package org.example;

import java.util.List;

public class Checkout {
    public int calculateTotal(List<String> products) {
        int total = 0;
        int applecount = 0;
        int orangecount = 0;
        int payableApple = 0;
        int payableOrange = 0;

        for (String item : products) {
            try {
                if (item == null || item.isBlank()) {
                    continue;
                }
                Product product = Product.valueOf(item.toUpperCase());
                if (product == Product.APPLE) {
                    applecount += 1;
                } else if (product == Product.ORANGE) {
                    orangecount += 1;

                }

            } catch (IllegalArgumentException e) {
                System.out.println(item + " not available");
            }

        }
        payableApple = (((applecount / 2) + (applecount % 2)) * Product.APPLE.getPrice());
        payableOrange = ((orangecount - (orangecount/3))*Product.ORANGE.getPrice());
        total = payableApple + payableOrange;
        return total;
    }
}