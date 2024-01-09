package passage_14;

import java.util.ArrayList;

/*计算素数*/
public class practice_01 {
    public static void main(String[] args) {
        SingleNumInterface singleNumInterface = (n) -> {
            ArrayList<Integer> arrayList = new ArrayList<>();
            if (n == 1) {
                return new int[]{1};
            }
            for (int i = 2; i <= n; i++) {
                boolean flag = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    arrayList.add(i);
                }
            }
            int[] result = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                result[i] = arrayList.get(i);
            }
            return result;
        };
        int max = 100;
        System.out.println(max + "以内的素数:");
        for (int num : singleNumInterface.getSingleNums(max)) {
            System.out.print(num + " ");
        }
    }
}

interface SingleNumInterface {
    int[] getSingleNums(int max);
}

