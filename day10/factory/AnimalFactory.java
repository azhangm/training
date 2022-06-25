package day10.factory;
/*
*
*  简单工厂模式
* */

import java.lang.reflect.InvocationTargetException;

public class AnimalFactory {
    public static Object getAnimalInstance(String msg) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return Class.forName(msg).newInstance();
    }
    public static void doEat (Object o , Class c) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        c.getMethod("eat").invoke(o);

    }
}
