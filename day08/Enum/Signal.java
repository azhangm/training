package day08.Enum;

public enum Signal {
    RED {
        @Override
        public void prompt() {
            System.out.println("���ͣ");
        }
    },YELLOW {
        @Override
        public void prompt() {
            System.out.println("�۲��·���");
        }
    },GREEN{
        @Override
        public void prompt() {
            System.out.println("�̵���");
        }
    };
    public abstract void prompt();
}
