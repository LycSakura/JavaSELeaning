package passage_8;

/*匿名类实现让小狗跑*/
public class comprehensive_exercise_4 {
    public static void main(String[] args) {
        Moveable dog = new Moveable() {
            @Override
            public void run() {
                System.out.println("小狗向前跑");
            }
        };
        dog.run();
    }
}

interface Moveable {
    void run();
}

