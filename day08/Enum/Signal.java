package day08.Enum;

public enum Signal {
    RED {
        @Override
        public void prompt() {
            System.out.println("红灯停");
        }
    },YELLOW {
        @Override
        public void prompt() {
            System.out.println("观察道路情况");
        }
    },GREEN{
        @Override
        public void prompt() {
            System.out.println("绿灯行");
        }
    };
    public abstract void prompt();
}
