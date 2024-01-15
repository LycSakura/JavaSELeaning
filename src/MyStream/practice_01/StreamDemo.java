package MyStream.practice_01;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("林青霞");
        arrayList.add("张曼玉");
        arrayList.add("王祖贤");
        arrayList.add("柳岩");
        arrayList.add("张敏");
        arrayList.add("张无忌");
/*
        ArrayList<String> zhangList = new ArrayList<>();
        for (String s : arrayList) {
            if (s.startsWith("张")) {
                zhangList.add(s);
            }
        }
        System.out.println(zhangList);
        ArrayList<String> threeList = new ArrayList<>();
        for (String s : zhangList) {
            if (s.length() == 3) {
                threeList.add(s);
            }
        }
        System.out.println(threeList);
*/
        arrayList.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
