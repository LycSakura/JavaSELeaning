package passage_10;

import java.util.Scanner;

/*转置字符串*/
public class comprehensive_exercise_5 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串:");
        String str = sc.next();
        String[] s1 = new String[str.length()];
        for (i = 0, j = str.length() - 1; i <= j; i++, j--) {
            char a = str.charAt(i);
            char b = str.charAt(j);
            s1[i] = b + "";
            s1[j] = a + "";
        }
        System.out.println("反转后");
        for (i = 0; i < s1.length; i++) {
            System.out.print(s1[i]);
        }
        System.out.println("\n-------");
        char[] chr = str.toCharArray();
        System.out.println("反转后");
        for (i = chr.length - 1; i >= 0; i--) {
            System.out.print(chr[i]);
        }
        sc.close();
    }
}
