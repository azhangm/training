package Enum;
/*
* 枚举 ： 把一个类所有的对象都列举出来 成为 枚举
*  对于类 来说 一个类 可以创建无数个对象
*  枚举是一个特殊类 他能创建的对象个数是有限的
* */
public enum Season {

        SPRING(100) {
                @Override
                public void myMethod2() {
                        System.out.println("抽象方法");
                }
        },SUMMER {
                @Override
                public void myMethod2() {
                        System.out.println("抽象方法");
                }
        },AUTUMN{
                @Override
                public void myMethod2() {
                        System.out.println("抽象方法");
                }
        },WINTER{
                @Override
                public void myMethod2() {
                        System.out.println("抽象方法");
                }
        };
        static {
                System.out.println("静态初始化代码块");
        }

        Season() {
        }

        Season(int a) {
                this.a = a;
        }

        {

                System.out.println("初始化代码块");
        }
        int a = 0;
        @Override
        public String toString() {
                return "hello";
        }

        public  void myMethod() {
                System.out.println("这是我自己的方法");
        }
        public static void myMethod1() {
                System.out.println("这是我自己的静态方法");
        }
        public abstract void myMethod2();
}
