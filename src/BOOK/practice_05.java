package BOOK;

/*计算机车加速度*/
public class practice_05 {
    public static void main(String[] args) {
        int v1 = 100;//末速度
        int v2 = 0;//初速度
        double t = 8.7;//时间
        double v = (v1 - v2) / t;
        System.out.println("平均加速度:" + v);
    }
}
