package BOOK;

import java.util.Arrays;

/*鸡蛋装箱1*/
public class practice_19 {
    public static void main(String[] args) {
        int[] boxes = new int[10];
        Arrays.fill(boxes, 58);
        for (int i = 0; i < boxes.length; i++) {
            System.out.println("第" + (i + 1) + "个箱子有" + boxes[i] + "个鸡蛋");
        }
        boxes.clone();
    }
}