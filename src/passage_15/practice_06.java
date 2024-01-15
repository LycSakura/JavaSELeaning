package passage_15;

import java.io.*;

/*从文件中读取《再别康桥》*/
public class practice_06 {
    public static void main(String[] args) {
        File file = new File("D:\\word.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp = null;
            for (int i = 1; (temp = bufferedReader.readLine()) != null; i++) {
                System.out.println(temp);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
