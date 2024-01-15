package passage_11;

import java.util.Scanner;

/*模拟用户登录*/
public class practice_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的用户名");
        String name = sc.next();
        System.out.println("输入你的密码:");
        String password = sc.next();
        if (name.equals("mr") && password.equals("123456")) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
