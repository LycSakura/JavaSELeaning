package passage_15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class comprehensive_exercise_02 {
    public static void main(String[] args) {
        File file = new File("D:\\word.txt");
        File dir = new File("C:\\Windows");
        File[] files = dir.listFiles();
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if (files != null) {
                for (File f : files) {
                    bufferedWriter.write(f.getAbsolutePath());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
