package pers.amos.demo.proxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author amos wong
 * @create 2023-02-18 18:58
 */

public class CglibTest {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/amos/Downloads/code/source/dubbo/dubbo-demo/dubbo-demo-amos/src/main/java/pers/amos/demo/proxy/cglib");
        CglibProxy cglibProxy = new CglibProxy();
        AmosCglib proxy = (AmosCglib) cglibProxy.getProxy(AmosCglib.class);
        proxy.introduce("amos");
    }
}
