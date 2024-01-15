package study;

import java.util.HashSet;

public class video_test_10 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();

        Student s1 = new Student("张三");
        Student s2 = new Student("李四");
        Student s3 = new Student("王五");

        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);

        for (Student s : hashSet) {
            System.out.println(s.getName());
        }
    }
}

