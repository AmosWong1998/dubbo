package pers.amos.demo.spi.adaptive;

import org.apache.dubbo.common.URL;

/**
 * @author amos wong
 * @create 2023-02-17 21:20
 */

public class MaleAdaptive implements HumanAdaptive {

    @Override
    public void introduce(URL url) {
        System.out.println(url.getParameter("human"));
        System.out.println("I am man! I am handsome");
    }
}
