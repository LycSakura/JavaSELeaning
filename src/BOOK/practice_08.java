package BOOK;

/*货车装箱子*/
public class practice_08 {
    public static void main(String[] args) {
        int y1 = 2, x1 = 4;//载货区长4米，宽长2米
        double y2 = 1.5, x2 = 1.5;//箱子长1.5米，宽长1.5米
        double total = (y1 * x1) / (y2 * x2);
        total = (int)total;
        System.out.println("可以放" + total + "个箱子");
    }
}
