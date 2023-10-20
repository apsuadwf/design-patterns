package org.ytmf.structural.proxy.dynamic;

import net.sf.cglib.proxy.Enhancer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.ytmf.structural.proxy.dynamic.cglib.CacheMethodInterceptor;
import org.ytmf.structural.proxy.dynamic.cglib.DataBaseDataQuery;
import org.ytmf.structural.proxy.dynamic.jdk.CacheInvocationHandler;
import org.ytmf.structural.proxy.dynamic.jdk.DataQuery;

import javax.annotation.Resource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author XieRongji
 * @date 2023/10/20 15:21
 **/
@SpringBootTest
public class DynamicProxyTest {
    @Resource
    private org.ytmf.structural.proxy.dynamic.aop.DataQuery dataQuery;
    @Test
    public void jdkProxyTest(){
        // jdk提供的代理实现，主要是使用Proxy类来完成
        // 1、classLoader：被代理类的类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        // 2、代理类需要实现的接口数组
        Class<?>[] interfaces = new Class[]{DataQuery.class};
        // 3、InvocationHandler
        InvocationHandler invocationHandler = new CacheInvocationHandler();

        DataQuery dataQuery = (DataQuery) Proxy.newProxyInstance(
                classLoader, interfaces, invocationHandler
        );

        // 事实上调用query方法的使用，他是调用了invoke
        String result = dataQuery.query("key1");
        System.out.println(result);
        System.out.println("--------------------");
        result = dataQuery.query("key1");
        System.out.println(result);
        System.out.println("--------------------");
        result = dataQuery.query("key2");
        System.out.println(result);
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // 事实上调用queryAll方法的使用，他是调用了invoke
        result = dataQuery.queryAll("key1");
        System.out.println(result);
        System.out.println("--------------------");
        result = dataQuery.queryAll("key1");
        System.out.println(result);
        System.out.println("--------------------");
        result = dataQuery.queryAll("key2");
        System.out.println(result);
        System.out.println("--------------------");
    }

    @Test
    public void CGlibProxyTest(){
        // cglib通过Enhancer
        Enhancer enhancer = new Enhancer();
        // 设置他的父类
        enhancer.setSuperclass(DataBaseDataQuery.class);
        // 设置一个方法拦截器，用来拦截方法
        enhancer.setCallback(new CacheMethodInterceptor());
        // 创建代理类
        DataBaseDataQuery databaseDataQuery = (DataBaseDataQuery)enhancer.create();

        databaseDataQuery.query("key1");
        databaseDataQuery.query("key1");
        databaseDataQuery.query("key2");
    }

    @Test
    public void AOPProxyTest(){
        dataQuery.query("key1");
        dataQuery.query("key1");
        dataQuery.query("key2");
    }
}
