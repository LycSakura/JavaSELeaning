package BOOK;

import java.util.Scanner;

/*创建数学工具类*/
public class practice_32 {
    public static void main(String[] args) {
        practice_32 math = new practice_32();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个浮点数:");
        double num = sc.nextDouble();
        System.out.println(num + "的四次方:" + math.pow(num));
        sc.close();
    }

    public double pow(double num) {
        return num * num * num * num;
    }
}
