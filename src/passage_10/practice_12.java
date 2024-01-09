package passage_10;

import java.util.Scanner;

/*校验密码复杂程度*/
public class practice_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要设置的密码:");
        String s = sc.next();
        if (check(s)) {
            System.out.println("此密码符合要求!");
        } else {
            System.out.println("请按要求重新设置密码......");
        }

    }

    public static boolean check(String str) {

        if (!str.matches("[a-zA-Z0-9]{8,20}")) {
            System.out.println("密码要有8-20位");
            return false;
        }

        int count = 0;

        if (str.matches(".*[a-z].*"))
            count++;

        if (str.matches(".*[A-Z].*"))
            count++;

        if (str.matches(".*[0-9].*"))
            count++;

        if (count < 2) {
            System.out.println("密码至少要有两种形式");
            return false;
        } else
            return true;
    }
}
