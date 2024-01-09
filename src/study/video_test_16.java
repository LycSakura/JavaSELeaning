package study;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class video_test_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str = sc.next();

//        HashMap<Character, Integer> hashMap = new HashMap<>();
        TreeMap<Character, Integer> TreeMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            Integer value = TreeMap.get(key);
            if (value == null) {
                TreeMap.put(key, 1);
            } else {
                value++;
                TreeMap.put(key, value);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = TreeMap.keySet();
        for (Character key : keySet) {
            Integer value = TreeMap.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String result = sb.toString();
        System.out.println(result);
        sc.close();
    }
}
