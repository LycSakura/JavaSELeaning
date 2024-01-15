package MyIOStream.practice_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        //创建ArrayList集合
        ArrayList<Student> arrayList = new ArrayList<>();
        //创建学生类对象
        Student s1 = new Student("001", "林青霞", 30, "西安");
        Student s2 = new Student("002", "张曼玉", 35, "武汉");
        Student s3 = new Student("003", "王祖贤", 33, "郑州");
        //把学生类添加到集合中
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        //创建字符缓冲流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\java_project\\study\\code\\src\\MyIOStream\\practice_02\\students.txt"));
        //遍历集合，得到每一个学生对象
        for (Student s : arrayList) {
            //把学生对象的数据拼接城指定格式的字符串
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(',').append(s.getAddress());
//            //写入数据
//            bufferedWriter.write(stringBuilder.toString());
            //整合重构
            bufferedWriter.write(s.getId() + "," + s.getName() + "," + s.getAge() + ',' + s.getAddress());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
}
