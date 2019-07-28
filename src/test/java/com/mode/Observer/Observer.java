package com.mode.Observer;

/**
 * 类功能说明: 观察者
 * 类修改者	创建日期2019/7/27
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public abstract  class Observer {

    protected Subject subject;
    public abstract void update();
}
