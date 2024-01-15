package passage_10;

import java.util.Scanner;

/*用户名校验*/
public class comprehensive_exercise_8 {
    public static void main(String[] args) {
        int flag = 0;
        String[] ID = {"mrsoft", "mr", "miss", "Admin"};
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的用户名:");
        String name = sc.next();
        for (int i = 0; i < ID.length; i++) {
            if (name.equals(ID[i])) {
                System.out.println("注册失败，该用户名已被使用.");
                flag = 1;
            }
        }
        if (flag != 1) {
            System.out.println("注册成功");
        }
    }
}
