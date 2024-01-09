package BOOK;

import java.util.Scanner;

/*判断奇偶数*/
public class comprehensive_exercise_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数:");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + "是偶数");
        } else {
            System.out.println(x + "是奇数");
        }
        sc.close();
    }
}
