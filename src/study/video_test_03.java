package study;

import java.util.Scanner;

/*百钱百鸡:鸡公5钱1只，鸡母3钱1只，小鸡1钱3只*/
public class video_test_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你买鸡的金额:");
        int money = sc.nextInt();
        for (int x = 0; x <= money/5; x++) {//鸡公的范围
            for (int y = 0; y <= money/3; y++) {//鸡母的范围
                int z = money - x - y;//小鸡的个数
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == money) {
                    System.out.println(x + "," + y + "," + z);
                }
            }
        }
        sc.close();
    }
}
