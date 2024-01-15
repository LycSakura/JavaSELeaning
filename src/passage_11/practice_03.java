package passage_11;

import java.util.Random;

/*求偶数和*/
public class practice_03 {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(30) + 2;
            sum += getRandon(num);
        }
        System.out.println(sum);
    }

    public static int getRandon(int num) {
        Random r = new Random();
        while (true) {
            if (num % 2 == 0) {
                break;
            } else {
                num = r.nextInt(30) + 2;
            }
        }
        return num;
    }
}
