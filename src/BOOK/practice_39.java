package BOOK;

/*鸡是不是鸟*/
public class practice_39 {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Bird bird = new Bird();
        if (kitchen instanceof Bird) {
            System.out.println("鸡是鸟类");
        } else {
            System.out.println("鸡不是鸟类");
        }
    }
}

class Kitchen extends Bird {
    @Override
    public void fly() {
        System.out.println("鸡不会飞");
    }
}

class Bird {
    public void fly() {
        System.out.println("鸟会飞");
    }
}
