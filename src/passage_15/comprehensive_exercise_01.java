package passage_15;

import java.io.*;

public class comprehensive_exercise_01 {
    public static void main(String[] args) throws IOException {
        MyReader myReader = new MyReader();
        myReader.read();
    }
}

class MyReader {
    void read() throws IOException {
        File file = new File("D:\\java_project\\study\\code\\src\\passage_15\\comprehensive_exercise_01.java");

        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp = null;
            while ((temp = bufferedReader.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
