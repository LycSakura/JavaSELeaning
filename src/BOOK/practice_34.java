package BOOK;

public class practice_34 {
    public static void main(String[] args) {
        Fruit s1 = new Fruit();
        s1.price = 50;
        s1.show_price();
        PackageFruit s2 = new PackageFruit();
        s2.price = 100;
        s2.show_price();
    }
}
class Fruit{
    double price;
    public void show_price(){
        System.out.println("普通水果的价格:"+price);
    }

}
class PackageFruit extends Fruit{
    public void show_price() {
        System.out.println("人工包装的水果的价格:"+price);
    }
}
