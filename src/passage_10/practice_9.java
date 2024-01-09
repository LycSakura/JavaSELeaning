package passage_10;

import java.util.Date;

/*格式化当前时间*/
public class practice_9 {
    public static void main(String[] args) {
        Date date = new Date();
        String time = String.format("%tr", date);
        System.out.println("现在是:" + time);
        System.out.println(date);
    }
}
