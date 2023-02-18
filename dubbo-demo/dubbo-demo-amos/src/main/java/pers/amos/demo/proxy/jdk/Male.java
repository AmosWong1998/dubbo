package pers.amos.demo.proxy.jdk;

/**
 * @author amos wong
 * @create 2023-02-18 10:35
 */

public class Male implements Human{
    @Override
    public void introduce(String name) {
        System.out.println("I am " + name + " I have 2 balls,It's so big!!");
    }
}
