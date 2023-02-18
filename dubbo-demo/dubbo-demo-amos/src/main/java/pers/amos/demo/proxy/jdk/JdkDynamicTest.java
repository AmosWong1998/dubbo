package pers.amos.demo.proxy.jdk;

/**
 * @author amos wong
 * @create 2023-02-18 10:38
 */

public class JdkDynamicTest {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Human human = new Male();
        AmosInvocationHandler invocationHandler = new AmosInvocationHandler(human);
        Human proxy = (Human) invocationHandler.getProxy();
        proxy.introduce("amos");
    }
}
