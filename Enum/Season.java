package Enum;
/*
* ö�� �� ��һ�������еĶ����оٳ��� ��Ϊ ö��
*  ������ ��˵ һ���� ���Դ�������������
*  ö����һ�������� ���ܴ����Ķ�����������޵�
* */
public enum Season {

        SPRING(100) {
                @Override
                public void myMethod2() {
                        System.out.println("���󷽷�");
                }
        },SUMMER {
                @Override
                public void myMethod2() {
                        System.out.println("���󷽷�");
                }
        },AUTUMN{
                @Override
                public void myMethod2() {
                        System.out.println("���󷽷�");
                }
        },WINTER{
                @Override
                public void myMethod2() {
                        System.out.println("���󷽷�");
                }
        };
        static {
                System.out.println("��̬��ʼ�������");
        }

        Season() {
        }

        Season(int a) {
                this.a = a;
        }

        {

                System.out.println("��ʼ�������");
        }
        int a = 0;
        @Override
        public String toString() {
                return "hello";
        }

        public  void myMethod() {
                System.out.println("�������Լ��ķ���");
        }
        public static void myMethod1() {
                System.out.println("�������Լ��ľ�̬����");
        }
        public abstract void myMethod2();
}
