package BOOK;

/*水池放水*/
public class practice_28 {
    public static double water = 0;

    public static void out_Water() {
        if (water >= 2) {
            water -= 2;
        } else {
            water = 0;
        }
    }

    public static void in_water() {
        water += 3;
    }


    public static void main(String[] args) {
        System.out.println("刚开始水量:" + practice_28.water);
        practice_28.in_water();
        System.out.println("加水后水量:"+practice_28.water);
        practice_28.out_Water();
        System.out.println("放水后水量:"+practice_28.water);
    }
}
