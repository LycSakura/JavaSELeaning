package study;

import java.util.*;

/*模拟斗地主plus*/
public class video_test_18 {
    public static void main(String[] args) {
//        键是编号，值是牌
        HashMap<Integer, String> hashMap = new HashMap<>();
//        存储编号
        ArrayList<Integer> arrayList = new ArrayList<>();
//        定义花色数组
        String[] colors = {"♦", "♣", "❤", "♠"};
//        定义点数数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2",};
//        存牌
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
//                存序号，和牌
                hashMap.put(index, color + number);
//                存序号
                arrayList.add(index);
//                存一次牌序号加一
                index++;
            }
        }
        hashMap.put(index, "小王");
        arrayList.add(index);
        hashMap.put(++index, "大王");
        arrayList.add(index);
//        洗牌
        Collections.shuffle(arrayList);
//        保证牌是有序的
        TreeSet<Integer> s1 = new TreeSet<>();
        TreeSet<Integer> s2 = new TreeSet<>();
        TreeSet<Integer> s3 = new TreeSet<>();
        TreeSet<Integer> s4 = new TreeSet<>();

        for (int i = 0; i < arrayList.size(); i++) {
//            获取序号
            int x = arrayList.get(i);
            if (i >= arrayList.size() - 3) {
                s4.add(x);
            } else if (i % 3 == 0) {
                s1.add(x);
            } else if (i % 3 == 1) {
                s2.add(x);
            } else {
                s3.add(x);
            }
        }
        look("张三", s1, hashMap);
        look("李四", s2, hashMap);
        look("王五", s3, hashMap);
        look("底牌", s4, hashMap);
    }

    //看牌的方法
    public static void look(String name, TreeSet<Integer> ts, HashMap<Integer, String> hashMap) {
        System.out.println(name + "的牌是:");
        for (Integer key : ts) {
//            通过编号获取牌
            String poker = hashMap.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
