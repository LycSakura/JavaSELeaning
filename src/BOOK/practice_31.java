package BOOK;

/*创建猫类*/
public class practice_31 {
    String color;

    public static void main(String[] args) {
        practice_31 black_car = new practice_31("black");
        black_car.catch_mouse();
        practice_31 white_cat = new practice_31("white");
        white_cat.catch_mouse();
        practice_31 yellow_cat = new practice_31("yellow");
        yellow_cat.catch_mouse();
    }

    public practice_31(String color) {
        this.color = color;
    }

    public void catch_mouse() {
        System.out.println(color + "-cat,抓老鼠");
    }

}
