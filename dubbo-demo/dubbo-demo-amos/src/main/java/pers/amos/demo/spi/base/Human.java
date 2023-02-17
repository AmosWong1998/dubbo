package pers.amos.demo.spi.base;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author amos wong
 * @create 2023-02-17 21:19
 */
@SPI
public interface Human {
    void introduce();
}
