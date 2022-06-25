package day10.factory;
/*
*
*  �򵥹���ģʽ
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
