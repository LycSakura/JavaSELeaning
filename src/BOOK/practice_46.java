package BOOK;

/*交通灯亮几秒*/
public class practice_46 {
    public static void main(String[] args) {
        show(new RedLight());
        show(new YelloLight());
        show(new GreenLight());
    }

    public static void show(Lights s) {
        if (s instanceof RedLight) {
            System.out.println("红灯亮45秒");
        } else if (s instanceof YelloLight) {
            System.out.println("黄灯亮5秒");
        } else {
            System.out.println("绿灯亮30秒");
        }
    }

}

class Lights {

}

class RedLight extends Lights {
}

class GreenLight extends Lights {
}

class YelloLight extends Lights {
}
