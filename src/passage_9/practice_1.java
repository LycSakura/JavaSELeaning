package passage_9;

import java.util.InputMismatchException;
import java.util.Scanner;

/*简易计算机*/
public class practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("输入第一个数");
            int num1 = sc.nextInt();

            System.out.println("输入操作符");
            String symbol = sc.next();

            System.out.println("输入第二个数");
            int num2 = sc.nextInt();

            int result = 0;

            switch (symbol) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("除数不能为0");
                        return;
                    }
                }
            }
            System.out.println("计算结果" + result);
        } catch (InputMismatchException ime) {
            System.out.println("报错结果" + ime.toString() + "\n输入的数不是整数");
        }
        sc.close();
    }
}
