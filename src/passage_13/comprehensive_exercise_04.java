package passage_13;

import java.util.Scanner;

/*权限设置*/
public class comprehensive_exercise_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        show();
        System.out.println("输入0~3查看权限：");
        POP pop = POP.getPop((sc.nextInt()));
        switch (pop) {
            case TOURIST -> System.out.println("观看部分视频、浏览所有课程、注册、登录");
            case USER -> System.out.println("免费观看所有视频、部分配套习题、收藏课程、实时提问、个人设置");
            case VIP -> System.out.println("免费观看所有视频、浏览所有习题和答案、源码下载、定期在线互动交流");
            case MANAGER -> System.out.println("后台所有管理模块、前台所有功能模块");
            default -> throw new IllegalStateException("Unexpected value: " + pop);
        }
        sc.close();
    }

    public static void show() {
        System.out.println("0 - 游客");
        System.out.println("1 - 注册用户");
        System.out.println("2 - VIP");
        System.out.println("3 - 管理员");

    }

}

enum POP {
    TOURIST, USER, VIP, MANAGER;

    public static POP getPop(int id) {
        return switch (id) {
            case 0 -> POP.TOURIST;
            case 1 -> POP.USER;
            case 2 -> POP.VIP;
            case 3 -> POP.MANAGER;
            default -> throw new IllegalStateException("Unexpected value: " + id);
        };
    }
}
