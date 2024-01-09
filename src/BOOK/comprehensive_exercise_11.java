package BOOK;

/*计算1~20的阶乘的倒数之和*/
public class comprehensive_exercise_11 {
    public static void main(String[] args) {
//        double sum = 0;
//        int i = 1;
//        while (i <= 20) {
//            sum += 1/item(i);
//            i++;
//        }
//        System.out.println(sum);
//    }
//
//    public static double item(int i) {
//        double item = 1;
//        for (int x = 1; x <= i; x++) {
//            item *= x;
//        }
//        return item;
        double sum = 0, a = 1;
        int i = 1;
        while (i <= 20) {
            sum = sum + a;
            i = i + 1;
            a = a * (1.0 / i);
        }
        System.out.println(sum);
    }
}
