package study;

import java.util.Scanner;

public class video_test_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int max, min, sum = 0;
        double average;
        System.out.println("请输入6个评委的分数:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        max = arr[0];
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        average = (sum - max - min) * 1.0 / 4;
        System.out.println("average=" + average);
        sc.close();
    }
}
