package pers.amos.demo.proxy.javassit;

import javassist.util.proxy.ProxyFactory;

/**
 * @author amos wong
 * @create 2023-02-18 19:55
 */

public class JavassistTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setFilter(m -> true);
        proxyFactory.setSuperclass(AmosJavassist.class);
        proxyFactory.setHandler((self, thisMethod, proceed, args1) -> {
            System.out.println("前置增强...");
            Object res = proceed.invoke(self, args1);
            System.out.println("后置增强...");
            return res;
        });

        Class proxyClazz = proxyFactory.createClass();
        AmosJavassist proxy = (AmosJavassist) proxyClazz.newInstance();
        proxy.introduce();
    }
}
