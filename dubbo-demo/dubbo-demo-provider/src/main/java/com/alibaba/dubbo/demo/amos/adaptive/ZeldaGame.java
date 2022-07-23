package com.alibaba.dubbo.demo.amos.adaptive;

import com.alibaba.dubbo.common.URL;

/**
 * @author amos wong
 * @create 2022-07-22 21:11
 */

public class ZeldaGame implements Game{
    @Override
    public void play(URL url) {
        System.out.println("play zelda is very happy!!");
    }
}
