package BOOK;

/*打印水果价格*/
public class practice_35 {
    public static void main(String[] args) {
        practice_35 s = new practice_35("糖心富士", "红色", 500, 4.98);
        System.out.println(s.toString());
    }

    private final String name;
    private final String color;
    private final double weight;
    private final double price;

    public String toString() {
        return color + "的苹果被称为" + name + ",每" + (int)weight + "克" + price + "元" + ",买了2500克" + name + ",需支付:" + (float)(2500 / weight * price) + "元";
    }

    public practice_35(String name, String color, double weight, double price) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }
}
