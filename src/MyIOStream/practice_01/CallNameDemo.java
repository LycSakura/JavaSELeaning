package MyIOStream.practice_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\java_project\\study\\code\\src\\MyIOStream\\practice_01\\names.txt"));
        ArrayList<String> arrayList = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            arrayList.add(line);
        }
        bufferedReader.close();
        Random random = new Random();
        int i = random.nextInt(arrayList.size());
        String name = arrayList.get(i);
        System.out.println("幸运者是: " + name);
    }
}
