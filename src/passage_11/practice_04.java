package passage_11;

import java.text.DecimalFormat;
import java.util.Scanner;

/*计算圆面积*/
public class practice_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入圆的半径:");
        double r = sc.nextDouble();
        simpleFormat("#.#####", area(r));
    }

    public static double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static void simpleFormat(String pattern, double value) {
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String output = myFormat.format(value);
        System.out.println("圆的面积:" + output);
    }

}
