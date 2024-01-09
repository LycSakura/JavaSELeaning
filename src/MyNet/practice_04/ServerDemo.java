package MyNet.practice_04;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        byte[] bys = new byte[1024];
        int len = inputStream.read(bys);
        String s = new String(bys, 0, len);

        System.out.println(s);

        inputStream.close();
        serverSocket.close();
    }
}
