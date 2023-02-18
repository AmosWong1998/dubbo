package pers.amos.demo.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author amos wong
 * @create 2023-02-18 10:33
 */

public class AmosInvocationHandler implements InvocationHandler {

    private Object target;

    public AmosInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是male的动态代理类-start");
        Object res = method.invoke(target, args);
        System.out.println("我是male的动态代理类-end");
        return res;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }
}
