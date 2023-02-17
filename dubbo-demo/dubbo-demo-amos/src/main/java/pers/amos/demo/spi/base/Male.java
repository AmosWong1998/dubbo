package pers.amos.demo.spi.base;

/**
 * @author amos wong
 * @create 2023-02-17 21:20
 */

public class Male implements Human {

    @Override
    public void introduce() {
        System.out.println("I am man! I am handsome");
    }

    private MaleInjectObject maleInjectObject;

    public MaleInjectObject getMaleInjectObject() {
        return maleInjectObject;
    }

    public void setMaleInjectObject(MaleInjectObject maleInjectObject) {
        this.maleInjectObject = maleInjectObject;
    }
}
