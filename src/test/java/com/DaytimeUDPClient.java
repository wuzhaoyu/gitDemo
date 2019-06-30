package com;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 类功能说明:UDP协议
 * 类修改者	创建日期2019/3/18
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class DaytimeUDPClient {

        private final static int PORT = 13;
        private static final String HOSTNAME = "www.xdysite.cn";


        public  static void main(String[] args) {
            //建立udp的服务
            DatagramSocket datagramSocket = null;
            try {
                datagramSocket = new DatagramSocket();

            //准备数据，把数据封装到数据包中。
            String data = "这个是我第一个udp的例子..";
            //创建了一个数据包
                InetAddress address = InetAddress.getByName("127.0.0.1");
            DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length,address , 9090);
            //调用udp的服务发送数据包
            datagramSocket.send(packet);
            //关闭资源 ---实际上就是释放占用的端口号
            datagramSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
