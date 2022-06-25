package day11;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/*
* 简单单例模式
* 懒汉式
* */
public class Signal {
    private static Signal signal = new Signal();
    private Signal(){}
    public static Signal getInstance() {
        return signal;
    }
}
