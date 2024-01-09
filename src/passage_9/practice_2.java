package passage_9;

import java.util.InputMismatchException;
import java.util.Scanner;

/*校验银行取款金额*/
public class practice_2 {
    final static double total = 1023.79;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("输入你要取走的金额:");
            int money = sc.nextInt();
            double result = 0;
            result = total - money;
            if (result >= 0) {
                System.out.println("你的余额:" + (float)result);
            } else {
                System.out.println("你的余额不足");
            }
        } catch (InputMismatchException e) {
            System.out.println("数字格式转换异常");
        } finally {
            sc.close();
        }
    }
}
