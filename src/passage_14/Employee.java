package passage_14;

import java.util.ArrayList;
import java.util.List;

/*
    创建员工类
*/
public class Employee {
    private String name;
    private int age;
    private double salary;
    private String sex;
    private String dept;

    public Employee(String name, int age, double salary, String sex, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "name=" + name + ",age=" + age + ",salary=" + salary + ",sex=" + sex + ",dept=" + dept;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getSex() {
        return sex;
    }

    public String getDept() {
        return dept;
    }

    static List<Employee> getEmoList() {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("老张", 40, 9000, "男", "运营部"));
        list.add(new Employee("小刘", 24, 5000, "女", "开发部"));
        list.add(new Employee("大刚", 32, 7500, "男", "销售部"));
        list.add(new Employee("翠花", 28, 5500, "女", "销售部"));
        list.add(new Employee("小马", 21, 3000, "男", "开发部"));
        list.add(new Employee("老王", 35, 6000, "女", "人事部"));
        list.add(new Employee("小王", 21, 3000, "女", "人事部"));
        return list;
    }
}
