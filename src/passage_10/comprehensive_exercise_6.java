package passage_10;

import java.util.Scanner;

/*检索图书1*/
public class comprehensive_exercise_6 {
    public static void main(String[] args) {
        String[] book = {"明史讲义", "明代社会生活史", "紫禁城的黄昏", "中国的黄金时代", "国史十六讲", "停滞的帝国", "唐朝定居指南"
                , "明史简述", "明史十讲", "大明风物志", "西方眼中的中国", "皇帝与秀才"};
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要查找的书名或关键字:");
        String name = sc.next();
        System.out.println("-----搜索结果-----");
        for (int i = 0; i < book.length; i++) {
            if (book[i].contains(name)) {
                System.out.println(book[i]);
            }
        }
        sc.close();
    }
}
