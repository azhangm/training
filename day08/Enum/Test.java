package Enum;

public class Test {
    public static void main(String[] args) {
//        ö�ٲ��� new ����
//        ���ж�����ǰ �������
//        Season season = Season.WINTER;
//        System.out.println(season);
//
//
//        //   �� ��֧�ṹ ���ʹ�� switch�еı������������� char String ö�١�
//
//        switch (season) {
//            case SPRING : System.out.println("��ӭ��������ĵ��");
//                          break;
//            case SUMMER :
//                System.out.println("ȥ�е±���");
//                break;
//            case AUTUMN:
//                System.out.println("ȥ��������ɽҶ");
//                break;
//            case WINTER:
//                System.out.println("ȥ�����������");
//                break;
//        }
//        ö�ٱ���������
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
//    �κ�ö���඼�̳��� Enum ��  //  4 - 3 = 1
        System.out.println(season.compareTo(season1));
        System.out.println(season2.compareTo(season1));
        System.out.println(season2.ordinal());
    }

}
