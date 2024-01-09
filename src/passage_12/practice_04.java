package passage_12;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;

/*模拟当当网购车*/
public class practice_04 {
    public static void main(String[] args) {
        HashSet<Book> shoppingcar = new HashSet<>();
        Book[] books = {new Book("java从入门到精通<第3版>", "明日科技编著", 59.8),
                new Book("java Wed从入门到精通\t", "明日科技编著", 69.8),
                new Book("java从入门到精通<实例版>", "明日科技编著", 69.8)};
        shoppingcar.add(books[0]);
        shoppingcar.add(books[1]);
        shoppingcar.add(books[2]);
        Iterator<Book> it = shoppingcar.iterator();
        System.out.println("您购物车里的商品信息\n书名\t\t\t\t\t\t作者（团队）\t价格");
        System.out.println("---------------------------------------------");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("---------------------------------------------");
        double sum = books[0].getPrice() + books[1].getPrice() + books[2].getPrice();
        DecimalFormat decimalFormat = new DecimalFormat();
        String result = decimalFormat.format(sum);
        System.out.println("合计\t\t\t\t\t\t\t\t\t\t" + result + "元\n\t\t\t\t\t\t\t\t\t\t——>点我去结账");

    }
}

class Book {
    private final String name;
    private final String author;
    private final double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + "\t" + author + "\t" + price + "元";
    }
}

