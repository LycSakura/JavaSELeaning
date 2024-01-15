package passage_11;

import java.util.Scanner;

/*边长可变的正方形*/
public class practice_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入正方形边长的长度:");
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (i == 0 || i == l - 1 || j == 0 || j == l - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
