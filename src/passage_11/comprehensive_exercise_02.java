package passage_11;

/*勾股数*/
public class comprehensive_exercise_02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                for (int k = 1; k <= 100; k++) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2) && i <= j && j <= k) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
