package com.s1dmlgus.coffeeEx01;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    public void addMenu(MenuItem menuItem){
        menuItems.add(menuItem);
    }


    // 메뉴항목 가져오기
    public MenuItem choose(String menuName) {

        for (MenuItem menuItem : menuItems) {

            if(menuItem.getName().equals(menuName)){

                return menuItem;
            }
        }

        return null;
    }
}
