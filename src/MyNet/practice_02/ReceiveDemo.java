package MyNet.practice_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(10086);

        byte[] bys = new byte[1024];

        DatagramPacket datagramPacket = new DatagramPacket(bys, bys.length);
        datagramSocket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        String dataString = new String(data, 0, length);

        System.out.println(dataString);
        datagramSocket.close();
    }
}
