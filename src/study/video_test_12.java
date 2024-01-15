package study;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class video_test_12 {
    public static void main(String[] args) {
        HashMap<String, Student_12> hashMap = new HashMap<>();
        Student_12 s1 = new Student_12("张三", 18);
        Student_12 s2 = new Student_12("李四", 19);
        Student_12 s3 = new Student_12("王五", 20);
        hashMap.put("001", s1);
        hashMap.put("002", s2);
        hashMap.put("003", s3);

        /*法一*/
        Set<String> keySet = hashMap.keySet();
        for (String s : keySet) {
            System.out.println(s + "," + hashMap.get(s).getName() + "," + hashMap.get(s).getAge());
        }
        System.out.println("----------");
        /*法二*/
        Set<Map.Entry<String, Student_12>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Student_12> s : entrySet) {
            System.out.println(s.getKey() + "," + s.getValue().getName() + "," + s.getValue().getAge());
        }
    }
}

class Student_12 {
    private String name;
    private int age;

    public Student_12() {
    }

    public Student_12(String name, int age) {
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
}

