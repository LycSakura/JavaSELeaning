package BOOK;

/*餐馆点餐*/
public class comprehensive_exercise_32 {
    public static void main(String[] args) {
        Guess s1 = new Teachers("老师");
        Teachers teachers = (Teachers)s1;
        teachers.order();
        Guess s2 = new Students("学生");
        Students students = (Students)s2;
        students.order();
        Guess s3 = new Doctor("医生");
        Doctor doctor = (Doctor)s3;
        doctor.order();

    }
}

interface Order {
    void order();
}

abstract class Guess {
    String name;

    public Guess() {
    }

    public Guess(String name) {
        this.name = name;
    }
}

class Teachers extends Guess implements Order {
    @Override
    public void order() {
        System.out.println(name+"点了”鱼香肉丝“");
    }

    public Teachers(String name) {
        super(name);
    }
}

class Students extends Guess implements Order {
    @Override
    public void order() {
        System.out.println(name+"点了”火腿炒面“");
    }

    public Students(String name) {
        super(name);
    }
}

class Doctor extends Guess implements Order {
    @Override
    public void order() {
        System.out.println(name+"点了”麻辣香锅“");
    }

    public Doctor(String name) {
        super(name);
    }
}