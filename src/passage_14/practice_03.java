package passage_14;

import java.util.Arrays;

public class practice_03 {
    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 5, 2, 6, 3};
        //创建
        Sortable s = Arrays::sort;
        s.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}

interface Sortable {
    void sort(int[] arr);
}

