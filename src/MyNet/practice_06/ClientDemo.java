package MyNet.practice_06;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);
        //数据来源于键盘输入
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        socket.close();
    }
}
