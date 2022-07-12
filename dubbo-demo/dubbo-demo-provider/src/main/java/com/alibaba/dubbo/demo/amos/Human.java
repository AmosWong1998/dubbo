package com.alibaba.dubbo.demo.amos;

/**
 * @author amos wong
 * @create 2022-07-12 22:10
 */

public class Human implements Animal{

    private Animal animal;

    public Human(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void eat() {
        System.out.println("human is advanced animal");
        animal.eat();
        System.out.println("human like eat meat..");
    }
}
