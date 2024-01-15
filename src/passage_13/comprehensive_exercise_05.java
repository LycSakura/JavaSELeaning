package passage_13;

/*体检记录*/
public class comprehensive_exercise_05<A, B, C> {
    A a;
    B b;
    C c;

    public comprehensive_exercise_05(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        comprehensive_exercise_05<Integer, Integer, Integer> date = new comprehensive_exercise_05<>(2023, 8, 14);
        System.out.println(date.a + "年" + date.b + "月" + date.c + "号");
        comprehensive_exercise_05<String, Integer, Sex> tom = new comprehensive_exercise_05<>("tom", 170, Sex.male);
        System.out.println(tom.a + " " + tom.b + "cm " + tom.c);
    }
}

enum Sex {
    male, female
}

