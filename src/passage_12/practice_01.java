package passage_12;

import java.util.ArrayList;
import java.util.List;

/*输出NBA历史十大球星*/
public class practice_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("乔丹\t\t飞人/神\t30.1\t6.2\t\t5.3");
        list.add("拉塞尔\t指环王\t15.1\t22.5\t4.3");
        list.add("贾巴尔\t夭钩\t\t24.6\t11.2\t3.6");
        list.add("张伯伦\t篮球皇帝\t30.1\t22.9\t4.4");
        list.add("约翰逊\t魔术师\t19.5\t7.2\t\t11.2");
        list.add("伯德\t\t大鸟\t\t24.3\t10.0\t6.3");
        list.add("邓肯\t\t石佛\t\t20.7\t11.4\t3.2");
        list.add("科比\t\t黑曼巴\t25.1\t5.3\t\t4.7");
        list.add("奥尼尔\t大鲨鱼\t23.7\t10.9\t2.5");
        list.add("奥拉朱旺\t大梦\t\t21.8\t11.1\t2.5");
        System.out.println("----------NBA历史十大巨星--------");
        System.out.println("球员\t\t编号\t\t得分\t\t篮板\t\t助攻");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
