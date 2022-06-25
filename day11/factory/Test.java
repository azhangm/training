package day11.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Constructor<AnimalFactory> constructor = AnimalFactory.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        AnimalFactory animalFactory = constructor.newInstance();
        AnimalFactory animalFactory1= constructor.newInstance();
        System.out.println(animalFactory);
        System.out.println(animalFactory1);

        System.out.println();
        AnimalFactory instance = AnimalFactory.getInstance();
        System.out.println(instance);
        AnimalFactory instance1 = AnimalFactory.getInstance();
        System.out.println(instance1);
        System.out.println(instance == instance1);
    }
}
