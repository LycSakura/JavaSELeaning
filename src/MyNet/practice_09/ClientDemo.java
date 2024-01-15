package MyNet.practice_09;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\java_project\\study\\study.iml"));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        socket.shutdownOutput();

        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String data = bufferedReader1.readLine();
        System.out.println("服务器的反馈: " + data);

        bufferedReader.close();
        socket.close();
    }
}
