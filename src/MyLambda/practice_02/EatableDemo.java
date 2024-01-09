package MyLambda.practice_02;

public class EatableDemo {
    public static void main(String[] args) {
        Eatable e = new EatableImpl();
        useEatable(e);

        useEatable(() -> {
            System.out.println("一天一苹果，医生远离我");
        });

    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}
