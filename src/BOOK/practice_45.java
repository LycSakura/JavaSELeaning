package BOOK;

/*教师与学生*/
public class practice_45 {
    public static void main(String[] args) {
        print(new People());
        print(new Student());
        print(new Teacher());
    }

    public static void print(People s) {
        if (s instanceof Student) {
            System.out.println("学生要好好学习");
        } else if (s instanceof Teacher) {
            System.out.println("教师要认真授课");
        } else {
            System.out.println("每个人都要工作");
        }
    }

}

class People {

}

class Student extends People {

}

class Teacher extends People {

}