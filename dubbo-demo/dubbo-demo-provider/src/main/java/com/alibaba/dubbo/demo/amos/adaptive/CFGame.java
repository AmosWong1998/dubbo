package com.alibaba.dubbo.demo.amos.adaptive;

import com.alibaba.dubbo.common.URL;

/**
 * @author amos wong
 * @create 2022-07-22 21:12
 */

public class CFGame implements Game{
    @Override
    public void play(URL url) {
        System.out.println("play cf is a not bad thing!");
    }
}
