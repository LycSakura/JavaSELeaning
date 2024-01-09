package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class video_test_14 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("孙策", "大乔");
        hm1.put("周瑜", "小乔");
        arrayList.add(hm1);
        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
        arrayList.add(hm2);
        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");
        arrayList.add(hm3);
        for (HashMap<String, String> s : arrayList) {
            Set<String> keySet = s.keySet();
            for (String key : keySet) {
                System.out.println(key + ":" + s.get(key));
            }
        }
    }
}
