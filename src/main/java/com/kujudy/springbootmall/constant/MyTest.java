package com.kujudy.springbootmall.constant;

public class MyTest {

    public static void main(String[] args) {
        //enum -> string
        ProductCategory category = ProductCategory.FOOD;
        String s = category.name();
        System.out.println(s); // Food

        //string -> enum
        String s2 = "CAR";
        ProductCategory category2 = ProductCategory.valueOf(s2);
    }
}
