package com.mode.Observer;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/7/27
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
