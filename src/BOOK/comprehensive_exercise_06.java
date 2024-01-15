package BOOK;

import java.util.Scanner;

/*判断成绩是否会及格*/
public class comprehensive_exercise_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入成绩:");
        int score = sc.nextInt();
        System.out.println(score >= 60 ? score + "能过" : score + "不能过");
        sc.close();
    }
}
