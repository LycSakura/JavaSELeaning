package passage_12;

import java.util.Comparator;
import java.util.TreeSet;

/*使用TreeSet类排序*/
public class practice_03 {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(new CustomComparator());

        set.add(-5);
        set.add(-7);
        set.add(3);
        set.add(6);
        set.add(10);

        System.out.println("定制排序后的结果：");
        for (int num : set) {
            System.out.println(num);
        }
    }

    static class CustomComparator implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return b - a; // 逆序排序
        }
    }
}

