package passage_14;

import java.util.function.Function;

/*计算阶乘*/
public class comprehensive_exercise_01 {
    Function<Long, Long> comprehensive_exercise_01 = n -> {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    };

    public static void main(String[] args) {
        comprehensive_exercise_01 f = new comprehensive_exercise_01();
        System.out.println(f.comprehensive_exercise_01.apply((long) 3));
    }
}
