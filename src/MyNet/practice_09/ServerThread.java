package MyNet.practice_09;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            int count = 0;
            File file = new File("D:\\java_project\\study\\code\\src\\MyNet\\practice_09\\Copy[" + count + "].txt");
            while (file.exists()) {
                count++;
                file = new File("D:\\java_project\\study\\code\\src\\MyNet\\practice_09\\Copy[" + count + "].txt");
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

            BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter1.write("文件上传成功");
            bufferedWriter1.newLine();
            bufferedWriter1.flush();

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
