package BOOK;

import java.util.Scanner;

/*判断生肖*/
public class comprehensive_exercise_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个年份:");
        int year = sc.nextInt();
        switch (year % 12) {
            case 1 -> System.out.println("该年是鸡年");
            case 2 -> System.out.println("该年是狗年");
            case 3 -> System.out.println("该年是猪年");
            case 4 -> System.out.println("该年是鼠年");
            case 5 -> System.out.println("该年是牛年");
            case 6 -> System.out.println("该年是虎年");
            case 7 -> System.out.println("该年是兔年");
            case 8 -> System.out.println("该年是龙年");
            case 9 -> System.out.println("该年是蛇年");
            case 10 -> System.out.println("该年是马年");
            case 11 -> System.out.println("该年是羊年");
            case 0 -> System.out.println("该年是候年");
            default -> System.out.println("请输入规范的年份");
        }
        sc.close();
    }
}
