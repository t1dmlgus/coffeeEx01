package com.s1dmlgus.coffeeEx01;


import lombok.Data;

@Data
public class MenuItem {

    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }


}
