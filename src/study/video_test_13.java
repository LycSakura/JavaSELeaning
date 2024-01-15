package study;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class video_test_13 {
    public static void main(String[] args) {
        HashMap<Student_13, String> hashMap = new HashMap<>();
        Student_13 s1 = new Student_13("张三", 18);
        Student_13 s2 = new Student_13("李四", 19);
        Student_13 s3 = new Student_13("王五", 20);
        Student_13 s4 = new Student_13("王五", 20);
        hashMap.put(s1, "广东");
        hashMap.put(s2, "北京");
        hashMap.put(s3, "上海");
        hashMap.put(s4, "广西");
        Set<Student_13> keySet = hashMap.keySet();
        for (Student_13 s : keySet) {
            String value = hashMap.get(s);
            System.out.println(s.getName() + "," + s.getAge() + "," + value);
        }
    }
}

class Student_13 {
    private String name;
    private int age;

    public Student_13() {
    }

    public Student_13(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student_13 student13 = (Student_13) o;

        if (age != student13.age) return false;
        return Objects.equals(name, student13.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}