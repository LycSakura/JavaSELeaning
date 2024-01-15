package BOOK;

import java.util.Scanner;

/*划分成绩等级*/
public class practice_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的成绩:");
        double score = sc.nextDouble();
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("良好");
        } else if (score >= 60 && score < 80) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }
        sc.close();
    }
}