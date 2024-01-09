package BOOK;

import java.util.Scanner;

/*计算商和余数*/
public class comprehensive_exercise_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个整数:");
        int num = sc.nextInt();
        while (num > 0) {
            System.out.print(num % 10);
            num = num / 10;
        }
        sc.close();
    }
}
