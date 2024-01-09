package passage_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*中文格式日期改英文格式*/
public class practice_10 {
    public static void main(String[] args) {
        String time = "现在是2021年08月08日13点20分05秒";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("现在是yyyy年HH月dd日HH点mm分ss秒");
        Date date = null;
        try {
            date = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy/HH/dd HH:mm:ss");
        System.out.println(s1.format(date));
    }
}
