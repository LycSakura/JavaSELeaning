package BOOK;

import java.util.Scanner;

/*杨辉三角*/
public class comprehensive_exercise_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你想要的行数:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
        }
        for (int i = 2; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i >= j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
        arr.clone();
    }
}
