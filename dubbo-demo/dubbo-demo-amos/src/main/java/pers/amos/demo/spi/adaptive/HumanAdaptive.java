package pers.amos.demo.spi.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author amos wong
 * @create 2023-02-17 21:19
 */
@SPI
public interface HumanAdaptive {
    @Adaptive("human")
    void introduce(URL url);
}
