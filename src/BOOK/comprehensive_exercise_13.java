package BOOK;

/*查找素数*/
public class comprehensive_exercise_13 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (fact(i) == 1) {
                System.out.println(i + "是素数");
                count++;
            }
        }
        System.out.println("素数有" + count + "个");
    }

    public static int fact(int i) {
        int flag = 1;
        if (i == 1) {
            flag = 0;
        }
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }
        return flag;
    }
//        int count = 0;
//        for (int i = 1; i < 101; i++) {
//            boolean flag = true;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    flag = false;
//                }
//            }
//            if (flag) {
//                count += 1;
//                System.out.print(i + ",");
//            }
//        }
//        System.out.println("素数有" + count + "个");
//    }
}
