package study;

import java.util.TreeSet;

public class video_test_11 {
    public static void main(String[] args) {
        TreeSet<Student_11> treeSet = new TreeSet<>();

        Student_11 s1 = new Student_11("张三", 90, 100);
        Student_11 s2 = new Student_11("李四", 92, 98);
        Student_11 s3 = new Student_11("王五", 81, 96);
        Student_11 s4 = new Student_11("赵六", 89, 86);
        Student_11 s5 = new Student_11("七七", 98, 99);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        System.out.println("姓名\t\t语文\t\t数学\t\t总分");
        for (Student_11 s : treeSet) {
            System.out.println(s.getName() + "\t\t" + s.getChinese() + "\t" + s.getMath() + "\t" + s.getSum());
        }
    }
}


class Student_11 implements Comparable<Student_11> {
    private final String name;
    private final double Chinese;
    private final double math;

    public Student_11(String name, double chinese, double math) {
        this.name = name;
        Chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public double getChinese() {
        return Chinese;
    }

    public double getMath() {
        return math;
    }

    public double getSum() {
        return this.Chinese + this.math;
    }


    @Override
    public int compareTo(Student_11 s) {
        double num = s.getSum() - this.getSum();
        return num == 0 ? this.name.compareTo(s.name) : (int) num;
    }
}

