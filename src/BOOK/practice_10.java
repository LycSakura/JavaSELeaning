package BOOK;

import java.util.Scanner;

public class practice_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个月份:");
        int month = sc.nextInt();
        switch (month) {
            case 12, 1, 2 -> System.out.println("冬季");
            case 3, 4, 5 -> System.out.println("春季");
            case 6, 7, 8 -> System.out.println("夏季");
            case 9, 10, 11 -> System.out.println("秋季");
            default -> System.out.println("请输入合理月份");
        }
    }
}
