package study;



import java.util.Scanner;

public class video_test_06 {
    public static void main(String[] args) {
        int[] arr = {19, 19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("输入你想找的数:");
        int num = sc.nextInt();
        search(arr, num);
        sc.close();
    }

    public static void search(int [] arr, int num) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("index=" + i);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("未找到该数");
        }
    }
}
