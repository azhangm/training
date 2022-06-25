package day10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect03 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("day10.Student");
        Object o = aClass.newInstance();

        Method setId = aClass.getMethod("setId", Integer.class);
        setId.invoke(o, 3);
        Student student = (Student) o;
        System.out.println(student.getId());
    }
}
