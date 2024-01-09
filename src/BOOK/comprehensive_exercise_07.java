package BOOK;

/*话费充值*/
public class comprehensive_exercise_07 {
    public static void main(String[] args) {
        int total = 10;
        double cost1 = 30 * 0.2;
        double cose2 = 10 * 0.3;
        System.out.println("通话余额：" + (total - cost1 - cose2) / 0.2 + "分钟");
    }
}
