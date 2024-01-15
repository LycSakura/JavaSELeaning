package passage_12;

import java.util.*;

/*玩骰子*/
public class comprehensive_exercise_05 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("骰子的点数:");
        System.out.println(list);
        Random random = new Random();
        int index1 = random.nextInt(6);
        int index2 = random.nextInt(6);
        int index3 = random.nextInt(6);
        int index4 = random.nextInt(6);
        Map<String, Object> map = new HashMap<>();
        map.put("张三", list.get(index1));
        map.put("李四", list.get(index2));
        map.put("王五", list.get(index3));
        map.put("赵六", list.get(index4));
        TreeSet<Object> ts = new TreeSet<>();
        ts.add(list.get(index1));
        ts.add(list.get(index2));
        ts.add(list.get(index3));
        ts.add(list.get(index4));
        System.out.println("==========================");
        if (ts.size() != 4) {
            oneByOne(map);
            System.out.println("============================");
            System.out.println("点数相同，重新开始.");
        } else {
            oneByOne(map);
            System.out.println("==========================");
            for (Object key : map.keySet()) {
                if (ts.last().equals(map.get(key))) {
                    System.out.println(key);
                }
            }
        }
    }

    public static void oneByOne(Map map) {
        for (Object key : map.keySet()) {
            System.out.println(key + "：" + map.get(key));
        }
    }
}
