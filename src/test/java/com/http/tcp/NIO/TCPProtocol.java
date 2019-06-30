package com.http.tcp.NIO;

import java.io.IOException;
import java.nio.channels.SelectionKey;

/**
 * 类功能说明:这里为了使不同协议都能方便地使用这个基本的服务模式，我们把信道中与具体协议相关的处理各种I/O的操作分离了出来
 * 类修改者	创建日期2019/3/19
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public interface TCPProtocol  {
    //accept I/O形式
    void handleAccept(SelectionKey key) throws IOException;
    //read I/O形式
    void handleRead(SelectionKey key) throws IOException;
    //write I/O形式
    void handleWrite(SelectionKey key) throws IOException;

}
