package day10.factory;

import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Object animalInstance = AnimalFactory.getAnimalInstance("day10.factory.Cat");
        System.out.println(animalInstance);
        AnimalFactory.doEat(animalInstance,Cat.class);
    }
}
