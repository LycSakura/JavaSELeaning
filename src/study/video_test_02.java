package study;

import java.util.Scanner;

/*
斐波那契数列
1 1 2 3 5 ...
*/
public class video_test_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入月数:");
        int month = sc.nextInt();
        int[] arr = new int[month+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < month+1; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        for (int i = 0; i < month+1; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
