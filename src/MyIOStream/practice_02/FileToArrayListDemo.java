package MyIOStream.practice_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\java_project\\study\\code\\src\\MyIOStream\\practice_02\\students.txt"));
        ArrayList<Student> arrayList = new ArrayList<>();
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            String[] strArray = str.split(",");
            Student s = new Student();
            s.setId(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(Integer.parseInt(strArray[2]));
            s.setAddress(strArray[3]);

            arrayList.add(s);
        }
        bufferedReader.close();
        for (Student s : arrayList) {
            System.out.println(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
        }
    }
}
