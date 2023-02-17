package pers.amos.demo.spi.base;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author amos wong
 * @create 2023-02-17 21:22
 */

public class DubboSPITest {
    public static void main(String[] args) {
        ExtensionLoader<Human> extensionLoader = ExtensionLoader.getExtensionLoader(Human.class);
        Human human = extensionLoader.getExtension("male");
        human.introduce();
    }
}
