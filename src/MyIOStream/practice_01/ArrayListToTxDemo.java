package MyIOStream.practice_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\java_project\\study\\code\\src\\MyIOStream\\practice_01\\array.txt"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./array.txt"));
        for (String s : arrayList) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();
    }
}
