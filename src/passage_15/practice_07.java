package passage_15;

import java.io.*;


/*记录圆周率数值*/
public class practice_07 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\word.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeDouble(Math.PI);
        fileOutputStream.close();
        dataOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        System.out.println("圆周率:" + dataInputStream.readDouble());
        fileInputStream.close();
        dataInputStream.close();

    }
}
