package passage_11;

import java.util.Calendar;

/*打印日历*/
public class comprehensive_exercise_01 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(); // 创建字符串序列
        Calendar c = Calendar.getInstance(); // 创建Calendar对象
        int year = c.get(Calendar.YEAR); // 获取当前年份
        int month = c.get(Calendar.MONTH) + 1; // 获取当前月份
        c.add(Calendar.MONTH, 1); // 给月数加1
        c.set(Calendar.DAY_OF_MONTH, 0); // 某月中的某天
        int dayCount = c.get(Calendar.DAY_OF_MONTH); //获取当前月份的天数
        c.set(Calendar.DAY_OF_MONTH, 1); //
        int week = c.get(Calendar.DAY_OF_WEEK); //
        int day = 1; // 天数从一号开始
        str.append("\t\t" + year + "-" + month + "\n");
        str.append("日\t一\t二\t三\t四\t五\t六\n");
        for (int i = 1; i <= 7; i++) {//打印日历的第一行
            if (i < week) {
                str.append("\t");
            } else {
                str.append(day + "\t");
                day++;
            }
        }
        str.append("\n");
        int i = 1;
        while (day <= dayCount) {//打印日历的剩下部分
            str.append(day + "\t");
            if (i % 7 == 0) {//每七天换行
                str.append("\n");
            }
            i++;
            day++;
        }
        System.out.println(str);
    }
}
