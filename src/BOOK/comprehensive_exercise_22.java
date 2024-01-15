package BOOK;

import java.util.Scanner;

/*简易计算机*/
public class comprehensive_exercise_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入第一个数");
        double x = sc.nextDouble();
        String ch = sc.nextLine();//回车键
        System.out.print("输入操作符");
        String op = sc.nextLine();
        System.out.print("输入第二个数");
        double y = sc.nextDouble();
        System.out.print(x + op + y + "=" + calc(x, y, op));
        sc.close();
    }

    public static double calc(double x, double y, String op) {
        double num = 0;
        switch (op) {
            case "+" -> num = x + y;
            case "-" -> num = x - y;
            case "*" -> num = x * y;
            case "/" -> {
                if (y != 0) {
                    num = x / y;
                } else {
                    System.out.println("除数不能为零");
                }
            }
            default -> System.out.println("无法计算");
        }
        return num;
    }
}
