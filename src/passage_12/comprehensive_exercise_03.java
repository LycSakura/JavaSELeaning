package passage_12;

import java.util.Random;
import java.util.TreeSet;

/*给随机数组排序*/
public class comprehensive_exercise_03 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Random ran = new Random();
        int count = 0;
        while (count < 10) {
            boolean sucess = set.add(ran.nextInt(100));
            if (sucess) {
                count++;
            }
        }
        int size = set.size();
        Integer[] array = new Integer[size];
        Integer[] Array = set.toArray(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
