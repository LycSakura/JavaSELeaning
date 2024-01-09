package MyLambda.practice_03;

public class FlyableDemo {
    public static void main(String[] args) {
//        useFlyable((String s) -> {
//            System.out.println(s);
//        });
        useFlyable(System.out::println);

    }

    private static void useFlyable(Flyable flyable) {
        flyable.fly("小飞棍来喽");
    }

}
