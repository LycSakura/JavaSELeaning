package passage_13;

/*月份枚举*/
public class practice_01 {
    public static void main(String[] args) {
        Month[] months = Month.values();
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }
}

enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
}
