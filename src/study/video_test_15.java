package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class video_test_15 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("诸葛亮");
        arr1.add("赵云");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("唐增");
        arr2.add("孙悟空");
        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("武松");
        arr3.add("鲁智深");
        hashMap.put("三国演义", arr1);
        hashMap.put("西游记", arr2);
        hashMap.put("水浒传", arr3);
        Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            ArrayList<String> value = hashMap.get(key);
            System.out.print(key + ":");
            for (String s : value) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
