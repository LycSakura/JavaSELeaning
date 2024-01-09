package study;

import java.util.Scanner;

/*
逢七过：从任意一个数开始，只要是包含7或是7的倍数的时候就输出，范围是1-100.
*/
public class video_test_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一开始的数字:");
        int num = sc.nextInt();
        for (int i = num; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
