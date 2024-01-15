package BOOK;

import java.util.Scanner;

/*计算矩形面积*/
public class comprehensive_exercise_27 {
    private double x;
    private double y;


    public comprehensive_exercise_27(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double size() {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入长:");
        double x = sc.nextDouble();
        System.out.print("请输入宽:");
        double y = sc.nextDouble();
        comprehensive_exercise_27 s = new comprehensive_exercise_27(x, y);
        System.out.print("该矩形的面积是:" + s.size());
        sc.close();
    }
}
