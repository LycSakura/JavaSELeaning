package passage_10;

import java.util.Scanner;

/*模拟员工打卡*/
public class practice_8 {
    public static void main(String[] args) {
        int flag = 0;
        String[] str = {"张三", "李四", "王五", "赵六", "周七", "王哲", "白浩", "贾蓉", "慕容阿三", "黄蓉"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字:");
        String name = sc.next();
        for (int i = 0; i < str.length; i++) {
            if (name.equals(str[i])) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("打卡成功");
        } else {
            System.out.println("员工不存在");
        }
    }
}
