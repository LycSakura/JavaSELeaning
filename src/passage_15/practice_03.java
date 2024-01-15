package passage_15;

import java.io.*;

/*记录古诗*/
public class practice_03 {
    public static void main(String[] args) {
        File file = new File("D:\\word.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            String word = "《春晓》\n春眠不觉晓,\n处处闻啼鸟.\n夜来风雨声,\n花落知多少.";
            fileWriter.write(word);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fileReader = new FileReader(file);
            char[] ch = new char[1024];
            int len = fileReader.read(ch);
            System.out.println(new String(ch, 0, len));
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
