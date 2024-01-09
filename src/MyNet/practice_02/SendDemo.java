package MyNet.practice_02;

import java.io.IOException;
import java.net.*;

//UDP发送数据
public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        byte[] bys = "Hello,Java".getBytes();
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("192.168.1.15");
//        int port = 10086;
//        DatagramPacket datagramPacket = new DatagramPacket(bys,length,address,port);

        DatagramPacket datagramPacket = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.1.15"), 10086);

        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
