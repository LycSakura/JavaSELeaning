package passage_11;

import java.util.Date;

/*毫秒转时间*/
public class practice_09 {
    public static void main(String[] args) {
        Date date0 = new Date();
        date0.setTime(1000);
        System.out.println(date0);

        Date date1 = new Date();
        date1.setTime(100000);
        System.out.println(date1);

        Date date2 = new Date();
        date2.setTime(1000000);
        System.out.println(date2);

        Date date3 = new Date();
        date3.setTime(10000000);
        System.out.println(date3);
    }
}
