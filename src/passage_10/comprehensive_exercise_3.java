package passage_10;

import java.util.Scanner;

/*判断后缀名*/
public class comprehensive_exercise_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入文件名字符串:");
        String str = sc.next();
        judge(str);
    }

    public static void judge(String str) {
        if (str.lastIndexOf(".MP4") != -1 || str.lastIndexOf(".mp4") != -1) {
            System.out.println("该文件是MP4格式");
        } else {
            System.out.println("该文件不是MP4格式");
        }
    }
}
