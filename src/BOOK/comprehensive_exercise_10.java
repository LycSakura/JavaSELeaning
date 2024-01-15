package BOOK;

import java.util.Scanner;

/*输出菱形*/
public class comprehensive_exercise_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个菱形的行数:（奇数）");
        int n = sc.nextInt();
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 1; j <= n / 2 + 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for (int i = n / 2; i >= 1; i--) {
            for (int j = 1; j <= n / 2 - i + 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
