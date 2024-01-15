package study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class video_test_09 {
    public static void main(String[] args) {
        Collection<Student> set = new ArrayList<Student>();
        set.add(new Student("张三"));
        set.add(new Student("李四"));
        set.add(new Student("王五"));
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

