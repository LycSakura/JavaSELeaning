package passage_15;

import java.io.*;
import java.util.Scanner;

/*数字加密*/
public class practice_08 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\word.txt");

        System.out.println("输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeInt(((num * 2 - 11) * 3 + 17));
        fileOutputStream.close();
        dataOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        int encryptedNum = dataInputStream.readInt();
        System.out.println("加密后:" + encryptedNum);
        int decryptedNum = ((encryptedNum - 17) / 3 + 11) / 2;
        System.out.println("解密后:" + decryptedNum);
        fileInputStream.close();
        dataInputStream.close();
    }
}
