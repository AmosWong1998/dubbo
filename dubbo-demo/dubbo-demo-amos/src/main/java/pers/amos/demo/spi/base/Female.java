package pers.amos.demo.spi.base;

/**
 * @author amos wong
 * @create 2023-02-17 21:20
 */

public class Female implements Human {

    @Override
    public void introduce() {
        System.out.println("I am woman! I am beautiful");
    }
}
