package BOOK;

/*景区游客人数*/
public class comprehensive_exercise_37 {
    public static void main(String[] args) {
        Number people = new Number();
        for (int i = 1; i <= 7; i++) {
            people.add();
        }
        for (int i = 1; i <= 4; i++) {
            people.reduce();
        }
        people.output();
    }
}

interface Addable {
    void add();
}

interface Reducible {
    void reduce();
}

interface Changeable extends Addable, Reducible {
    int UNITS = 30;
}

class Number implements Changeable {
    static int number;

    @Override
    public void add() {
        number = number + Changeable.UNITS;
    }

    @Override
    public void reduce() {
        number = number + Changeable.UNITS;
    }

    public void output() {
        System.out.println("景区里还有:" + number + "个人");
    }

}
