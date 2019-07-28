package com.mode.Observer;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/7/27
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
