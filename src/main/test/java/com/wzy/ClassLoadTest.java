package com.wzy;

import org.springframework.core.io.Resource;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/7/5
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class ClassLoadTest {

    public static void  test1(){
        try {
            //通过类加载器获取类对象
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            Class<?> aClass = contextClassLoader.loadClass("com.wzy.WholeExceptionHandle");
            //通过类默认的构造函数，或实例
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor((Class[]) null);
            Object o = declaredConstructor.newInstance();
            //通过反射设置属性
            Method methods = aClass.getMethod("method", String.class);
            methods.invoke(o,"ceshi");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
