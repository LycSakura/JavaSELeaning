package MyNet.practice_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端数据
        DatagramSocket datagramSocket = new DatagramSocket(10086);
        while (true) {
            //创建数据包
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            //接收数据
            datagramSocket.receive(datagramPacket);
            //解析数据
            System.out.println("数据是: " + new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
        }
    }
}
