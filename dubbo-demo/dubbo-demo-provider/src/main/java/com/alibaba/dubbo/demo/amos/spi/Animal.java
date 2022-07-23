package com.alibaba.dubbo.demo.amos.spi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author amos wong
 * @create 2022-07-12 21:19
 */
@SPI("animal")
public interface Animal {

    void eat();

}
