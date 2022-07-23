package com.alibaba.dubbo.demo.amos.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author amos wong
 * @create 2022-07-22 21:10
 */

@SPI("zelda")
public interface Game {

    @Adaptive
    void play(URL url);
}
