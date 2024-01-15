package BOOK;

import java.util.Scanner;

/*成绩排名2*/
public class practice_22 {
    public static void main(String[] args) {
        int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数n:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("输入" + n + "个数");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        sc.close();
    }
}
