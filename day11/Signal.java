package day11;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/*
* �򵥵���ģʽ
* ����ʽ
* */
public class Signal {
    private static Signal signal = new Signal();
    private Signal(){}
    public static Signal getInstance() {
        return signal;
    }
}
