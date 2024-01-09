package passage_9;

import java.util.Scanner;

/*计算最大公约数*/
public class comprehensive_exercsie_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入两个整数:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try {
            juge(num1, num2);
            System.out.println(num1 + "和" + num2 + "的最大公约数是" + fact(num1, num2));
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    static void juge(int num1, int num2) throws MyException {
        if (num1 < 0 || num2 < 0) {
            throw new MyException("不可以使用负数");
        }
    }

    static int fact(int num1, int num2) {
        int result = 1;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                result = i;
            }
        }
        return result;
    }
}


/*计算最大公约数*/
//public class comprehensive_exercsie_6 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入两个整数:");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        try {
//            juge(num1, num2);
//            System.out.println(num1 + "和" + num2 + "的最大公约数是" + fact(num1, num2));
//        } catch (MyException e) {
//            e.printStackTrace();
//        } finally {
//            sc.close();
//        }
//
//    }
//
//    static void juge(int num1, int num2) throws MyException {
//        if (num1 < 0 || num2 < 0) {
//            throw new MyException("不可以使用负数");
//        }
//    }
//
//    static int fact(int num1, int num2) {
//        int result = 1;
//        int min = Math.min(num1, num2);
//        for (int i = min; i >= 1; i--) {
//            if (num1 % i == 0 && num2 % i == 0) {
//                result = i;
//                break;
//            }
//        }
//        return result;
//    }
//}


