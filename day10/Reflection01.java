package day10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

/**
* java 中最强大的技术
*
* 在运行状态中方，对任意一个类，都能知道这个类所有的属性和方法。
*  简单来说两个作用，RTTI（运行时类型识别）和 DC（动态创建）
* 反射机制允许程序在运行时取得任何一个已知名称的 class 的内部信息，包括
*  其 modifiers(修饰符)，fields(属性)，methods(方法)等，并可于运行时改变 fields 内容或调用
*  methods。那么我们便可以更灵活的编写代码，代码可以在运行时装配，无需在组件之间进
*   行源代码链接，降低代码的耦合度；还有动态代理的实现等等；但是需要注意的是反射使用
 *
 *   了解一下 双亲委派机制。
* */
public class Reflection01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
//        Student student = new Student();

//        如何 获取到对象的信息？
//        父类 接口 属性 方法？

//        类对象 记录 属性 方法 修饰符
//        Class<Student> studentClass = Student.class;
//        System.out.println(Arrays.toString(studentClass.getMethods()));
//        Class<?> student1 = Class.forName("day10.Student");
//        System.out.println(student1);
//        Method[] methods = student1.getMethods();
//        for (Method method : methods) System.out.println(method.toString());
//        Field[] fields = student1.getFields();
//        for (Field field : fields) System.out.println(field);



/*
 获取类对象 方法 一
 */
//        Class<? extends Student> c = Student.class;
//        System.out.println(c);
//        for (Field field : c.getFields()) System.out.println(field);
//        for (Method method : c.getMethods()) System.out.println(method);
//        方法2
//        Student s = new Student();
//        Class<? extends Student> c1 = s.getClass();
//        System.out.println(c1);

//        方法3
        Class<?> aClass = Class.forName("day10.Student");
//        System.out.println(aClass);

//        获取全部属性
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) System.out.println(field.getName() + "-----" + field.getModifiers() + "-----"+ field.getType());
//      获取所有属性 是 public 的
        System.out.println();
        System.out.println("------");
        System.out.println();
        Field[] fields = aClass.getFields();
        for (Field f : fields) System.out.println(f);
        Field age = aClass.getField("age");
        Object o = aClass.newInstance();
        age.set(o,12);
        Field id = aClass.getDeclaredField("id");
        id.setAccessible(true);
        id.set(o,1111);
        Student student = (Student ) o;
        System.out.println(student.age);
        System.out.println(student.getId());
        System.out.println("----"
        );
//        只获取当前类的方法
        for (Method method : aClass.getDeclaredMethods()) {

            System.out.println(method);
            Class<?>[] parameterTypes = method.getParameterTypes();
//            for (Class<?> parameterType : parameterTypes) {
//                System.out.println(parameterType);
//            }
        }

//        获取 父类 的方法 和 自己的方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) System.out.println(method);
    }
}
