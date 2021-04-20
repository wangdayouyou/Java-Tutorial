package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloProxy implements InvocationHandler {

    Object subject;
    public HelloProxy(Object object){
        this.subject = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理前 ...");
        method.invoke(subject,args);
        System.out.println("动态代理后 ...");
        return null;
    }
}
