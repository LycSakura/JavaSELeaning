package MyNet.practice_09;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        while (true) {
            Socket socket = serverSocket.accept();
//            为每一个客户端开一个线程
            new Thread(new ServerThread(socket)).start();
        }
    }
}
