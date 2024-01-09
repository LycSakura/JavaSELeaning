package passage_9;

import java.util.Scanner;

/*超市限购*/
public class practice_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("输入你想要购买鸡蛋的克数:");
            double kilo = sc.nextDouble();
            System.out.println("你要付的金额:" + (float)result(kilo));
        } catch (MyException e) {
            System.out.println(e);
        }finally {
            sc.close();
        }
    }

    static double result(double kilo) throws MyException {
        if (kilo > 1500) {
            throw new MyException("你购买的重量已超出1500克");
        }
        return (kilo / 500 * 3.98);
    }
}
