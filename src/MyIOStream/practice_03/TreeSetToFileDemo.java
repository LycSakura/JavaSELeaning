package MyIOStream.practice_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        //创建treeSet集合，通过比较器排序进行排序
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //成绩总分从高到低
                int result = (int) (s2.getSum() - s1.getSum());
                //次要条件
                int num1 = result == 0 ? (int) (s1.getChinesScore() - s2.getChinesScore()) : result;
                int num2 = num1 == 0 ? (int) (s1.getMathScore() - s2.getMathScore()) : num1;
                return num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
            }
        });
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "个学生信息");

            System.out.println("姓名");
            String name = sc.nextLine();
            System.out.println("语文成绩");
            double ChineseScore = sc.nextDouble();
            System.out.println("数学成绩");
            double MathScore = sc.nextDouble();
            System.out.println("英语成绩");
            double EnglishScore = sc.nextDouble();

            Student s = new Student();
            s.setName(name);
            s.setChinesScore(ChineseScore);
            s.setMathScore(MathScore);
            s.setEnglishScore(EnglishScore);

            treeSet.add(s);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\java_project\\study\\code\\src\\MyIOStream\\practice_03\\students.txt"));
        for (Student s : treeSet) {
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder message = stringBuilder.append(s.getName()).append(",").append(s.getChinesScore()).append(",").append(s.getMathScore()).append(",").append(s.getEnglishScore());
//            String message = s.getName() + "," + s.getChinesScore() + "," + s.getMathScore() + "," + s.getEnglishScore();
            bufferedWriter.write(message.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
}
