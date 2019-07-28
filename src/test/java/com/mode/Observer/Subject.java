package com.mode.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 类功能说明:  广播 连接client与解绑client的纽带
 * 类修改者	创建日期2019/7/27
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
