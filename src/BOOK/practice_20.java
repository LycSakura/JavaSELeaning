package BOOK;

import java.util.Arrays;

/*鸡蛋装箱2*/
public class practice_20 {
    public static void main(String[] args) {
//        int arr[] = new int[10];
//        Arrays.fill(arr, 0, 4, 60);
//        Arrays.fill(arr, 4, 10, 58);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("第" + (i + 1) + "个箱子有" + arr[i] + "个鸡蛋");
//        }
        int[] boxes = new int[10];
        Arrays.fill(boxes, 60);
        for (int i = 0; i < boxes.length; i++) {
            if (i < 4) {
                System.out.println("第" + (i + 1) + "个箱子有" + boxes[i] + "个鸡蛋");
            }
        }
        Arrays.fill(boxes, 58);
        for (int i = 4; i < boxes.length; i++) {
            System.out.println("第" + (i + 1) + "个箱子有" + boxes[i] + "个鸡蛋");
        }
        boxes.clone();
    }
}
