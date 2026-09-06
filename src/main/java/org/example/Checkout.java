package org.example;

import java.util.List;

public class Checkout {
    public int calculateTotal(List<String> products) {
        int total = 0;

        for (String item : products) {
            try {
                if(item == null){
                    continue;
                }
                Product product = Product.valueOf(item.toUpperCase());
                total += product.getPrice();

            } catch (IllegalArgumentException e) {
                System.out.println(item + " not available");
            }
        }
        return total;
    }
}