package com.s1dmlgus.coffeeEx01;

public class Customer {

    // 주문하기
    public Coffee order(String manuName, Menu menu, Barista barista) {

        MenuItem menuItem = menu.choose(manuName);
        Coffee coffee = barista.makeCoffee(menuItem);

        System.out.println("주문한 coffee = " + coffee);

        return coffee;
    }
}
