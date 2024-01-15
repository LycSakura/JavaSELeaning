package BOOK;

/*无重复组合*/
public class comprehensive_exercise_12 {
    public static void main(String[] args) {
        int a = 4, b = 7;
        int sum, count = 0;
        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                for (int k = a; k <= b; k++) {
                    sum = i * 100 + j * 10 + k;
                    if (i != j && j != k && i != k) {
                        count++;
                        System.out.println(sum);
                    }
                }
            }
        }
        System.out.println("共有" + count + "个");
    }
}
