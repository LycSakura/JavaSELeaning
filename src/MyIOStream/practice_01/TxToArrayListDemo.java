package MyIOStream.practice_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\java_project\\study\\code\\src\\MyIOStream\\practice_01\\array.txt"));

        ArrayList<String> arrayList = new ArrayList<>();

        String str;
        while ((str = bufferedReader.readLine()) != null) {
            arrayList.add(str);
        }
        bufferedReader.close();

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
