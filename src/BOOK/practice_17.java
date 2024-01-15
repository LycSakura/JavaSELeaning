package BOOK;

/*模拟书柜放书*/
public class practice_17 {
    public static void main(String[] args) {
        String[][] book = new String[3][2];
        book[0][0] = "历史类读物";
        book[1][0] = "经济类读物";
        book[1][1] = "现代科学类读物";
        System.out.println("第一排第一列:" + book[0][0]);
        System.out.println("第二排第一列:" + book[1][0]);
        System.out.println("第二排第二列:" + book[1][1]);
        book.clone();
    }
}
