package BOOK;

/*统计粮仓的粮食*/

public class practice_01 {
    static final double pi = 3.14;//声明常量(final)

    public static void main(String[] args) {
        double v;//粮仓的体积
        int h = 3, d = 10;//高是3米 ， 直径是10米
        v = pi * (d / 2.0) * (d / 2.0) * h;
        System.out.println("粮仓的体积：" + v + "立方米");
        //每立方米储存750千克的食物
        System.out.println("粮仓可以储存" + v * 750 + "千克食物");
    }
}
