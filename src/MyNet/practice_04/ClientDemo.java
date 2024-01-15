package MyNet.practice_04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;


//TCP
public class ClientDemo {
    public static void main(String[] args) throws IOException {
//        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 10086);
        Socket socket = new Socket("127.0.0.1", 10086);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello,tcp".getBytes());

        outputStream.close();
        socket.close();
    }
}
