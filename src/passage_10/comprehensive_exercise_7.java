package passage_10;

import java.util.Locale;
import java.util.Scanner;

/*检索图书2*/
public class comprehensive_exercise_7 {
    public static void main(String[] args) {
        String[] books1 = {"<<Java>>", "<<JavaWed>>", "<<C语言>>", "<<C++>>", "<<Linux C>>"};
        String[] books2 = {"<<论语>>", "<<资治通鉴>>", "<<四十二章经>>", "<<史记>>", "<<隋唐使>>"};
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要查找的书或关键字:");
        String message = sc.next();
        System.out.println("-----搜索结果-----");
        for (int i = 0; i < books1.length; i++) {
            if (books1[i].contains(message) || books1[i].toLowerCase().contains(message)) {
                System.out.println(books1[i] + "第1个书柜里的第" + (i + 1) + "本书");
            }
        }
        for (int i = 0; i < books2.length; i++) {
            if (books2[i].contains(message)) {
                System.out.println(books2[i] + "第2个书柜里的第" + (i + 1) + "本书");
            }
        }
    }
}
