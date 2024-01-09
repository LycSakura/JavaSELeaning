package passage_12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class practice_06 {
    public static void main(String[] args) {
        System.out.println("请五位评委打分:");
        Scanner sc = new Scanner(System.in);
        String score = sc.next();
        String[] scores = score.split(",");//用split方法分隔字符串
        int score1 = Integer.parseInt(scores[0]);//将字符串转换为int型
        int score2 = Integer.parseInt(scores[1]);
        int score3 = Integer.parseInt(scores[2]);
        int score4 = Integer.parseInt(scores[3]);
        int score5 = Integer.parseInt(scores[4]);
        HashMap<String, Integer> hm = new HashMap<>(); //创建映射
        hm.put("冰人格文", score1);
        hm.put("穆大叔", score2);
        hm.put("魔术师约翰逊", score3);
        hm.put("大鲨鱼奥尼尔", score4);
        hm.put("麦蒂", score5);
        int total = 0;
        Iterator<String> it = hm.keySet().iterator();//创建迭代器
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + "打:" + hm.get(key) + "分");
            total += (int) hm.get(key);
        }
        System.out.println();
        System.out.println("总分:" + total);
        sc.close();
    }
}
