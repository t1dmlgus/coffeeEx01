package com.s1dmlgus.coffeeEx01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;



class CustomerTest {

    @DisplayName("커피 주문하기")
    @Test
    public void 주문하기() throws Exception{
        //given
        // 손님
        Customer customer = new Customer();


        MenuItem me01 = new MenuItem("아메리카노", 4100);
        MenuItem me02 = new MenuItem("바나나스무디", 5500);
        MenuItem me03 = new MenuItem("라떼", 4600);
        MenuItem me04 = new MenuItem("까나리", 4500);


        // 메뉴판
        Menu menu = new Menu();

        menu.addMenu(me01);
        menu.addMenu(me02);
        menu.addMenu(me03);
        menu.addMenu(me04);

        // 바리스타
        Barista barista = new Barista();

        //when
        // 주문하기
        Coffee coffee = customer.order("아메리카노", menu, barista);

        //then
        assertThat(coffee.getName()).isEqualTo("아메리카노");
    }

}