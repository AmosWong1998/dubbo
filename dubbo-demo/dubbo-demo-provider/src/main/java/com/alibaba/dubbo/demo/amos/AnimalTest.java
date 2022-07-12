package com.alibaba.dubbo.demo.amos;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * @author amos wong
 * @create 2022-07-12 21:23
 */

public class AnimalTest {

    public static void main(String[] args) {
        ExtensionLoader<Animal> extensionLoader = ExtensionLoader.getExtensionLoader(Animal.class);
        Animal dog = extensionLoader.getExtension("dog");
        dog.eat();
    }
}
