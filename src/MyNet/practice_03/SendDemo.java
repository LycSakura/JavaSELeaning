package MyNet.practice_03;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象
        DatagramSocket datagramSocket = new DatagramSocket();

        //创建数据
        Scanner sc = new Scanner(System.in);
        while(true){
            String message = sc.nextLine();
            if("886".equals(message)){
                break;
            }
            //把数据打包
            byte[] bytes = message.getBytes();
            InetAddress name = InetAddress.getByName("127.0.0.1");
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, name, 10086);
            //发送数据
            datagramSocket.send(datagramPacket);
        }

        datagramSocket.close();
    }
}
