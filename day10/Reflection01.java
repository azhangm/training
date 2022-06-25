package day10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

/**
* java ����ǿ��ļ���
*
* ������״̬�з���������һ���࣬����֪����������е����Ժͷ�����
*  ����˵�������ã�RTTI������ʱ����ʶ�𣩺� DC����̬������
* ��������������������ʱȡ���κ�һ����֪���Ƶ� class ���ڲ���Ϣ������
*  �� modifiers(���η�)��fields(����)��methods(����)�ȣ�����������ʱ�ı� fields ���ݻ����
*  methods����ô���Ǳ���Ը����ı�д���룬�������������ʱװ�䣬���������֮���
*   ��Դ�������ӣ����ʹ������϶ȣ����ж�̬�����ʵ�ֵȵȣ�������Ҫע����Ƿ���ʹ��
 *
 *   �˽�һ�� ˫��ί�ɻ��ơ�
* */
public class Reflection01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
//        Student student = new Student();

//        ��� ��ȡ���������Ϣ��
//        ���� �ӿ� ���� ������

//        ����� ��¼ ���� ���� ���η�
//        Class<Student> studentClass = Student.class;
//        System.out.println(Arrays.toString(studentClass.getMethods()));
//        Class<?> student1 = Class.forName("day10.Student");
//        System.out.println(student1);
//        Method[] methods = student1.getMethods();
//        for (Method method : methods) System.out.println(method.toString());
//        Field[] fields = student1.getFields();
//        for (Field field : fields) System.out.println(field);



/*
 ��ȡ����� ���� һ
 */
//        Class<? extends Student> c = Student.class;
//        System.out.println(c);
//        for (Field field : c.getFields()) System.out.println(field);
//        for (Method method : c.getMethods()) System.out.println(method);
//        ����2
//        Student s = new Student();
//        Class<? extends Student> c1 = s.getClass();
//        System.out.println(c1);

//        ����3
        Class<?> aClass = Class.forName("day10.Student");
//        System.out.println(aClass);

//        ��ȡȫ������
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) System.out.println(field.getName() + "-----" + field.getModifiers() + "-----"+ field.getType());
//      ��ȡ�������� �� public ��
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
//        ֻ��ȡ��ǰ��ķ���
        for (Method method : aClass.getDeclaredMethods()) {

            System.out.println(method);
            Class<?>[] parameterTypes = method.getParameterTypes();
//            for (Class<?> parameterType : parameterTypes) {
//                System.out.println(parameterType);
//            }
        }

//        ��ȡ ���� �ķ��� �� �Լ��ķ���
        Method[] methods = aClass.getMethods();
        for (Method method : methods) System.out.println(method);
    }
}
