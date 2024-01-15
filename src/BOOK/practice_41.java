package BOOK;

import java.util.Scanner;

/*购物车*/
public class practice_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要购买商品的数量:");
        int num = sc.nextInt();
        if (num >= 2) {
            System.out.println("（调用double num)你需要支付：" + pay(num * 1.0));
        } else {
            System.out.println("(调用int num)你需要支付：" + pay(num));
        }
        sc.close();
    }

    public static double pay(double num) {
        int price = 580;
        return price * num * 0.8;
    }

    public static int pay(int num) {
        int price = 580;
        return price * num;
    }

}

