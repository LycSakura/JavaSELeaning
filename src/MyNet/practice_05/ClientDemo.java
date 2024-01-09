package MyNet.practice_05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10086);

        //写数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,tpc".getBytes());

        //接收服务器反馈
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("客户端: " + data);

        socket.close();
    }
}
