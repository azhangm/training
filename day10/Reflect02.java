package day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Reflect02 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> c = Student.class;
        Class<? super Student> superclass = c.getSuperclass();
        System.out.println("父类的信息" + superclass);
        Class<?>[] interfaces = c.getInterfaces();
        System.out.println("接口的信息是");
        for (Class<?> anInterface : interfaces) System.out.println(anInterface);
        Constructor<?>[] constructors = c.getConstructors();
        for (Constructor<?> constructor : constructors) System.out.println(constructor + "参数数量" + constructor.getParameterCount());

//        指定构造方法
        Constructor<Student> constructor = c.getConstructor(Integer.class, String.class);

        Student zs = constructor.
                newInstance(12, "张三");
        System.out.println(zs.getId());
        System.out.println(zs.getName());
        Class<Integer> integerClass = int.class;
        Constructor<?>[] constructors1 = integerClass.getConstructors();
        System.out.println(Arrays.toString(constructors1));
    }
}
