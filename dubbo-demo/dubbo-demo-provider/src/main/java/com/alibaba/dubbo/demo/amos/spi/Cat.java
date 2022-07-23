package com.alibaba.dubbo.demo.amos.spi;

/**
 * @author amos wong
 * @create 2022-07-12 21:20
 */

public class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("cat eat fish...");
    }
}
