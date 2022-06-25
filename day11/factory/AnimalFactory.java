package day11.factory;
/*
*
*  简单工厂模式 + 单例模式
*   饿汉式
* */

import java.lang.reflect.InvocationTargetException;

public class AnimalFactory {
    private static AnimalFactory animalFactory;
    private AnimalFactory(){}
    public static Object getAnimalInstance(String msg) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return Class.forName(msg).newInstance();
    }
    public static void doEat (Object o , Class c) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        c.getMethod("eat").invoke(o);
    }
    public static AnimalFactory getInstance() {
        if (animalFactory == null)
      animalFactory =  new AnimalFactory();
        return animalFactory;
    }
}
