package MyLambda.practice_04;

public class AddableDemo {
    public static void main(String[] args) {
//        useAddable((int x, int y) -> {
//            return x + y;
//        });

        useAddable(Integer::sum);
    }

    private static void useAddable(Addable e) {
        int add = e.add(1, 2);
        System.out.println(add);
    }

}
