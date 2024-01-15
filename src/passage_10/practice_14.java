package passage_10;

import java.util.Scanner;

/*屏蔽手机号中间的四位数*/
public class practice_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入手机号:");
        String number = sc.next();
        StringBuilder num = new StringBuilder(number);
        num.replace(3, 7, "****");
        System.out.println("隐藏前" + number + "\n隐藏后" + num.toString());
    }
}
