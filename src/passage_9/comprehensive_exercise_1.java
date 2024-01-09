package passage_9;

import java.util.Scanner;

/*越界引发异常*/
public class comprehensive_exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("输入4个数：");
        try {
            for (int i = 0; i <= 3; i++) {
                arr[i] = sc.nextInt();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}
