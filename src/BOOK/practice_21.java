package BOOK;

import java.util.Scanner;

/*成绩排名*/
public class practice_21 {
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
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        sc.close();
    }
}
