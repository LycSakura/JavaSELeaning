package passage_10;

import java.util.Scanner;

/*截取QQ号*/
public class practice_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要截取的QQ邮箱:");
        String qqMial = sc.next();
        int index = qqMial.indexOf('@');
        String qqNUm = qqMial.substring(0, index);
        System.out.println("QQ号是:" + qqNUm);
        sc.close();
    }
}
