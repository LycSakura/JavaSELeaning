package MyNet.practice_05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务端socket对象
        ServerSocket serverSocket = new ServerSocket(10086);
        //监听客户端连接，返回socket对象
        Socket socket = serverSocket.accept();
        //获取输入流对象，读数据，并把数据显示在控制台
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("服务器: " + data);
        //给出反馈
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("数据已收到".getBytes());

        serverSocket.close();
    }
}
