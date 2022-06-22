package Enum;

public class Test {
    public static void main(String[] args) {
//        枚举不能 new 对象
//        所有对象都提前 定义好了
//        Season season = Season.WINTER;
//        System.out.println(season);
//
//
//        //   和 分支结构 配合使用 switch中的变量可以是正数 char String 枚举。
//
//        switch (season) {
//            case SPRING : System.out.println("欢迎来洛阳赏牡丹");
//                          break;
//            case SUMMER :
//                System.out.println("去承德避暑");
//                break;
//            case AUTUMN:
//                System.out.println("去北京看红山叶");
//                break;
//            case WINTER:
//                System.out.println("去哈尔滨玩冰雕");
//                break;
//        }
//        枚举本质上是类
        Season season = Season.WINTER;  //4
        Season season1 = Season.AUTUMN; // 3
        Season season2 = Season.SPRING; // 3
        season.a = 100;
        season.myMethod2();
        System.out.println(season.a);
        System.out.println(season2.a);
        season.myMethod();
        Season.myMethod1();
        System.out.println(season);
        System.out.println(season1);
        System.out.println(season2);
//    任何枚举类都继承于 Enum 类  //  4 - 3 = 1
        System.out.println(season.compareTo(season1));
        System.out.println(season2.compareTo(season1));
        System.out.println(season2.ordinal());
    }

}
