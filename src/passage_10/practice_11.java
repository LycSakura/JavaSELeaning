package passage_10;

import java.util.Scanner;

/*判断ABAB形式的数字*/
public class practice_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个4位数:");
        String number = sc.next();
        boolean flag = number.matches("(..)\\1");
        if (flag){
            System.out.println("ture");
        }else {
            System.out.println("false");
        }
    }
}
