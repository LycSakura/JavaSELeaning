package passage_12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class practice_05 {
    public static void main(String[] args) {
        Map<String, String[]> map = new HashMap<>();
        map.put("辽宁", new String[]{"沈阳, 大连, 鞍山"});
        map.put("吉林", new String[]{"长春, 吉林, 四平"});
        map.put("黑龙江", new String[]{"哈尔滨, 齐齐哈尔, 牡丹江"});
        Iterator<String> iter = map.keySet().iterator();
        while (iter.hasNext()) {
            Object province = iter.next();
            System.out.println(province + "省");
            String[] val = (String[]) map.get(province);
            for (String s : val) {
                System.out.print(s);
            }
            System.out.println("\n");
        }
    }
}
