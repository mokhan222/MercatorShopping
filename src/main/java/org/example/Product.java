package org.example;

public enum Product {
    APPLE(60),
    ORANGE(25);

    private final int price;
    Product(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

}
