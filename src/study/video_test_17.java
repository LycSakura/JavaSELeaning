package study;
/*模拟斗地主*/

import java.util.ArrayList;
import java.util.Collections;

public class video_test_17 {
    public static void main(String[] args) {
        /*创建牌盒*/
        ArrayList<String> array = new ArrayList<>();
//        装牌

//        定义花色数组
        String[] colors = {"♦", "♣", "❤", "♠"};
//        定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");
        //洗牌
        Collections.shuffle(array);

        //发牌
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        ArrayList<String> s3 = new ArrayList<>();
        //底牌
        ArrayList<String> s4 = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);

            if (i >= array.size() - 3) {
                s4.add(poker);//存入底牌
            } else if (i % 3 == 0) {
                s1.add(poker);
            } else if (i % 3 == 1) {
                s2.add(poker);
            } else {
                s3.add(poker);
            }
        }
        look("张三", s1);
        look("李四", s2);
        look("王五", s3);
        look("底牌", s4);
    }

    //看牌的方法
    public static void look(String name, ArrayList<String> array) {
        System.out.println(name + "的牌是:");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}

