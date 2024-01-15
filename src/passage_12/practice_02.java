package passage_12;

import java.util.*;

/*给图书排序*/
public class practice_02 {
    public static void main(String[] args) {
        // 初始化书桌和书架上的书籍
        List<String> deskBooks = new ArrayList<>(Arrays.asList("西游记", "水浒传"));
        List<String> shelfBooks = new ArrayList<>(Arrays.asList("三国演义", "莎士比亚诗选", "红楼梦"));

        // 按指定顺序进行排序
        List<String> orderedBooks = new ArrayList<>();
        orderedBooks.add(deskBooks.get(deskBooks.indexOf("水浒传")));
        orderedBooks.add(shelfBooks.get(shelfBooks.indexOf("三国演义")));
        orderedBooks.add(deskBooks.get(deskBooks.indexOf("西游记")));
        orderedBooks.add(shelfBooks.get(shelfBooks.indexOf("红楼梦")));

        // 输出排序后的书籍
        System.out.println("排序后的书籍顺序：");
        for (String book : orderedBooks) {
            System.out.println(book);
        }
    }
}
