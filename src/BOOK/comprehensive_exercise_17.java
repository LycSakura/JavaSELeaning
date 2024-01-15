package BOOK;

import java.util.Scanner;

/*数独*/
public class comprehensive_exercise_17 {
    public static void main(String[] args) {
        int[] row = new int[3];
        int[] col = new int[3];
        int[] sum = new int[2];
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("输入3*3个数:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                row[i] += arr[i][j];//每一行的和保存到row[i]
                col[i] += arr[j][i];//每一列的和保存到col[i]
                if (i == j) {
                    sum[0] += arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    sum[1] += arr[i][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("第" + (i + 1) + "个对角线和为" + sum[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("第" + (i + 1) + "行和为" + row[i]);
            System.out.println("第" + (i + 1) + "列和为" + col[i]);
        }
        row.clone();
        col.clone();
        sum.clone();
        sc.close();
        arr.clone();
    }
}
