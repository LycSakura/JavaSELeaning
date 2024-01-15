package passage_12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*寻找梁山好汉*/
public class comprehensive_exercise_04 {
    public static void main(String[] args) {
        HashMap<String, String> set = new HashMap<String, String>();
        set.put("呼保义", "宋江");
        set.put("玉麒麟", "卢俊义");
        set.put("智多星", "吴用");
        set.put("入云龙", "公孙胜");
        set.put("大刀", "关胜");
        set.put("豹子头", "林冲");
        set.put("霹雳火", "秦明");
        set.put("双鞭", "呼延灼");
        set.put("小李广", "花荣");
        set.put("小旋风", "柴进");
        Iterator<String> it = set.keySet().iterator();
        String key;
        while (it.hasNext()) {
            key = (String) it.next();
            System.out.println(key + ":" + set.get(key));
        }
        System.out.println();
        System.out.println("输入一位梁山好汉的绰号:");
        Scanner sc = new Scanner(System.in);
        key = sc.next().trim();
        System.out.println(key + ":" + set.get(key));
        sc.close();
    }
}
