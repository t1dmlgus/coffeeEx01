package com.s1dmlgus.coffeeEx01;


import lombok.Data;

@Data
public class Coffee {

    private String name;
    private int price;


    public Coffee(MenuItem menuItem) {

        this.name = menuItem.getName();
        this.price = menuItem.getPrice();
    }
}
